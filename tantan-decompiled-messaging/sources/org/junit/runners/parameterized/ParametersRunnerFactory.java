package org.junit.runners.parameterized;

import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: classes3.dex */
public interface ParametersRunnerFactory {
    Runner createRunnerForTestWithParameters(TestWithParameters testWithParameters) throws InitializationError;
}
