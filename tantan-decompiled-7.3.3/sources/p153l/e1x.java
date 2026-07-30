package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.Purpose;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealth;
import java.util.List;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class e1x extends hzw<d1x> {

    /* JADX INFO: renamed from: c */
    public VScroll f91678c;

    /* JADX INFO: renamed from: d */
    public VText f91679d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f91680e;

    /* JADX INFO: renamed from: f */
    public d1x f91681f;

    /* JADX INFO: renamed from: l.e1x$a */
    public static /* synthetic */ class C16684a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f91682a;

        static {
            int[] iArr = new int[MarrySeriesType.values().length];
            f91682a = iArr;
            try {
                iArr[MarrySeriesType.STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91682a[MarrySeriesType.EXPECTED_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f91682a[MarrySeriesType.CAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f91682a[MarrySeriesType.QUALIFICATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f91682a[MarrySeriesType.MATE_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f91682a[MarrySeriesType.BABY_WILLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f91682a[MarrySeriesType.MONTHLY_COST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f91682a[MarrySeriesType.MATE_INCOME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f91682a[MarrySeriesType.MATE_QUALIFICATIONS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f91682a[MarrySeriesType.MATE_ADDRESS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f91682a[MarrySeriesType.INCOME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f91682a[MarrySeriesType.PROFILE_FEATURED_FRIEND_PURPOSE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: renamed from: l.e1x$b */
    public class C16685b extends jic0<Pair<String, String>> {

        /* JADX INFO: renamed from: c */
        public final List<Pair<String, String>> f91683c;

        public C16685b(List<Pair<String, String>> list) {
            this.f91683c = list;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f91683c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(e1x.this.getContext()).inflate(sec0.f167552a0, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final Pair<String, String> pair, int i, int i2) {
            VText vText = (VText) view.findViewById(gdc0.f103666Y);
            vText.setTypeface(lyh0.m156283c(3), 1);
            vText.setText((CharSequence) pair.first);
            view.setBackgroundResource(TextUtils.equals((CharSequence) pair.second, e1x.this.f91681f.f84736b) ? kbc0.f124917v0 : kbc0.f124914u0);
            vText.setTextColor(Color.parseColor(TextUtils.equals((CharSequence) pair.second, e1x.this.f91681f.f84736b) ? "#FFFFFF" : "#CC000000"));
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.f1x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f96836a.m119037H(pair, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public Pair<String, String> getItem(int i) {
            return this.f91683c.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m119037H(Pair pair, View view) {
            e1x.this.f91681f.f84736b = (String) pair.second;
            notifyDataSetChanged();
        }
    }

    public e1x(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: c */
    public boolean mo95576c(MarrySeriesType marrySeriesType) {
        return !TextUtils.isEmpty(this.f91681f.f84736b);
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: e */
    public void mo95577e(MarrySeriesType marrySeriesType, User user) {
        switch (C16684a.f91682a[marrySeriesType.ordinal()]) {
            case 1:
                user.profile.extensions.marriage.status = jyb.m147507f0(this.f91681f.f84736b);
                return;
            case 2:
                user.profile.extensions.marriage.expectedTime = jyb.m147507f0(this.f91681f.f84736b);
                return;
            case 3:
                user.profile.extensions.wealth.car = jyb.m147507f0(this.f91681f.f84736b);
                return;
            case 4:
                user.profile.extensions.basic.qualification = jyb.m147507f0(this.f91681f.f84736b);
                return;
            case 5:
                user.profile.extensions.marriage.mateStatus = jyb.m147507f0(this.f91681f.f84736b);
                return;
            case 6:
                user.profile.extensions.marriage.babyWilling = jyb.m147507f0(this.f91681f.f84736b);
                return;
            case 7:
                user.profile.extensions.wealth.monthlyCost = jyb.m147507f0(this.f91681f.f84736b);
                return;
            case 8:
                user.profile.extensions.marriage.mateIncome = jyb.m147507f0(this.f91681f.f84736b);
                return;
            case 9:
                user.profile.extensions.marriage.mateQualification = jyb.m147507f0(this.f91681f.f84736b);
                return;
            case 10:
                user.profile.extensions.marriage.mateAddress = jyb.m147507f0(this.f91681f.f84736b);
                break;
            case 11:
                break;
            case 12:
                user.profile.extensions.basic.friendPurpose = jyb.m147482M(Purpose.get(this.f91681f.f84736b));
                return;
            default:
                return;
        }
        Pair<List<String>, List<String>> pairMo34754T8 = gta.m132210e().m132214d().mo34754T8(this.f91681f.f84736b);
        UserWealth userWealth = user.profile.extensions.wealth;
        userWealth.lowIncome = (List) pairMo34754T8.first;
        userWealth.upperIncome = (List) pairMo34754T8.second;
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: i */
    public void mo95578i(MarrySeriesType marrySeriesType, User user) {
        this.f91679d.setTypeface(lyh0.m156283c(3), 1);
        this.f91679d.setText(marrySeriesType.getTitleName());
        this.f91680e.setAdapter(new C16685b(l5x.m153007d(marrySeriesType)));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m119032k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m119032k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g1x.m128572b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(d1x d1xVar) {
        this.f91681f = d1xVar;
    }
}
