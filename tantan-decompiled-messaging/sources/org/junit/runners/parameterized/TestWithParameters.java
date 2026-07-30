package org.junit.runners.parameterized;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.runners.model.TestClass;
import p149l.jfd0;

/* JADX INFO: loaded from: classes3.dex */
public class TestWithParameters {
    private final String name;
    private final List<Object> parameters;
    private final TestClass testClass;

    public TestWithParameters(String str, TestClass testClass, List<Object> list) {
        notNull(str, "The name is missing.");
        notNull(testClass, "The test class is missing.");
        notNull(list, "The parameters are missing.");
        this.name = str;
        this.testClass = testClass;
        this.parameters = Collections.unmodifiableList(new ArrayList(list));
    }

    private static void notNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        jfd0.m141176a(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestWithParameters testWithParameters = (TestWithParameters) obj;
        return this.name.equals(testWithParameters.name) && this.parameters.equals(testWithParameters.parameters) && this.testClass.equals(testWithParameters.testClass);
    }

    public String getName() {
        return this.name;
    }

    public List<Object> getParameters() {
        return this.parameters;
    }

    public TestClass getTestClass() {
        return this.testClass;
    }

    public int hashCode() {
        return ((((this.name.hashCode() + 14747) * 14747) + this.testClass.hashCode()) * 14747) + this.parameters.hashCode();
    }

    public String toString() {
        return this.testClass.getName() + " '" + this.name + "' with parameters " + this.parameters;
    }
}
