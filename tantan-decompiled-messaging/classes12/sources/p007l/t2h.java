package p007l;

import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.ui.share.ShareHelper;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class t2h {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m14422b(Throwable th, roj0 roj0Var) {
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
        } else {
            m14431k(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX INFO: renamed from: c */
    public static String m14423c(int i) {
        int i2;
        if (i == 40060) {
            i2 = R$string.f561l5;
        } else if (i == 40063) {
            i2 = R$string.f418Q;
        } else if (i != 40091) {
            switch (i) {
                case 40007:
                    i2 = R$string.f491b5;
                    break;
                case 40008:
                    i2 = R$string.f448V;
                    break;
                case 40009:
                    i2 = R$string.f484a5;
                    break;
                case 40010:
                    i2 = R$string.f472Z;
                    break;
                case 40011:
                    i2 = R$string.f493c0;
                    break;
                case 40012:
                    i2 = R$string.f538i3;
                    break;
                case 40013:
                    i2 = R$string.f466Y;
                    break;
                case 40014:
                    i2 = R$string.f479a0;
                    break;
                case 40015:
                    i2 = R$string.f460X;
                    break;
                default:
                    switch (i) {
                        case 40018:
                            break;
                        case 40019:
                            i2 = R$string.f424R;
                            break;
                        case 40020:
                            i2 = R$string.f430S;
                            break;
                        case 40021:
                            i2 = R$string.f454W;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                case 40016:
                    i2 = R$string.f486b0;
                    break;
            }
        } else {
            i2 = R$string.f430S;
        }
        if (i2 == 0) {
            return null;
        }
        return FeedModule.f313a.getResources().getString(i2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m14424d(Throwable th) {
        if (!(th instanceof App.HandledGlobally)) {
            if (th instanceof IOException) {
                lsi0.n(R$string.f442U);
            } else if (th instanceof TantanException.Client.AccountService) {
                int i = ((TantanException.Client.AccountService) th).code;
                if (i == 40000) {
                    m14431k(th);
                } else {
                    String strM14423c = m14423c(i);
                    if (strM14423c == null) {
                        m14432l(th);
                        m14431k(th);
                    } else {
                        lsi0.k(strM14423c, true);
                    }
                }
            } else if (th instanceof TantanException.Client.CoreService) {
                m14426f(((TantanException.Client.CoreService) th).code, th);
            } else if (th instanceof ShareHelper.PlatformNotFoundException) {
                lsi0.h(R$string.f465X4);
            } else {
                boolean z = th instanceof TantanException.Client.TantanForbidden;
                if (z && ((TantanException.Client.TantanForbidden) th).isBlocked()) {
                    lsi0.h(R$string.f601r4);
                } else {
                    if (!z) {
                        return false;
                    }
                    TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
                    int i2 = tantanForbidden.code;
                    if (i2 == 40341) {
                        lsi0.w(R$string.f439T2);
                    } else if (i2 == 40340) {
                        lsi0.w(R$string.f433S2);
                    } else if (i2 == 41030) {
                        lsi0.w(R$string.f590q);
                    } else if (i2 == 40307) {
                        lsi0.h(R$string.f401N0);
                    } else if (eje0.m9894a(i2)) {
                        lsi0.w(R$string.f449V0);
                    } else if (eje0.m9895b(tantanForbidden.code)) {
                        lsi0.w(R$string.f556l0);
                    } else {
                        int i3 = tantanForbidden.code;
                        if (i3 == 403 || i3 == 40314) {
                            lsi0.w(R$string.f487b1);
                        } else if (i3 == 40325) {
                            lsi0.w(R$string.f457W2);
                        } else if (i3 == 40360) {
                            lsi0.y("无法创建此话题");
                        } else if (i3 == 40361) {
                            lsi0.y("今日创建话题数已达上限");
                        } else {
                            if (i3 != 40364) {
                                return false;
                            }
                            lsi0.y("转发失败");
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static void m14425e(Throwable th) {
        if (NullChecker.a(th) && (th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40366) {
            return;
        }
        try {
            if (m14424d(th)) {
                return;
            }
            if (th instanceof ApiExcep.Client.NotFound) {
                lsi0.w(R$string.f600r3);
            } else {
                lsi0.w(R$string.f374I3);
            }
        } catch (Exception e) {
            m14432l(e);
            lsi0.w(R$string.f374I3);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m14426f(int i, final Throwable th) {
        if (i == 40042) {
            lsi0.h(R$string.f429R4);
            return;
        }
        if (i == 40041) {
            if (ijb0.m10892C().isJailedOrRestrict()) {
                kjb0.m11445I();
                return;
            } else {
                ijb0.m10902M(rib0.m13904a()).subscribe(mkd0.H(new e30() { // from class: l.r2h
                    public final void call(Object obj) {
                        t2h.m14422b(th, (roj0) obj);
                    }
                }, new e30() { // from class: l.s2h
                    public final void call(Object obj) {
                        t2h.m14431k(th);
                    }
                }));
                return;
            }
        }
        if (i == 42000) {
            lsi0.h(R$string.f451V2);
            return;
        }
        if (i == 40099) {
            lsi0.j("您输入的内容违规，请修改");
            return;
        }
        String message = th.getMessage();
        if (message != null) {
            lsi0.k(message, true);
        } else {
            m14432l(th);
            m14431k(th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m14427g(Throwable th) {
        m14430j(th);
    }

    /* JADX INFO: renamed from: h */
    public static void m14428h(Throwable th, boolean z) {
        if (m14424d(th)) {
            return;
        }
        lsi0.y(z ? "关注失败" : "取消关注失败");
    }

    /* JADX INFO: renamed from: i */
    public static void m14429i(Throwable th) {
        if (m14424d(th)) {
            return;
        }
        lsi0.y("转发失败");
    }

    /* JADX INFO: renamed from: j */
    public static void m14430j(Throwable th) {
        try {
            if (m14424d(th)) {
                return;
            }
            m14431k(th);
        } catch (Exception e) {
            m14432l(e);
            m14431k(th);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m14431k(Throwable th) {
        lsi0.h(R$string.f500d0);
    }

    /* JADX INFO: renamed from: l */
    public static void m14432l(Throwable th) {
        CrashHelper.d(th, 50);
    }
}
