package org.tillery.schema.datafetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import jakarta.annotation.Generated;
import java.util.List;
import org.tillery.schema.types.Thing;

@Generated(
    value = "com.netflix.graphql.dgs.codegen.CodeGen",
    date = "2024-12-18T02:45:31.231119Z"
)
@org.tillery.schema.Generated
@DgsComponent
public class FetchThingsDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "fetchThings"
  )
  public List<Thing> getFetchThings(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
