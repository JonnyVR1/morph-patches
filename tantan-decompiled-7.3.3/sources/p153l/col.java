package p153l;

import com.immomo.utils.network.exception.HttpBaseException;
import com.immomo.utils.network.exception.HttpResponseStatusErrorException;
import com.immomo.utils.tools.TraceData;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.net.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class col {

    /* JADX INFO: renamed from: a */
    private static volatile rg50 f82896a;

    /* JADX INFO: renamed from: b */
    private static volatile rg50 f82897b;

    /* JADX INFO: renamed from: a */
    public static i5d0 m111670a(String str, String str2, ag60 ag60Var, bej0 bej0Var) throws Exception {
        if (bej0Var != null) {
            bej0Var.mo103704a(xiw.m211172c(), TraceData.m20516a(TraceData.LogNode.PREPARE_TO_SEND_NETWORK_REQUEST, ag60Var, "", new Object[0]));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 1;
        i5d0 i5d0Var = null;
        int i2 = 1;
        while (true) {
            if (i2 > 4) {
                if (bej0Var != null) {
                    bej0Var.mo103704a(xiw.m211172c(), TraceData.m20516a(TraceData.LogNode.NETWORK_REQUEST_FAILED, ag60Var, riw.m181611a(new byte[]{-41, -37, -96, -48, -38, -6, -40, -55, -122, -47, -48, -28, -43, -62, -128, -33, -43, -61, -33, -38, -67, -33, -50, -47, -41, -50, PSSSigner.TRAILER_IMPLICIT, -46, -15, -24, -39, -31, PSSSigner.TRAILER_IMPLICIT, -33, -50, -13}), new Object[0]));
                }
                throw new HttpBaseException(riw.m181611a(new byte[]{-41, -37, -96, -48, -38, -6, -40, -55, -122, -47, -48, -28, -43, -62, -128, -33, -43, -61, -33, -38, -67, -33, -50, -47, -41, -50, PSSSigner.TRAILER_IMPLICIT, -46, -15, -24, -39, -31, PSSSigner.TRAILER_IMPLICIT, -33, -50, -13}));
            }
            if (bej0Var != null) {
                try {
                    bej0Var.mo103704a(xiw.m211172c(), TraceData.m20516a(TraceData.LogNode.SEND_NETWORK_REQUEST_TIMES, ag60Var, "", Integer.valueOf(i2)));
                } catch (HttpResponseStatusErrorException e) {
                    if (bej0Var != null) {
                        bej0Var.mo103704a(xiw.m211172c(), TraceData.m20516a(TraceData.LogNode.NETWORK_REQUEST_FAILED_TIMES, ag60Var, riw.m181611a(new byte[]{120, 18, 69, 71, 51, 3, 67, 22, 94, 89, 18, 3, 99, 18, 80, 67, 20, 21, 117, 20, 67, 88, 19, 35, 72, 5, 84, 71, 21, 15, 95, 8, 11}) + e.getMessage(), Integer.valueOf(i2)));
                    }
                    throw e;
                } catch (Throwable th) {
                    int i3 = i2 + 1;
                    if (i3 <= 4) {
                        try {
                            if (System.currentTimeMillis() - jCurrentTimeMillis <= HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
                                if (bej0Var != null) {
                                    bej0Var.mo103704a(xiw.m211172c(), TraceData.m20516a(TraceData.LogNode.WAIT_ONE_SECOND_AND_REQUEST_AGAIN, ag60Var, riw.m181611a(new byte[]{100, 14, 67, 88, 22, 7, 82, 10, 84, HttpTokens.CARRIAGE_RETURN}) + th.getMessage(), Integer.valueOf(i2)));
                                }
                                Thread.sleep(1000L);
                                if (0 != 0 && i5d0Var.m138670k() != null) {
                                    i5d0Var.m138670k().close();
                                }
                                i2 = i3;
                                i = 1;
                            }
                        } catch (Throwable th2) {
                            if (0 != 0 && i5d0Var.m138670k() != null) {
                                i5d0Var.m138670k().close();
                            }
                            throw th2;
                        }
                    }
                    if (bej0Var != null) {
                        bej0Var.mo103704a(xiw.m211172c(), TraceData.m20516a(TraceData.LogNode.REQUEST_TIMED_OUT, ag60Var, riw.m181611a(new byte[]{100, 14, 67, 88, 22, 7, 82, 10, 84, HttpTokens.CARRIAGE_RETURN}) + th.getMessage(), Integer.valueOf(i2)));
                    }
                    throw th;
                }
            }
            i5d0 i5d0VarM111671b = i2 > i ? m111671b(str, str2, ag60Var, i) : m111671b(str, str2, ag60Var, 0);
            int iM138673q = i5d0VarM111671b.m138673q();
            if (iM138673q < 200 || iM138673q > 299) {
                throw new HttpResponseStatusErrorException(iM138673q);
            }
            if (bej0Var != null) {
                bej0Var.mo103704a(xiw.m211172c(), TraceData.m20516a(TraceData.LogNode.NETWORK_REQUEST_SUCCESSFUL_TIMES, ag60Var, "", Integer.valueOf(i2)));
            }
            return i5d0VarM111671b;
        }
    }

    /* JADX INFO: renamed from: b */
    private static i5d0 m111671b(String str, String str2, ag60 ag60Var, int i) throws Exception {
        rg50 rg50VarM111672c;
        l1j l1jVarM152498b = new l1j.C18332a().m152497a(riw.m181611a(new byte[]{93, 28, 88, 71}), str2).m152497a(riw.m181611a(new byte[]{81, 22, 65, 89, 0, 11, 85}), ag60Var.f71092f).m152497a(riw.m181611a(new byte[]{95, 21}), riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84})).m152497a(riw.m181611a(new byte[]{67, Tnaf.POW_2_WIDTH}), xiw.m211171b()).m152498b();
        if (i != 0) {
            rg50VarM111672c = i != 1 ? null : m111673d();
        } else {
            rg50VarM111672c = m111672c();
        }
        x1d0 x1d0VarM209028b = new x1d0.C21228a().m209043q(str).m209034h(riw.m181611a(new byte[]{115, 9, 95, 89, 4, 5, 68, 15, 94, 89}), riw.m181611a(new byte[]{83, 10, 94, 68, 4})).m209034h(riw.m181611a(new byte[]{115, 14, 80, 69, 18, 3, 68}), riw.m181611a(new byte[]{101, 50, 119, 26, 89})).m209034h(riw.m181611a(new byte[]{113, 5, 82, 82, 17, 18, 29, 42, 80, 89, 6, 19, 81, 1, 84}), riw.m181611a(new byte[]{74, 14, 28, 116, 47})).m209034h(riw.m181611a(new byte[]{101, 21, 84, 69, 76, 39, 87, 3, 95, 67}), ag60Var.f71091e).m209034h(riw.m181611a(new byte[]{115, 9, 95, 67, 4, 8, 68, 75, 101, 78, 17, 3}), riw.m181611a(new byte[]{81, 22, 65, 91, 8, 5, 81, 18, 88, 88, 15, 73, 72, 75, 70, 64, 22, 75, 86, 9, 67, 90, 76, 19, 66, 10, 84, 89, 2, 9, 84, 3, 85})).m209034h(riw.m181611a(new byte[]{83, 9, 94, 92, 8, 3}), riw.m181611a(new byte[]{99, 35, 98, 100, 40, 41, 126, 47, 117, 10}) + ag60Var.f71089c).m209038l(l1jVarM152498b).m209028b();
        if (rg50VarM111672c != null) {
            return rg50VarM111672c.mo181341a(x1d0VarM209028b).execute();
        }
        wtq0.m207906a(riw.m181611a(new byte[]{120, 18, 69, 71, 34, 10, 89, 3, 95, 67, 65, 15, 67, 70, 95, 66, HttpTokens.CARRIAGE_RETURN, 10}));
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static rg50 m111672c() {
        if (f82896a == null) {
            synchronized (col.class) {
                try {
                    if (f82896a == null) {
                        rg50.C19837b c19837bM181359v = new rg50().m181359v();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        f82896a = c19837bM181359v.m181368f(15L, timeUnit).m181383u(15L, timeUnit).m181380r(Collections.unmodifiableList(Arrays.asList(Protocol.HTTP_1_1, Protocol.HTTP_2))).m181381s(Proxy.NO_PROXY).m181365c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f82896a;
    }

    /* JADX INFO: renamed from: d */
    private static rg50 m111673d() {
        if (f82897b == null) {
            synchronized (col.class) {
                try {
                    if (f82897b == null) {
                        rg50.C19837b c19837bM181359v = new rg50().m181359v();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        f82897b = c19837bM181359v.m181368f(15L, timeUnit).m181383u(15L, timeUnit).m181380r(Collections.unmodifiableList(Arrays.asList(Protocol.HTTP_1_1, Protocol.HTTP_2))).m181373k(new qml()).m181372j(new tml()).m181381s(Proxy.NO_PROXY).m181365c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f82897b;
    }
}
