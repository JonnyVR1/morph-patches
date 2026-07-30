package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.Purpose;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d1x extends gzw<e1x> {

    /* JADX INFO: renamed from: a */
    public MarrySeriesType f84735a;

    /* JADX INFO: renamed from: b */
    public String f84736b;

    /* JADX INFO: renamed from: l.d1x$a */
    public static /* synthetic */ class C16421a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f84737a;

        static {
            int[] iArr = new int[MarrySeriesType.values().length];
            f84737a = iArr;
            try {
                iArr[MarrySeriesType.STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84737a[MarrySeriesType.EXPECTED_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f84737a[MarrySeriesType.CAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f84737a[MarrySeriesType.QUALIFICATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f84737a[MarrySeriesType.MATE_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f84737a[MarrySeriesType.BABY_WILLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f84737a[MarrySeriesType.MONTHLY_COST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f84737a[MarrySeriesType.MATE_INCOME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f84737a[MarrySeriesType.MATE_QUALIFICATIONS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f84737a[MarrySeriesType.MATE_ADDRESS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f84737a[MarrySeriesType.INCOME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f84737a[MarrySeriesType.PROFILE_FEATURED_FRIEND_PURPOSE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public d1x(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m113656k0(Bundle bundle) {
        if (NullChecker.m82486a(bundle) && bundle.containsKey("param_type")) {
            this.f84735a = (MarrySeriesType) bundle.getSerializable("param_type");
        }
    }

    @Override // p153l.gzw, p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.c1x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79441a.m113656k0((Bundle) obj);
            }
        });
    }

    @Override // p153l.gzw
    /* JADX INFO: renamed from: g0 */
    public void mo95433g0(MarrySeriesType marrySeriesType, User user) {
        if (marrySeriesType == null) {
            return;
        }
        this.f84735a = marrySeriesType;
        switch (C16421a.f84737a[marrySeriesType.ordinal()]) {
            case 1:
                List<String> list = user.profile.extensions.marriage.status;
                this.f84736b = jyb.m147479J(list) ? null : list.get(0);
                return;
            case 2:
                List<String> list2 = user.profile.extensions.marriage.expectedTime;
                this.f84736b = jyb.m147479J(list2) ? null : list2.get(0);
                return;
            case 3:
                List<String> list3 = user.profile.extensions.wealth.car;
                this.f84736b = jyb.m147479J(list3) ? null : list3.get(0);
                break;
            case 4:
                break;
            case 5:
                List<String> list4 = user.profile.extensions.marriage.mateStatus;
                this.f84736b = jyb.m147479J(list4) ? null : list4.get(0);
                return;
            case 6:
                List<String> list5 = user.profile.extensions.marriage.babyWilling;
                this.f84736b = jyb.m147479J(list5) ? null : list5.get(0);
                return;
            case 7:
                List<String> list6 = user.profile.extensions.wealth.monthlyCost;
                this.f84736b = jyb.m147479J(list6) ? null : list6.get(0);
                return;
            case 8:
                List<String> list7 = user.profile.extensions.marriage.mateIncome;
                this.f84736b = jyb.m147479J(list7) ? null : list7.get(0);
                return;
            case 9:
                List<String> list8 = user.profile.extensions.marriage.mateQualification;
                this.f84736b = jyb.m147479J(list8) ? null : list8.get(0);
                return;
            case 10:
                List<String> list9 = user.profile.extensions.marriage.mateAddress;
                this.f84736b = jyb.m147479J(list9) ? null : list9.get(0);
                return;
            case 11:
                CoreProviderInterface coreProviderInterfaceM132214d = gta.m132210e().m132214d();
                UserWealth userWealth = user.profile.extensions.wealth;
                this.f84736b = coreProviderInterfaceM132214d.mo34884m(userWealth.upperIncome, userWealth.lowIncome);
                return;
            case 12:
                List<Purpose> list10 = user.profile.extensions.basic.friendPurpose;
                this.f84736b = jyb.m147479J(list10) ? null : list10.get(0).toString();
                return;
            default:
                return;
        }
        List<String> list11 = user.profile.extensions.basic.qualification;
        this.f84736b = jyb.m147479J(list11) ? null : list11.get(0);
    }
}
