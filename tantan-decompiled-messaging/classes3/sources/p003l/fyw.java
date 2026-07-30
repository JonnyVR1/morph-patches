package p003l;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Purpose;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealth;
import java.util.List;
import l.a5c0;
import l.e3c0;
import l.hyw;
import l.n6c0;
import l.ura;
import l.vwb;
import l.xdl0;
import p028v.VScroll;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class fyw extends iww<eyw> {

    /* JADX INFO: renamed from: c */
    public VScroll f3767c;

    /* JADX INFO: renamed from: d */
    public VText f3768d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f3769e;

    /* JADX INFO: renamed from: f */
    public eyw f3770f;

    /* JADX INFO: renamed from: l.fyw$a */
    public static /* synthetic */ class C0300a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3771a;

        static {
            int[] iArr = new int[MarrySeriesType.values().length];
            f3771a = iArr;
            try {
                iArr[MarrySeriesType.STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3771a[MarrySeriesType.EXPECTED_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3771a[MarrySeriesType.CAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3771a[MarrySeriesType.QUALIFICATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3771a[MarrySeriesType.MATE_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3771a[MarrySeriesType.BABY_WILLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3771a[MarrySeriesType.MONTHLY_COST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3771a[MarrySeriesType.MATE_INCOME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3771a[MarrySeriesType.MATE_QUALIFICATIONS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3771a[MarrySeriesType.MATE_ADDRESS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3771a[MarrySeriesType.INCOME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3771a[MarrySeriesType.PROFILE_FEATURED_FRIEND_PURPOSE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: renamed from: l.fyw$b */
    public class C0301b extends dac0<Pair<String, String>> {

        /* JADX INFO: renamed from: c */
        public final List<Pair<String, String>> f3772c;

        public C0301b(List<Pair<String, String>> list) {
            this.f3772c = list;
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: C */
        public int mo203C() {
            return this.f3772c.size();
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: D */
        public View mo204D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(fyw.this.mo5253C0()).inflate(n6c0.a0, viewGroup, false);
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo202A(View view, final Pair<String, String> pair, int i, int i2) {
            AppCompatTextView appCompatTextView = (VText) view.findViewById(a5c0.Y);
            appCompatTextView.setTypeface(eqh0.m3924c(3), 1);
            appCompatTextView.setText((CharSequence) pair.first);
            view.setBackgroundResource(TextUtils.equals((CharSequence) pair.second, fyw.this.f3770f.f3425b) ? e3c0.v0 : e3c0.u0);
            appCompatTextView.setTextColor(Color.parseColor(TextUtils.equals((CharSequence) pair.second, fyw.this.f3770f.f3425b) ? "#FFFFFF" : "#CC000000"));
            xdl0.E0(view, new View.OnClickListener() { // from class: l.gyw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f4091a.m4489H(pair, view2);
                }
            });
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public Pair<String, String> getItem(int i) {
            return this.f3772c.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m4489H(Pair pair, View view) {
            fyw.this.f3770f.f3425b = (String) pair.second;
            notifyDataSetChanged();
        }
    }

    public fyw(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo3208c(MarrySeriesType marrySeriesType) {
        return !TextUtils.isEmpty(this.f3770f.f3425b);
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: e */
    public void mo3209e(MarrySeriesType marrySeriesType, User user) {
        switch (C0300a.f3771a[marrySeriesType.ordinal()]) {
            case 1:
                user.profile.extensions.marriage.status = vwb.f0(new String[]{this.f3770f.f3425b});
                return;
            case 2:
                user.profile.extensions.marriage.expectedTime = vwb.f0(new String[]{this.f3770f.f3425b});
                return;
            case 3:
                user.profile.extensions.wealth.car = vwb.f0(new String[]{this.f3770f.f3425b});
                return;
            case 4:
                user.profile.extensions.basic.qualification = vwb.f0(new String[]{this.f3770f.f3425b});
                return;
            case 5:
                user.profile.extensions.marriage.mateStatus = vwb.f0(new String[]{this.f3770f.f3425b});
                return;
            case 6:
                user.profile.extensions.marriage.babyWilling = vwb.f0(new String[]{this.f3770f.f3425b});
                return;
            case 7:
                user.profile.extensions.wealth.monthlyCost = vwb.f0(new String[]{this.f3770f.f3425b});
                return;
            case 8:
                user.profile.extensions.marriage.mateIncome = vwb.f0(new String[]{this.f3770f.f3425b});
                return;
            case 9:
                user.profile.extensions.marriage.mateQualification = vwb.f0(new String[]{this.f3770f.f3425b});
                return;
            case 10:
                user.profile.extensions.marriage.mateAddress = vwb.f0(new String[]{this.f3770f.f3425b});
                break;
            case 11:
                break;
            case 12:
                user.profile.extensions.basic.friendPurpose = vwb.M(Purpose.get(this.f3770f.f3425b));
                return;
            default:
                return;
        }
        Pair pairT8 = ura.e().d().T8(this.f3770f.f3425b);
        UserWealth userWealth = user.profile.extensions.wealth;
        userWealth.lowIncome = (List) pairT8.first;
        userWealth.upperIncome = (List) pairT8.second;
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: i */
    public void mo3210i(MarrySeriesType marrySeriesType, User user) {
        this.f3768d.setTypeface(eqh0.m3924c(3), 1);
        this.f3768d.setText(marrySeriesType.getTitleName());
        this.f3769e.setAdapter(new C0301b(m2x.m6197d(marrySeriesType)));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m4484k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m4484k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hyw.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m4483i1(eyw eywVar) {
        this.f3770f = eywVar;
    }
}
