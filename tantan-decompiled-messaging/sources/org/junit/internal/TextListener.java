package org.junit.internal;

import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/* JADX INFO: loaded from: classes3.dex */
public class TextListener extends RunListener {
    private final PrintStream writer;

    public TextListener(JUnitSystem jUnitSystem) {
        this(jUnitSystem.out());
    }

    private PrintStream getWriter() {
        return this.writer;
    }

    public String elapsedTimeAsString(long j) {
        return NumberFormat.getInstance().format(j / 1000.0d);
    }

    public void printFailure(Failure failure, String str) {
        getWriter().println(str + ") " + failure.getTestHeader());
        getWriter().print(failure.getTrace());
    }

    public void printFailures(Result result) {
        List<Failure> failures = result.getFailures();
        if (failures.size() == 0) {
            return;
        }
        int i = 1;
        if (failures.size() == 1) {
            getWriter().println("There was " + failures.size() + " failure:");
        } else {
            getWriter().println("There were " + failures.size() + " failures:");
        }
        Iterator<Failure> it = failures.iterator();
        while (it.hasNext()) {
            printFailure(it.next(), "" + i);
            i++;
        }
    }

    public void printFooter(Result result) {
        if (result.wasSuccessful()) {
            getWriter().println();
            getWriter().print("OK");
            PrintStream writer = getWriter();
            StringBuilder sb = new StringBuilder(" (");
            sb.append(result.getRunCount());
            sb.append(" test");
            sb.append(result.getRunCount() == 1 ? "" : BLiveStormDanmakuGiftResourceType.f44446s);
            sb.append(")");
            writer.println(sb.toString());
        } else {
            getWriter().println();
            getWriter().println("FAILURES!!!");
            getWriter().println("Tests run: " + result.getRunCount() + ",  Failures: " + result.getFailureCount());
        }
        getWriter().println();
    }

    public void printHeader(long j) {
        getWriter().println();
        getWriter().println("Time: " + elapsedTimeAsString(j));
    }

    @Override // org.junit.runner.notification.RunListener
    public void testFailure(Failure failure) {
        this.writer.append('E');
    }

    @Override // org.junit.runner.notification.RunListener
    public void testIgnored(Description description) {
        this.writer.append('I');
    }

    @Override // org.junit.runner.notification.RunListener
    public void testRunFinished(Result result) {
        printHeader(result.getRunTime());
        printFailures(result);
        printFooter(result);
    }

    @Override // org.junit.runner.notification.RunListener
    public void testStarted(Description description) {
        this.writer.append('.');
    }

    public TextListener(PrintStream printStream) {
        this.writer = printStream;
    }
}
