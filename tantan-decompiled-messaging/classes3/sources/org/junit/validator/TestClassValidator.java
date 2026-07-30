package org.junit.validator;

import java.util.List;
import org.junit.runners.model.TestClass;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface TestClassValidator {
    List<Exception> validateTestClass(TestClass testClass);
}
