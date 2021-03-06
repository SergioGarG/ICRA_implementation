package se.gu.co4robots.xtext.promise.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import se.gu.co4robots.xtext.promise.PromiseRuntimeModule;
import se.gu.co4robots.xtext.promise.PromiseStandaloneSetup;
import se.gu.co4robots.xtext.promise.ide.PromiseIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class PromiseIdeSetup extends PromiseStandaloneSetup {
  @Override
  public Injector createInjector() {
    PromiseRuntimeModule _promiseRuntimeModule = new PromiseRuntimeModule();
    PromiseIdeModule _promiseIdeModule = new PromiseIdeModule();
    return Guice.createInjector(Modules2.mixin(_promiseRuntimeModule, _promiseIdeModule));
  }
}
