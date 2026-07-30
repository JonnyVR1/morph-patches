package org.junit.experimental.max;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l.mhi0;
import l.uhi0;
import l.yjw;
import org.junit.internal.requests.SortingRequest;
import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.Runner;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MaxCore {
    private static final String MALFORMED_JUNIT_3_TEST_CLASS_PREFIX = "malformed JUnit 3 test class: ";
    private final MaxHistory history;

    private MaxCore(File file) {
        this.history = MaxHistory.forFolder(file);
    }

    private Runner buildRunner(Description description) {
        if (description.toString().equals("TestSuite with 0 tests")) {
            return Suite.emptySuite();
        }
        if (description.toString().startsWith(MALFORMED_JUNIT_3_TEST_CLASS_PREFIX)) {
            return new JUnit38ClassRunner((mhi0) new uhi0(getMalformedTestClass(description)));
        }
        Class<?> testClass = description.getTestClass();
        if (testClass != null) {
            String methodName = description.getMethodName();
            return methodName == null ? Request.aClass(testClass).getRunner() : Request.method(testClass, methodName).getRunner();
        }
        yjw.a("Can't build a runner from description [", description, "]");
        return null;
    }

    private Request constructLeafRequest(List<Description> list) {
        final ArrayList arrayList = new ArrayList();
        Iterator<Description> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(buildRunner(it.next()));
        }
        return new Request() { // from class: org.junit.experimental.max.MaxCore.1
            @Override // org.junit.runner.Request
            public Runner getRunner() {
                try {
                    return new Suite(null, arrayList) { // from class: org.junit.experimental.max.MaxCore.1.1
                    };
                } catch (InitializationError e) {
                    return new ErrorReportingRunner(null, e);
                }
            }
        };
    }

    private void findLeaves(Description description, Description description2, List<Description> list) {
        if (!description2.getChildren().isEmpty()) {
            Iterator<Description> it = description2.getChildren().iterator();
            while (it.hasNext()) {
                findLeaves(description2, it.next(), list);
            }
        } else {
            if (!description2.toString().equals("warning(junit.framework.TestSuite$1)")) {
                list.add(description2);
                return;
            }
            list.add(Description.createSuiteDescription(MALFORMED_JUNIT_3_TEST_CLASS_PREFIX + description, new Annotation[0]));
        }
    }

    @Deprecated
    public static MaxCore forFolder(String str) {
        return storedLocally(new File(str));
    }

    private Class<?> getMalformedTestClass(Description description) {
        try {
            return Class.forName(description.toString().replace(MALFORMED_JUNIT_3_TEST_CLASS_PREFIX, ""));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static MaxCore storedLocally(File file) {
        return new MaxCore(file);
    }

    public Result run(Request request, JUnitCore jUnitCore) {
        jUnitCore.addListener(this.history.listener());
        return jUnitCore.run(sortRequest(request).getRunner());
    }

    public Request sortRequest(Request request) {
        if (request instanceof SortingRequest) {
            return request;
        }
        List<Description> listFindLeaves = findLeaves(request);
        Collections.sort(listFindLeaves, this.history.testComparator());
        return constructLeafRequest(listFindLeaves);
    }

    public List<Description> sortedLeavesForTest(Request request) {
        return findLeaves(sortRequest(request));
    }

    public Result run(Request request) {
        return run(request, new JUnitCore());
    }

    public Result run(Class<?> cls) {
        return run(Request.aClass(cls));
    }

    private List<Description> findLeaves(Request request) {
        ArrayList arrayList = new ArrayList();
        findLeaves(null, request.getRunner().getDescription(), arrayList);
        return arrayList;
    }
}
