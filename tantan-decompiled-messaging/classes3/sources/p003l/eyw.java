package p003l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p1.mobile.putong.data.Purpose;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.mcr;
import l.ura;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class eyw extends hww<fyw> {

    /* JADX INFO: renamed from: a */
    public MarrySeriesType f3424a;

    /* JADX INFO: renamed from: b */
    public String f3425b;

    /* JADX INFO: renamed from: l.eyw$a */
    public static /* synthetic */ class C0287a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3426a;

        static {
            int[] iArr = new int[MarrySeriesType.values().length];
            f3426a = iArr;
            try {
                iArr[MarrySeriesType.STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3426a[MarrySeriesType.EXPECTED_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3426a[MarrySeriesType.CAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3426a[MarrySeriesType.QUALIFICATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3426a[MarrySeriesType.MATE_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3426a[MarrySeriesType.BABY_WILLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3426a[MarrySeriesType.MONTHLY_COST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3426a[MarrySeriesType.MATE_INCOME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3426a[MarrySeriesType.MATE_QUALIFICATIONS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3426a[MarrySeriesType.MATE_ADDRESS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3426a[MarrySeriesType.INCOME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3426a[MarrySeriesType.PROFILE_FEATURED_FRIEND_PURPOSE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public eyw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m3953k0(Bundle bundle) {
        if (NullChecker.a(bundle) && bundle.containsKey("param_type")) {
            this.f3424a = (MarrySeriesType) bundle.getSerializable("param_type");
        }
    }

    @Override // p003l.hww
    /* JADX INFO: renamed from: Z */
    public void mo3954Z() {
        super.mo3954Z();
    }

    /* JADX INFO: renamed from: a0 */
    public void m3955a0() {
        super.a0();
        creates(new e30() { // from class: l.dyw
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3172a.m3953k0((Bundle) obj);
            }
        });
    }

    @Override // p003l.hww
    /* JADX INFO: renamed from: g0 */
    public void mo3202g0(MarrySeriesType marrySeriesType, User user) {
        if (marrySeriesType == null) {
            return;
        }
        this.f3424a = marrySeriesType;
        switch (C0287a.f3426a[marrySeriesType.ordinal()]) {
            case 1:
                List list = user.profile.extensions.marriage.status;
                this.f3425b = vwb.J(list) ? null : (String) list.get(0);
                return;
            case 2:
                List list2 = user.profile.extensions.marriage.expectedTime;
                this.f3425b = vwb.J(list2) ? null : (String) list2.get(0);
                return;
            case 3:
                List list3 = user.profile.extensions.wealth.car;
                this.f3425b = vwb.J(list3) ? null : (String) list3.get(0);
                break;
            case 4:
                break;
            case 5:
                List list4 = user.profile.extensions.marriage.mateStatus;
                this.f3425b = vwb.J(list4) ? null : (String) list4.get(0);
                return;
            case 6:
                List list5 = user.profile.extensions.marriage.babyWilling;
                this.f3425b = vwb.J(list5) ? null : (String) list5.get(0);
                return;
            case 7:
                List list6 = user.profile.extensions.wealth.monthlyCost;
                this.f3425b = vwb.J(list6) ? null : (String) list6.get(0);
                return;
            case 8:
                List list7 = user.profile.extensions.marriage.mateIncome;
                this.f3425b = vwb.J(list7) ? null : (String) list7.get(0);
                return;
            case 9:
                List list8 = user.profile.extensions.marriage.mateQualification;
                this.f3425b = vwb.J(list8) ? null : (String) list8.get(0);
                return;
            case 10:
                List list9 = user.profile.extensions.marriage.mateAddress;
                this.f3425b = vwb.J(list9) ? null : (String) list9.get(0);
                return;
            case 11:
                CoreProviderInterface coreProviderInterfaceD = ura.e().d();
                UserWealth userWealth = user.profile.extensions.wealth;
                this.f3425b = coreProviderInterfaceD.m(userWealth.upperIncome, userWealth.lowIncome);
                return;
            case 12:
                List list10 = user.profile.extensions.basic.friendPurpose;
                this.f3425b = vwb.J(list10) ? null : ((Purpose) list10.get(0)).toString();
                return;
            default:
                return;
        }
        List list11 = user.profile.extensions.basic.qualification;
        this.f3425b = vwb.J(list11) ? null : (String) list11.get(0);
    }
}
