package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.Purpose;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import java.util.List;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class fyw extends iww<eyw> {

    /* JADX INFO: renamed from: c */
    public VScroll f99907c;

    /* JADX INFO: renamed from: d */
    public VText f99908d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f99909e;

    /* JADX INFO: renamed from: f */
    public eyw f99910f;

    /* JADX INFO: renamed from: l.fyw$a */
    public static /* synthetic */ class C16963a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f99911a;

        static {
            int[] iArr = new int[MarrySeriesType.values().length];
            f99911a = iArr;
            try {
                iArr[MarrySeriesType.STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99911a[MarrySeriesType.EXPECTED_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99911a[MarrySeriesType.CAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f99911a[MarrySeriesType.QUALIFICATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99911a[MarrySeriesType.MATE_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f99911a[MarrySeriesType.BABY_WILLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f99911a[MarrySeriesType.MONTHLY_COST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f99911a[MarrySeriesType.MATE_INCOME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f99911a[MarrySeriesType.MATE_QUALIFICATIONS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f99911a[MarrySeriesType.MATE_ADDRESS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f99911a[MarrySeriesType.INCOME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f99911a[MarrySeriesType.PROFILE_FEATURED_FRIEND_PURPOSE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: renamed from: l.fyw$b */
    public class C16964b extends dac0<Pair<String, String>> {

        /* JADX INFO: renamed from: c */
        public final List<Pair<String, String>> f99912c;

        public C16964b(List<Pair<String, String>> list) {
            this.f99912c = list;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f99912c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(fyw.this.getContext()).inflate(n6c0.f137338a0, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final Pair<String, String> pair, int i, int i2) {
            VText vText = (VText) view.findViewById(a5c0.f67671Y);
            vText.setTypeface(eqh0.m117752c(3), 1);
            vText.setText((CharSequence) pair.first);
            view.setBackgroundResource(TextUtils.equals((CharSequence) pair.second, fyw.this.f99910f.f93797b) ? e3c0.f89154v0 : e3c0.f89151u0);
            vText.setTextColor(Color.parseColor(TextUtils.equals((CharSequence) pair.second, fyw.this.f99910f.f93797b) ? "#FFFFFF" : "#CC000000"));
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.gyw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f105065a.m123806H(pair, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public Pair<String, String> getItem(int i) {
            return this.f99912c.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m123806H(Pair pair, View view) {
            fyw.this.f99910f.f93797b = (String) pair.second;
            notifyDataSetChanged();
        }
    }

    public fyw(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo104516c(MarrySeriesType marrySeriesType) {
        return !TextUtils.isEmpty(this.f99910f.f93797b);
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: e */
    public void mo104517e(MarrySeriesType marrySeriesType, User user) {
        switch (C16963a.f99911a[marrySeriesType.ordinal()]) {
            case 1:
                user.profile.extensions.marriage.status = vwb.m200324f0(this.f99910f.f93797b);
                return;
            case 2:
                user.profile.extensions.marriage.expectedTime = vwb.m200324f0(this.f99910f.f93797b);
                return;
            case 3:
                user.profile.extensions.wealth.car = vwb.m200324f0(this.f99910f.f93797b);
                return;
            case 4:
                user.profile.extensions.basic.qualification = vwb.m200324f0(this.f99910f.f93797b);
                return;
            case 5:
                user.profile.extensions.marriage.mateStatus = vwb.m200324f0(this.f99910f.f93797b);
                return;
            case 6:
                user.profile.extensions.marriage.babyWilling = vwb.m200324f0(this.f99910f.f93797b);
                return;
            case 7:
                user.profile.extensions.wealth.monthlyCost = vwb.m200324f0(this.f99910f.f93797b);
                return;
            case 8:
                user.profile.extensions.marriage.mateIncome = vwb.m200324f0(this.f99910f.f93797b);
                return;
            case 9:
                user.profile.extensions.marriage.mateQualification = vwb.m200324f0(this.f99910f.f93797b);
                return;
            case 10:
                user.profile.extensions.marriage.mateAddress = vwb.m200324f0(this.f99910f.f93797b);
                break;
            case 11:
                break;
            case 12:
                user.profile.extensions.basic.friendPurpose = vwb.m200299M(Purpose.get(this.f99910f.f93797b));
                return;
            default:
                return;
        }
        Pair<List<String>, List<String>> pairMo33751T8 = ura.m195053e().m195057d().mo33751T8(this.f99910f.f93797b);
        UserWealth userWealth = user.profile.extensions.wealth;
        userWealth.lowIncome = (List) pairMo33751T8.first;
        userWealth.upperIncome = (List) pairMo33751T8.second;
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: i */
    public void mo104518i(MarrySeriesType marrySeriesType, User user) {
        this.f99908d.setTypeface(eqh0.m117752c(3), 1);
        this.f99908d.setText(marrySeriesType.getTitleName());
        this.f99909e.setAdapter(new C16964b(m2x.m152722d(marrySeriesType)));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m123801k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m123801k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hyw.m133626b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(eyw eywVar) {
        this.f99910f = eywVar;
    }
}
