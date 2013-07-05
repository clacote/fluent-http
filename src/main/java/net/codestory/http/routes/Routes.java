package net.codestory.http.routes;

import net.codestory.http.filters.*;

public interface Routes {
  void staticDir(String fileOrClassPathDir);

  void filter(Filter filter);

  void add(Object resource);

  void add(String urlPrefix, Object resource);

  void get(String uriPattern, Route route);

  void get(String uriPattern, OneParamRoute route);

  void get(String uriPattern, TwoParamsRoute route);

  void get(String uriPattern, ThreeParamsRoute route);

  void get(String uriPattern, FourParamsRoute route);
}
