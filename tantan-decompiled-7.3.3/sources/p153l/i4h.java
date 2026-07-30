package p153l;

import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class i4h {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m138533b(Throwable th, uxj0 uxj0Var) {
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
        } else {
            m138542k(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX INFO: renamed from: c */
    public static String m138534c(int i) {
        int i2;
        if (i == 40060) {
            i2 = R$string.f39948l5;
        } else if (i == 40063) {
            i2 = R$string.f39805Q;
        } else if (i != 40091) {
            switch (i) {
                case 40007:
                    i2 = R$string.f39878b5;
                    break;
                case TantanException.Client.AccountService.SHORT_PASSWORD /* 40008 */:
                    i2 = R$string.f39835V;
                    break;
                case 40009:
                    i2 = R$string.f39871a5;
                    break;
                case 40010:
                    i2 = R$string.f39859Z;
                    break;
                case 40011:
                    i2 = R$string.f39880c0;
                    break;
                case TantanException.Client.AccountService.ACCOUNT_PASSWORD_FAIL /* 40012 */:
                    i2 = R$string.f39925i3;
                    break;
                case 40013:
                    i2 = R$string.f39853Y;
                    break;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    i2 = R$string.f39866a0;
                    break;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    i2 = R$string.f39847X;
                    break;
                default:
                    switch (i) {
                        case TantanException.Client.CoreService.MATCH_HAS_EXISTED /* 40018 */:
                            break;
                        case TantanException.Client.AccountService.ACCOUNT_DELETE /* 40019 */:
                            i2 = R$string.f39811R;
                            break;
                        case TantanException.Client.AccountService.INACTIVATED /* 40020 */:
                            i2 = R$string.f39817S;
                            break;
                        case TantanException.Client.AccountService.VERIFY_CURRENT_PASSWORD /* 40021 */:
                            i2 = R$string.f39841W;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                case TantanException.Client.AccountService.CHINA_MOBILE_NOT_SIGN_UP /* 40016 */:
                    i2 = R$string.f39873b0;
                    break;
            }
        } else {
            i2 = R$string.f39817S;
        }
        if (i2 == 0) {
            return null;
        }
        return FeedModule.f39700a.getResources().getString(i2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m138535d(Throwable th) {
        if (!(th instanceof App.HandledGlobally)) {
            if (th instanceof IOException) {
                o1j0.m165640n(R$string.f39829U);
            } else if (th instanceof TantanException.Client.AccountService) {
                int i = ((TantanException.Client.AccountService) th).code;
                if (i == 40000) {
                    m138542k(th);
                } else {
                    String strM138534c = m138534c(i);
                    if (strM138534c == null) {
                        m138543l(th);
                        m138542k(th);
                    } else {
                        o1j0.m165637k(strM138534c, true);
                    }
                }
            } else if (th instanceof TantanException.Client.CoreService) {
                m138537f(((TantanException.Client.CoreService) th).code, th);
            } else if (th instanceof ShareHelper.PlatformNotFoundException) {
                o1j0.m165634h(R$string.f39852X4);
            } else {
                boolean z = th instanceof TantanException.Client.TantanForbidden;
                if (z && ((TantanException.Client.TantanForbidden) th).isBlocked()) {
                    o1j0.m165634h(R$string.f39988r4);
                } else {
                    if (!z) {
                        return false;
                    }
                    TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
                    int i2 = tantanForbidden.code;
                    if (i2 == 40341) {
                        o1j0.m165649w(R$string.f39826T2);
                    } else if (i2 == 40340) {
                        o1j0.m165649w(R$string.f39820S2);
                    } else if (i2 == 41030) {
                        o1j0.m165649w(R$string.f39977q);
                    } else if (i2 == 40307) {
                        o1j0.m165634h(R$string.f39788N0);
                    } else if (jre0.m146732a(i2)) {
                        o1j0.m165649w(R$string.f39836V0);
                    } else if (jre0.m146733b(tantanForbidden.code)) {
                        o1j0.m165649w(R$string.f39943l0);
                    } else {
                        int i3 = tantanForbidden.code;
                        if (i3 == 403 || i3 == 40314) {
                            o1j0.m165649w(R$string.f39874b1);
                        } else if (i3 == 40325) {
                            o1j0.m165649w(R$string.f39844W2);
                        } else if (i3 == 40360) {
                            o1j0.m165651y("无法创建此话题");
                        } else if (i3 == 40361) {
                            o1j0.m165651y("今日创建话题数已达上限");
                        } else {
                            if (i3 != 40364) {
                                return false;
                            }
                            o1j0.m165651y("转发失败");
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static void m138536e(Throwable th) {
        if (NullChecker.m82486a(th) && (th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40366) {
            return;
        }
        try {
            if (m138535d(th)) {
                return;
            }
            if (th instanceof ApiExcep.Client.NotFound) {
                o1j0.m165649w(R$string.f39987r3);
            } else {
                o1j0.m165649w(R$string.f39761I3);
            }
        } catch (Exception e) {
            m138543l(e);
            o1j0.m165649w(R$string.f39761I3);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m138537f(int i, final Throwable th) {
        if (i == 40042) {
            o1j0.m165634h(R$string.f39816R4);
            return;
        }
        if (i == 40041) {
            if (mrb0.m159625C().isJailedOrRestrict()) {
                orb0.m168880I();
                return;
            } else {
                mrb0.m159635M(vqb0.m202371a()).subscribe(psd0.m173597H(new y20() { // from class: l.g4h
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        i4h.m138533b(th, (uxj0) obj);
                    }
                }, new y20() { // from class: l.h4h
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        i4h.m138542k(th);
                    }
                }));
                return;
            }
        }
        if (i == 42000) {
            o1j0.m165634h(R$string.f39838V2);
            return;
        }
        if (i == 40099) {
            o1j0.m165636j("您输入的内容违规，请修改");
            return;
        }
        String message = th.getMessage();
        if (message != null) {
            o1j0.m165637k(message, true);
        } else {
            m138543l(th);
            m138542k(th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m138538g(Throwable th) {
        m138541j(th);
    }

    /* JADX INFO: renamed from: h */
    public static void m138539h(Throwable th, boolean z) {
        if (m138535d(th)) {
            return;
        }
        o1j0.m165651y(z ? "关注失败" : "取消关注失败");
    }

    /* JADX INFO: renamed from: i */
    public static void m138540i(Throwable th) {
        if (m138535d(th)) {
            return;
        }
        o1j0.m165651y("转发失败");
    }

    /* JADX INFO: renamed from: j */
    public static void m138541j(Throwable th) {
        try {
            if (m138535d(th)) {
                return;
            }
            m138542k(th);
        } catch (Exception e) {
            m138543l(e);
            m138542k(th);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m138542k(Throwable th) {
        o1j0.m165634h(R$string.f39887d0);
    }

    /* JADX INFO: renamed from: l */
    public static void m138543l(Throwable th) {
        CrashHelper.m82480d(th, 50);
    }
}
