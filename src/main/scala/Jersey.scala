// Jersey
import java.util.function.Function

import javax.inject.{Inject, Provider}
import org.glassfish.hk2.api.ServiceLocator
import org.glassfish.jersey.server.ContainerRequest
import org.glassfish.jersey.server.internal.inject.{
  AbstractValueParamProvider,
  MultivaluedParameterExtractorProvider,
  ParamInjectionResolver
}
import org.glassfish.jersey.server.model.Parameter
import org.glassfish.jersey.server.spi.internal.ValueParamProvider

// class MyFactoryProvider @Inject()(mpep: MultivaluedParameterExtractorProvider, locator: ServiceLocator)
//     extends AbstractValueParamProvider(
//     //   () => mpep,
//           new Provider[MultivaluedParameterExtractorProvider] {
//         override def get(): MultivaluedParameterExtractorProvider = mpep
//       },
//       org.glassfish.jersey.model.Parameter.Source.UNKNOWN
//     ) {

//   override def createValueProvider(parameter: Parameter): Function[ContainerRequest, _] =
//   (request: ContainerRequest) => ""

//     }
