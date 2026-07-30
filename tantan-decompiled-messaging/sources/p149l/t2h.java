package p149l;

import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class t2h {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m186971b(Throwable th, roj0 roj0Var) {
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
        } else {
            m186980k(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX INFO: renamed from: c */
    public static String m186972c(int i) {
        int i2;
        if (i == 40060) {
            i2 = R$string.f39100l5;
        } else if (i == 40063) {
            i2 = R$string.f38957Q;
        } else if (i != 40091) {
            switch (i) {
                case 40007:
                    i2 = R$string.f39030b5;
                    break;
                case TantanException.Client.AccountService.SHORT_PASSWORD /* 40008 */:
                    i2 = R$string.f38987V;
                    break;
                case 40009:
                    i2 = R$string.f39023a5;
                    break;
                case 40010:
                    i2 = R$string.f39011Z;
                    break;
                case 40011:
                    i2 = R$string.f39032c0;
                    break;
                case TantanException.Client.AccountService.ACCOUNT_PASSWORD_FAIL /* 40012 */:
                    i2 = R$string.f39077i3;
                    break;
                case 40013:
                    i2 = R$string.f39005Y;
                    break;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    i2 = R$string.f39018a0;
                    break;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    i2 = R$string.f38999X;
                    break;
                default:
                    switch (i) {
                        case TantanException.Client.CoreService.MATCH_HAS_EXISTED /* 40018 */:
                            break;
                        case TantanException.Client.AccountService.ACCOUNT_DELETE /* 40019 */:
                            i2 = R$string.f38963R;
                            break;
                        case TantanException.Client.AccountService.INACTIVATED /* 40020 */:
                            i2 = R$string.f38969S;
                            break;
                        case TantanException.Client.AccountService.VERIFY_CURRENT_PASSWORD /* 40021 */:
                            i2 = R$string.f38993W;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                case TantanException.Client.AccountService.CHINA_MOBILE_NOT_SIGN_UP /* 40016 */:
                    i2 = R$string.f39025b0;
                    break;
            }
        } else {
            i2 = R$string.f38969S;
        }
        if (i2 == 0) {
            return null;
        }
        return FeedModule.f38852a.getResources().getString(i2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m186973d(Throwable th) {
        if (!(th instanceof App.HandledGlobally)) {
            if (th instanceof IOException) {
                lsi0.m151584n(R$string.f38981U);
            } else if (th instanceof TantanException.Client.AccountService) {
                int i = ((TantanException.Client.AccountService) th).code;
                if (i == 40000) {
                    m186980k(th);
                } else {
                    String strM186972c = m186972c(i);
                    if (strM186972c == null) {
                        m186981l(th);
                        m186980k(th);
                    } else {
                        lsi0.m151581k(strM186972c, true);
                    }
                }
            } else if (th instanceof TantanException.Client.CoreService) {
                m186975f(((TantanException.Client.CoreService) th).code, th);
            } else if (th instanceof ShareHelper.PlatformNotFoundException) {
                lsi0.m151578h(R$string.f39004X4);
            } else {
                boolean z = th instanceof TantanException.Client.TantanForbidden;
                if (z && ((TantanException.Client.TantanForbidden) th).isBlocked()) {
                    lsi0.m151578h(R$string.f39140r4);
                } else {
                    if (!z) {
                        return false;
                    }
                    TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
                    int i2 = tantanForbidden.code;
                    if (i2 == 40341) {
                        lsi0.m151593w(R$string.f38978T2);
                    } else if (i2 == 40340) {
                        lsi0.m151593w(R$string.f38972S2);
                    } else if (i2 == 41030) {
                        lsi0.m151593w(R$string.f39129q);
                    } else if (i2 == 40307) {
                        lsi0.m151578h(R$string.f38940N0);
                    } else if (eje0.m116838a(i2)) {
                        lsi0.m151593w(R$string.f38988V0);
                    } else if (eje0.m116839b(tantanForbidden.code)) {
                        lsi0.m151593w(R$string.f39095l0);
                    } else {
                        int i3 = tantanForbidden.code;
                        if (i3 == 403 || i3 == 40314) {
                            lsi0.m151593w(R$string.f39026b1);
                        } else if (i3 == 40325) {
                            lsi0.m151593w(R$string.f38996W2);
                        } else if (i3 == 40360) {
                            lsi0.m151595y("无法创建此话题");
                        } else if (i3 == 40361) {
                            lsi0.m151595y("今日创建话题数已达上限");
                        } else {
                            if (i3 != 40364) {
                                return false;
                            }
                            lsi0.m151595y("转发失败");
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static void m186974e(Throwable th) {
        if (NullChecker.m81303a(th) && (th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40366) {
            return;
        }
        try {
            if (m186973d(th)) {
                return;
            }
            if (th instanceof ApiExcep.Client.NotFound) {
                lsi0.m151593w(R$string.f39139r3);
            } else {
                lsi0.m151593w(R$string.f38913I3);
            }
        } catch (Exception e) {
            m186981l(e);
            lsi0.m151593w(R$string.f38913I3);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m186975f(int i, final Throwable th) {
        if (i == 40042) {
            lsi0.m151578h(R$string.f38968R4);
            return;
        }
        if (i == 40041) {
            if (ijb0.m136539C().isJailedOrRestrict()) {
                kjb0.m146186I();
                return;
            } else {
                ijb0.m136549M(rib0.m179488a()).subscribe(mkd0.m154956H(new e30() { // from class: l.r2h
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        t2h.m186971b(th, (roj0) obj);
                    }
                }, new e30() { // from class: l.s2h
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        t2h.m186980k(th);
                    }
                }));
                return;
            }
        }
        if (i == 42000) {
            lsi0.m151578h(R$string.f38990V2);
            return;
        }
        if (i == 40099) {
            lsi0.m151580j("您输入的内容违规，请修改");
            return;
        }
        String message = th.getMessage();
        if (message != null) {
            lsi0.m151581k(message, true);
        } else {
            m186981l(th);
            m186980k(th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m186976g(Throwable th) {
        m186979j(th);
    }

    /* JADX INFO: renamed from: h */
    public static void m186977h(Throwable th, boolean z) {
        if (m186973d(th)) {
            return;
        }
        lsi0.m151595y(z ? "关注失败" : "取消关注失败");
    }

    /* JADX INFO: renamed from: i */
    public static void m186978i(Throwable th) {
        if (m186973d(th)) {
            return;
        }
        lsi0.m151595y("转发失败");
    }

    /* JADX INFO: renamed from: j */
    public static void m186979j(Throwable th) {
        try {
            if (m186973d(th)) {
                return;
            }
            m186980k(th);
        } catch (Exception e) {
            m186981l(e);
            m186980k(th);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m186980k(Throwable th) {
        lsi0.m151578h(R$string.f39039d0);
    }

    /* JADX INFO: renamed from: l */
    public static void m186981l(Throwable th) {
        CrashHelper.m81297d(th, 50);
    }
}
