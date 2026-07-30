package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.Purpose;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class eyw extends hww<fyw> {

    /* JADX INFO: renamed from: a */
    public MarrySeriesType f93796a;

    /* JADX INFO: renamed from: b */
    public String f93797b;

    /* JADX INFO: renamed from: l.eyw$a */
    public static /* synthetic */ class C16723a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93798a;

        static {
            int[] iArr = new int[MarrySeriesType.values().length];
            f93798a = iArr;
            try {
                iArr[MarrySeriesType.STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93798a[MarrySeriesType.EXPECTED_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93798a[MarrySeriesType.CAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93798a[MarrySeriesType.QUALIFICATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93798a[MarrySeriesType.MATE_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f93798a[MarrySeriesType.BABY_WILLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f93798a[MarrySeriesType.MONTHLY_COST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f93798a[MarrySeriesType.MATE_INCOME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f93798a[MarrySeriesType.MATE_QUALIFICATIONS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f93798a[MarrySeriesType.MATE_ADDRESS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f93798a[MarrySeriesType.INCOME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f93798a[MarrySeriesType.PROFILE_FEATURED_FRIEND_PURPOSE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public eyw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m118800k0(Bundle bundle) {
        if (NullChecker.m81303a(bundle) && bundle.containsKey("param_type")) {
            this.f93796a = (MarrySeriesType) bundle.getSerializable("param_type");
        }
    }

    @Override // p149l.hww, p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.dyw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88436a.m118800k0((Bundle) obj);
            }
        });
    }

    @Override // p149l.hww
    /* JADX INFO: renamed from: g0 */
    public void mo104384g0(MarrySeriesType marrySeriesType, User user) {
        if (marrySeriesType == null) {
            return;
        }
        this.f93796a = marrySeriesType;
        switch (C16723a.f93798a[marrySeriesType.ordinal()]) {
            case 1:
                List<String> list = user.profile.extensions.marriage.status;
                this.f93797b = vwb.m200296J(list) ? null : list.get(0);
                return;
            case 2:
                List<String> list2 = user.profile.extensions.marriage.expectedTime;
                this.f93797b = vwb.m200296J(list2) ? null : list2.get(0);
                return;
            case 3:
                List<String> list3 = user.profile.extensions.wealth.car;
                this.f93797b = vwb.m200296J(list3) ? null : list3.get(0);
                break;
            case 4:
                break;
            case 5:
                List<String> list4 = user.profile.extensions.marriage.mateStatus;
                this.f93797b = vwb.m200296J(list4) ? null : list4.get(0);
                return;
            case 6:
                List<String> list5 = user.profile.extensions.marriage.babyWilling;
                this.f93797b = vwb.m200296J(list5) ? null : list5.get(0);
                return;
            case 7:
                List<String> list6 = user.profile.extensions.wealth.monthlyCost;
                this.f93797b = vwb.m200296J(list6) ? null : list6.get(0);
                return;
            case 8:
                List<String> list7 = user.profile.extensions.marriage.mateIncome;
                this.f93797b = vwb.m200296J(list7) ? null : list7.get(0);
                return;
            case 9:
                List<String> list8 = user.profile.extensions.marriage.mateQualification;
                this.f93797b = vwb.m200296J(list8) ? null : list8.get(0);
                return;
            case 10:
                List<String> list9 = user.profile.extensions.marriage.mateAddress;
                this.f93797b = vwb.m200296J(list9) ? null : list9.get(0);
                return;
            case 11:
                CoreProviderInterface coreProviderInterfaceM195057d = ura.m195053e().m195057d();
                UserWealth userWealth = user.profile.extensions.wealth;
                this.f93797b = coreProviderInterfaceM195057d.mo33881m(userWealth.upperIncome, userWealth.lowIncome);
                return;
            case 12:
                List<Purpose> list10 = user.profile.extensions.basic.friendPurpose;
                this.f93797b = vwb.m200296J(list10) ? null : list10.get(0).toString();
                return;
            default:
                return;
        }
        List<String> list11 = user.profile.extensions.basic.qualification;
        this.f93797b = vwb.m200296J(list11) ? null : list11.get(0);
    }
}
