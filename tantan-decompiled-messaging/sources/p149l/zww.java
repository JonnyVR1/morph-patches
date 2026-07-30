package p149l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.MarryEditProfileFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.view.MarryEditProfileItemAvatarCardView;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.view.MarryEditProfileItemAvatarView;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.view.MarryEditProfileItemImagesView;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.view.MarryEditProfileItemTagsView;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.view.MarryEditProfileItemTextView;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.view.MarryEditProfileItemView;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class zww extends eww<oww> implements uvl {

    /* JADX INFO: renamed from: A */
    public MarryEditProfileItemView f205292A;

    /* JADX INFO: renamed from: B */
    public MarryEditProfileItemTextView f205293B;

    /* JADX INFO: renamed from: C */
    public VText f205294C;

    /* JADX INFO: renamed from: D */
    public MarryEditProfileItemView f205295D;

    /* JADX INFO: renamed from: E */
    public VLinear f205296E;

    /* JADX INFO: renamed from: F */
    public VText f205297F;

    /* JADX INFO: renamed from: G */
    public VText f205298G;

    /* JADX INFO: renamed from: H */
    public MarryEditProfileFrag f205299H;

    /* JADX INFO: renamed from: I */
    public oww f205300I;

    /* JADX INFO: renamed from: J */
    public List<wvl> f205301J;

    /* JADX INFO: renamed from: b */
    public ScrollView f205302b;

    /* JADX INFO: renamed from: c */
    public MarryEditProfileItemAvatarView f205303c;

    /* JADX INFO: renamed from: d */
    public MarryEditProfileItemAvatarCardView f205304d;

    /* JADX INFO: renamed from: e */
    public MarryEditProfileItemTextView f205305e;

    /* JADX INFO: renamed from: f */
    public MarryEditProfileItemImagesView f205306f;

    /* JADX INFO: renamed from: g */
    public VText f205307g;

    /* JADX INFO: renamed from: h */
    public MarryEditProfileItemView f205308h;

    /* JADX INFO: renamed from: i */
    public MarryEditProfileItemView f205309i;

    /* JADX INFO: renamed from: j */
    public MarryEditProfileItemView f205310j;

    /* JADX INFO: renamed from: k */
    public MarryEditProfileItemTagsView f205311k;

    /* JADX INFO: renamed from: l */
    public MarryEditProfileItemTextView f205312l;

    /* JADX INFO: renamed from: m */
    public MarryEditProfileItemTextView f205313m;

    /* JADX INFO: renamed from: n */
    public VText f205314n;

    /* JADX INFO: renamed from: o */
    public MarryEditProfileItemView f205315o;

    /* JADX INFO: renamed from: p */
    public MarryEditProfileItemView f205316p;

    /* JADX INFO: renamed from: q */
    public MarryEditProfileItemView f205317q;

    /* JADX INFO: renamed from: r */
    public MarryEditProfileItemView f205318r;

    /* JADX INFO: renamed from: s */
    public MarryEditProfileItemView f205319s;

    /* JADX INFO: renamed from: t */
    public VText f205320t;

    /* JADX INFO: renamed from: u */
    public MarryEditProfileItemView f205321u;

    /* JADX INFO: renamed from: v */
    public MarryEditProfileItemView f205322v;

    /* JADX INFO: renamed from: w */
    public MarryEditProfileItemView f205323w;

    /* JADX INFO: renamed from: x */
    public MarryEditProfileItemView f205324x;

    /* JADX INFO: renamed from: y */
    public MarryEditProfileItemView f205325y;

    /* JADX INFO: renamed from: z */
    public MarryEditProfileItemView f205326z;

    public zww(MarryEditProfileFrag marryEditProfileFrag) {
        this.f205299H = marryEditProfileFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m220713r() {
        this.f93544a = true;
        this.f205307g.setTypeface(eqh0.m117752c(3), 1);
        this.f205320t.setTypeface(eqh0.m117752c(3), 1);
        this.f205294C.setTypeface(eqh0.m117752c(3), 1);
        this.f205314n.setTypeface(eqh0.m117752c(3), 1);
        ArrayList arrayList = new ArrayList();
        this.f205301J = arrayList;
        arrayList.add(this.f205305e.m47550h0(MarrySeriesType.DECLARATION));
        this.f205301J.add(this.f205306f.m47543h0(MarrySeriesType.LIFE_MOMENT));
        boolean zM150963a = lqa.m150963a();
        List<wvl> list = this.f205301J;
        if (zM150963a) {
            list.add(this.f205304d.m47527u(MarrySeriesType.AVATAR));
        } else {
            list.add(this.f205303c.m47537v(MarrySeriesType.AVATAR));
        }
        this.f205301J.add(this.f205308h.m47551h0(MarrySeriesType.STATUS));
        this.f205301J.add(this.f205309i.m47551h0(MarrySeriesType.EXPECTED_TIME));
        this.f205301J.add(this.f205311k.m47547h0(MarrySeriesType.MATE));
        this.f205301J.add(this.f205312l.m47550h0(MarrySeriesType.FAMILY_BACKGROUND));
        this.f205301J.add(this.f205310j.m47551h0(MarrySeriesType.BABY_WILLING));
        this.f205301J.add(this.f205313m.m47550h0(MarrySeriesType.BRIDE_PRICE));
        this.f205301J.add(this.f205315o.m47551h0(MarrySeriesType.PROFESSION));
        this.f205301J.add(this.f205316p.m47551h0(MarrySeriesType.INCOME));
        this.f205301J.add(this.f205317q.m47551h0(MarrySeriesType.CAR));
        this.f205301J.add(this.f205318r.m47551h0(MarrySeriesType.HOUSE));
        this.f205301J.add(this.f205319s.m47551h0(MarrySeriesType.MONTHLY_COST));
        this.f205301J.add(this.f205321u.m47551h0(MarrySeriesType.QUALIFICATIONS));
        this.f205301J.add(this.f205322v.m47551h0(MarrySeriesType.ADDRESS_HOMETOWN));
        this.f205301J.add(this.f205323w.m47551h0(MarrySeriesType.ADDRESS_LIVE_NOW));
        this.f205301J.add(this.f205324x.m47551h0(MarrySeriesType.HEIGHT));
        this.f205301J.add(this.f205325y.m47551h0(MarrySeriesType.WEIGHT));
        this.f205301J.add(this.f205326z.m47551h0(MarrySeriesType.NICK_NAME));
        this.f205301J.add(this.f205292A.m47551h0(MarrySeriesType.BIRTHDAY));
        this.f205301J.add(this.f205293B.m47550h0(MarrySeriesType.PROLOGUE));
        this.f205301J.add(this.f205295D.m47551h0(MarrySeriesType.BIND_PHONE));
        for (final wvl wvlVar : this.f205301J) {
            if (wvlVar.mo47526f()) {
                xdl0.m208329E0(wvlVar.getClickView(), new View.OnClickListener() { // from class: l.tww
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f172433a.m220728s(wvlVar, view);
                    }
                });
            }
        }
        if (lqa.m150963a()) {
            this.f205304d.setMediaChangeCallback(new e30() { // from class: l.uww
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f178685a.m220729u((List) obj);
                }
            });
            xdl0.m208344M(this.f205304d, true);
            xdl0.m208344M(this.f205303c, false);
        } else {
            this.f205303c.setMediaChangeCallback(new e30() { // from class: l.vww
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f183395a.m220730v((List) obj);
                }
            });
            xdl0.m208344M(this.f205303c, true);
            xdl0.m208344M(this.f205304d, false);
        }
        xdl0.m208329E0(this.f205295D, new View.OnClickListener() { // from class: l.www
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188409a.m220714w(view);
            }
        });
        xdl0.m208329E0(this.f205297F, new View.OnClickListener() { // from class: l.xww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194773a.m220715x(view);
            }
        });
        xdl0.m208329E0(this.f205298G, new View.OnClickListener() { // from class: l.yww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200555a.m220716y(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m220714w(View view) {
        if (TextUtils.isEmpty(this.f205295D.f30461f.getText())) {
            this.f205300I.m166448m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m220715x(View view) {
        this.f205300I.m166444i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m220716y(View view) {
        this.f205300I.m166445j0();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m220717A(User user) {
        if (lqa.m150963a()) {
            this.f205304d.f30422a.m50811h(0).m51778n0(user.picture(0));
        } else {
            this.f205303c.f30425a.m50811h(0).m50640C1(user.picture(0));
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m220718B() {
        this.f205300I.m166443h0();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m220719C() {
        getAct().m47815F2();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f205299H.act();
    }

    /* JADX INFO: renamed from: E */
    public void m220720E(String str) {
        if (lqa.m150963a()) {
            return;
        }
        this.f205303c.m47534B(str);
    }

    /* JADX INFO: renamed from: F */
    public boolean m220721F(int i, int i2, Intent intent) {
        if (lqa.m150963a()) {
            return false;
        }
        this.f205303c.m47535C(i, i2, intent);
        return true;
    }

    /* JADX INFO: renamed from: G */
    public final void m220722G(final boolean z) {
        new xh0.C21150a(getAct()).m208740s(getAct().getString(R$string.f27838d4)).m208728g(false).m208730i(R$string.f27832c4).m208738q(R$string.f27826b4).m208736o(new View.OnClickListener() { // from class: l.pww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151606a.m220731z(z, view);
            }
        }).m208726e(R$string.f27815a).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: H */
    public final void m220723H(boolean z) {
        final User userM169516ma = CoreModule.f17545c.f19639e0.m169516ma();
        Picture picture = (Picture) (lqa.m150963a() ? this.f205304d.f30422a.m50811h(0).getMedia() : this.f205303c.f30425a.m50811h(0).f32976N);
        Runnable runnable = new Runnable() { // from class: l.qww
            @Override // java.lang.Runnable
            public final void run() {
                this.f156789a.m220717A(userM169516ma);
            }
        };
        Runnable runnable2 = new Runnable() { // from class: l.rww
            @Override // java.lang.Runnable
            public final void run() {
                this.f161382a.m220718B();
            }
        };
        Runnable runnable3 = new Runnable() { // from class: l.sww
            @Override // java.lang.Runnable
            public final void run() {
                this.f166757a.m220719C();
            }
        };
        if (z) {
            new ho4(getAct(), userM169516ma.m60124fp(), picture, runnable, runnable2, runnable3).show();
        } else {
            new ho4(getAct(), userM169516ma.m60124fp(), picture, runnable, runnable2).show();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m220724I(MarrySeriesType marrySeriesType) {
        this.f205300I.m166442g0(marrySeriesType);
    }

    @Override // p149l.uvl
    /* JADX INFO: renamed from: I0 */
    public boolean mo47447I0(User user, boolean z) {
        List<Media> allMedia = lqa.m150963a() ? this.f205304d.getAllMedia() : this.f205303c.getAllMedia();
        ArrayList arrayList = new ArrayList();
        for (Media media : allMedia) {
            if (media != null && !TEnum.equals(media.status, "normal") && !z) {
                m220722G(true);
                return false;
            }
            if (media != null && TEnum.equals(media.status, "normal")) {
                arrayList.add(media);
            }
        }
        for (wvl wvlVar : this.f205301J) {
            if ((wvlVar.getItemType().isRequired() && !wvlVar.mo47542d0()) || vwb.m200296J(arrayList)) {
                new xh0.C21150a(getAct()).m208740s("还差一点就完成啦！").m208728g(true).m208723b(true).m208731j("希望每个加入的人资料真实、态度真诚，认真完善资料，迈出寻找理想伴侣的第一步～").m208739r("继续填写").m208722a().m208721g();
                return false;
            }
        }
        if (!m220727q() || z) {
            user.pictures = arrayList;
            return super.mo47447I0(user, z);
        }
        m220723H(false);
        return false;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f205299H.act();
    }

    @Override // p149l.uvl
    /* JADX INFO: renamed from: d */
    public void mo47449d(User user) {
        Iterator<wvl> it = this.f205301J.iterator();
        while (it.hasNext()) {
            it.next().mo47525d(user);
        }
        this.f205295D.setContent(m2x.m152737s(user));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM220725n = m220725n(layoutInflater, viewGroup);
        m220713r();
        return viewM220725n;
    }

    /* JADX INFO: renamed from: n */
    public View m220725n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return axw.m99525b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(oww owwVar) {
        this.f205300I = owwVar;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m220727q() {
        if (lqa.m150963a()) {
            this.f205304d.f30422a.m50811h(0).getMedia();
        } else {
            Media media = this.f205303c.f30425a.m50811h(0).f32976N;
        }
        return false;
    }

    @Override // p149l.uvl
    /* JADX INFO: renamed from: r0 */
    public boolean mo47450r0(boolean z) {
        if (!z) {
            for (Media media : lqa.m150963a() ? this.f205304d.getAllMedia() : this.f205303c.getAllMedia()) {
                if (media != null && !TEnum.equals(media.status, "normal")) {
                    m220722G(false);
                    return true;
                }
            }
        }
        if (z || !m220727q()) {
            return super.mo47450r0(z);
        }
        m220723H(true);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m220728s(wvl wvlVar, View view) {
        m220724I(wvlVar.getItemType());
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m220729u(List list) {
        this.f205300I.m166449n0(list);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m220730v(List list) {
        this.f205300I.m166449n0(list);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m220731z(boolean z, View view) {
        if (z) {
            this.f205300I.m166443h0();
        } else {
            getAct().m47815F2();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
