package be.daggie.microservices.sync;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/address")
@Produces(MediaType.APPLICATION_JSON)
public class AddressResource {

	private AddressRepository repository;

	public AddressResource() {
		repository = new AddressRepository();
	}

	@GET
	public Address getAddress(@QueryParam("id") Long id) {
		return repository.getAddress(id);
	}
}
