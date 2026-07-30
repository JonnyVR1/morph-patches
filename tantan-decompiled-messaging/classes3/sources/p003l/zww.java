package p003l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.edit.MarryEditProfileFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.view.MarryEditProfileItemAvatarCardView;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.view.MarryEditProfileItemAvatarView;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.view.MarryEditProfileItemImagesView;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.view.MarryEditProfileItemTagsView;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.view.MarryEditProfileItemTextView;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.view.MarryEditProfileItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.axw;
import l.ho4;
import l.lqa;
import l.vwb;
import l.xdl0;
import l.xh0;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class zww extends eww<oww> implements uvl {

    /* JADX INFO: renamed from: A */
    public MarryEditProfileItemView f9464A;

    /* JADX INFO: renamed from: B */
    public MarryEditProfileItemTextView f9465B;

    /* JADX INFO: renamed from: C */
    public VText f9466C;

    /* JADX INFO: renamed from: D */
    public MarryEditProfileItemView f9467D;

    /* JADX INFO: renamed from: E */
    public VLinear f9468E;

    /* JADX INFO: renamed from: F */
    public VText f9469F;

    /* JADX INFO: renamed from: G */
    public VText f9470G;

    /* JADX INFO: renamed from: H */
    public MarryEditProfileFrag f9471H;

    /* JADX INFO: renamed from: I */
    public oww f9472I;

    /* JADX INFO: renamed from: J */
    public List<wvl> f9473J;

    /* JADX INFO: renamed from: b */
    public ScrollView f9474b;

    /* JADX INFO: renamed from: c */
    public MarryEditProfileItemAvatarView f9475c;

    /* JADX INFO: renamed from: d */
    public MarryEditProfileItemAvatarCardView f9476d;

    /* JADX INFO: renamed from: e */
    public MarryEditProfileItemTextView f9477e;

    /* JADX INFO: renamed from: f */
    public MarryEditProfileItemImagesView f9478f;

    /* JADX INFO: renamed from: g */
    public VText f9479g;

    /* JADX INFO: renamed from: h */
    public MarryEditProfileItemView f9480h;

    /* JADX INFO: renamed from: i */
    public MarryEditProfileItemView f9481i;

    /* JADX INFO: renamed from: j */
    public MarryEditProfileItemView f9482j;

    /* JADX INFO: renamed from: k */
    public MarryEditProfileItemTagsView f9483k;

    /* JADX INFO: renamed from: l */
    public MarryEditProfileItemTextView f9484l;

    /* JADX INFO: renamed from: m */
    public MarryEditProfileItemTextView f9485m;

    /* JADX INFO: renamed from: n */
    public VText f9486n;

    /* JADX INFO: renamed from: o */
    public MarryEditProfileItemView f9487o;

    /* JADX INFO: renamed from: p */
    public MarryEditProfileItemView f9488p;

    /* JADX INFO: renamed from: q */
    public MarryEditProfileItemView f9489q;

    /* JADX INFO: renamed from: r */
    public MarryEditProfileItemView f9490r;

    /* JADX INFO: renamed from: s */
    public MarryEditProfileItemView f9491s;

    /* JADX INFO: renamed from: t */
    public VText f9492t;

    /* JADX INFO: renamed from: u */
    public MarryEditProfileItemView f9493u;

    /* JADX INFO: renamed from: v */
    public MarryEditProfileItemView f9494v;

    /* JADX INFO: renamed from: w */
    public MarryEditProfileItemView f9495w;

    /* JADX INFO: renamed from: x */
    public MarryEditProfileItemView f9496x;

    /* JADX INFO: renamed from: y */
    public MarryEditProfileItemView f9497y;

    /* JADX INFO: renamed from: z */
    public MarryEditProfileItemView f9498z;

    public zww(MarryEditProfileFrag marryEditProfileFrag) {
        this.f9471H = marryEditProfileFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m9500r() {
        this.f3407a = true;
        this.f9479g.setTypeface(eqh0.m3924c(3), 1);
        this.f9492t.setTypeface(eqh0.m3924c(3), 1);
        this.f9466C.setTypeface(eqh0.m3924c(3), 1);
        this.f9486n.setTypeface(eqh0.m3924c(3), 1);
        ArrayList arrayList = new ArrayList();
        this.f9473J = arrayList;
        arrayList.add(this.f9477e.m602h0(MarrySeriesType.DECLARATION));
        this.f9473J.add(this.f9478f.m595h0(MarrySeriesType.LIFE_MOMENT));
        boolean zA = lqa.a();
        List<wvl> list = this.f9473J;
        if (zA) {
            list.add(this.f9476d.m577u(MarrySeriesType.AVATAR));
        } else {
            list.add(this.f9475c.m589v(MarrySeriesType.AVATAR));
        }
        this.f9473J.add(this.f9480h.m603h0(MarrySeriesType.STATUS));
        this.f9473J.add(this.f9481i.m603h0(MarrySeriesType.EXPECTED_TIME));
        this.f9473J.add(this.f9483k.m599h0(MarrySeriesType.MATE));
        this.f9473J.add(this.f9484l.m602h0(MarrySeriesType.FAMILY_BACKGROUND));
        this.f9473J.add(this.f9482j.m603h0(MarrySeriesType.BABY_WILLING));
        this.f9473J.add(this.f9485m.m602h0(MarrySeriesType.BRIDE_PRICE));
        this.f9473J.add(this.f9487o.m603h0(MarrySeriesType.PROFESSION));
        this.f9473J.add(this.f9488p.m603h0(MarrySeriesType.INCOME));
        this.f9473J.add(this.f9489q.m603h0(MarrySeriesType.CAR));
        this.f9473J.add(this.f9490r.m603h0(MarrySeriesType.HOUSE));
        this.f9473J.add(this.f9491s.m603h0(MarrySeriesType.MONTHLY_COST));
        this.f9473J.add(this.f9493u.m603h0(MarrySeriesType.QUALIFICATIONS));
        this.f9473J.add(this.f9494v.m603h0(MarrySeriesType.ADDRESS_HOMETOWN));
        this.f9473J.add(this.f9495w.m603h0(MarrySeriesType.ADDRESS_LIVE_NOW));
        this.f9473J.add(this.f9496x.m603h0(MarrySeriesType.HEIGHT));
        this.f9473J.add(this.f9497y.m603h0(MarrySeriesType.WEIGHT));
        this.f9473J.add(this.f9498z.m603h0(MarrySeriesType.NICK_NAME));
        this.f9473J.add(this.f9464A.m603h0(MarrySeriesType.BIRTHDAY));
        this.f9473J.add(this.f9465B.m602h0(MarrySeriesType.PROLOGUE));
        this.f9473J.add(this.f9467D.m603h0(MarrySeriesType.BIND_PHONE));
        for (final wvl wvlVar : this.f9473J) {
            if (wvlVar.mo576f()) {
                xdl0.E0(wvlVar.getClickView(), new View.OnClickListener() { // from class: l.tww
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f7818a.m9517s(wvlVar, view);
                    }
                });
            }
        }
        if (lqa.a()) {
            this.f9476d.setMediaChangeCallback(new e30() { // from class: l.uww
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f8116a.m9518u((List) obj);
                }
            });
            xdl0.M(this.f9476d, true);
            xdl0.M(this.f9475c, false);
        } else {
            this.f9475c.setMediaChangeCallback(new e30() { // from class: l.vww
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f8457a.m9519v((List) obj);
                }
            });
            xdl0.M(this.f9475c, true);
            xdl0.M(this.f9476d, false);
        }
        xdl0.E0(this.f9467D, new View.OnClickListener() { // from class: l.www
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8636a.m9501w(view);
            }
        });
        xdl0.E0(this.f9469F, new View.OnClickListener() { // from class: l.xww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8872a.m9502x(view);
            }
        });
        xdl0.E0(this.f9470G, new View.OnClickListener() { // from class: l.yww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9176a.m9503y(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m9501w(View view) {
        if (TextUtils.isEmpty(this.f9467D.f352f.getText())) {
            this.f9472I.m6775m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m9502x(View view) {
        this.f9472I.m6771i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m9503y(View view) {
        this.f9472I.m6772j0();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m9504A(User user) {
        if (lqa.a()) {
            this.f9476d.f313a.h(0).setMedia(user.picture(0));
        } else {
            this.f9475c.f316a.h(0).C1(user.picture(0));
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m9505B() {
        this.f9472I.m6770h0();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m9506C() {
        act().finish();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9507C0() {
        return this.f9471H.act();
    }

    /* JADX INFO: renamed from: E */
    public void m9508E(String str) {
        if (lqa.a()) {
            return;
        }
        this.f9475c.m584B(str);
    }

    /* JADX INFO: renamed from: F */
    public boolean m9509F(int i, int i2, Intent intent) {
        if (lqa.a()) {
            return false;
        }
        this.f9475c.m585C(i, i2, intent);
        return true;
    }

    /* JADX INFO: renamed from: G */
    public final void m9510G(final boolean z) {
        new xh0.a(act()).s(act().getString(R.string.d4)).g(false).i(R.string.c4).q(R.string.b4).o(new View.OnClickListener() { // from class: l.pww
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6538a.m9520z(z, view);
            }
        }).e(R.string.a).a().g();
    }

    /* JADX INFO: renamed from: H */
    public final void m9511H(boolean z) {
        final User userMa = CoreModule.c.e0.ma();
        Picture picture = (Picture) (lqa.a() ? this.f9476d.f313a.h(0).getMedia() : this.f9475c.f316a.h(0).N);
        Runnable runnable = new Runnable() { // from class: l.qww
            @Override // java.lang.Runnable
            public final void run() {
                this.f6719a.m9504A(userMa);
            }
        };
        Runnable runnable2 = new Runnable() { // from class: l.rww
            @Override // java.lang.Runnable
            public final void run() {
                this.f7110a.m9505B();
            }
        };
        Runnable runnable3 = new Runnable() { // from class: l.sww
            @Override // java.lang.Runnable
            public final void run() {
                this.f7357a.m9506C();
            }
        };
        if (z) {
            new ho4(act(), userMa.fp(), picture, runnable, runnable2, runnable3).show();
        } else {
            new ho4(act(), userMa.fp(), picture, runnable, runnable2).show();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m9512I(MarrySeriesType marrySeriesType) {
        this.f9472I.m6769g0(marrySeriesType);
    }

    @Override // p003l.uvl
    /* JADX INFO: renamed from: I0 */
    public boolean mo492I0(User user, boolean z) {
        List<Media> allMedia = lqa.a() ? this.f9476d.getAllMedia() : this.f9475c.getAllMedia();
        ArrayList arrayList = new ArrayList();
        for (Media media : allMedia) {
            if (media != null && !TEnum.equals(media.status, "normal") && !z) {
                m9510G(true);
                return false;
            }
            if (media != null && TEnum.equals(media.status, "normal")) {
                arrayList.add(media);
            }
        }
        for (wvl wvlVar : this.f9473J) {
            if ((wvlVar.getItemType().isRequired() && !wvlVar.mo594d0()) || vwb.J(arrayList)) {
                new xh0.a(act()).s("还差一点就完成啦！").g(true).b(true).j("希望每个加入的人资料真实、态度真诚，认真完善资料，迈出寻找理想伴侣的第一步～").r("继续填写").a().g();
                return false;
            }
        }
        if (!m9516q() || z) {
            user.pictures = arrayList;
            return super.mo492I0(user, z);
        }
        m9511H(false);
        return false;
    }

    @Nullable
    public Act act() {
        return this.f9471H.act();
    }

    @Override // p003l.uvl
    /* JADX INFO: renamed from: d */
    public void mo494d(User user) {
        Iterator<wvl> it = this.f9473J.iterator();
        while (it.hasNext()) {
            it.next().mo575d(user);
        }
        this.f9467D.setContent(m2x.m6212s(user));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM9514n = m9514n(layoutInflater, viewGroup);
        m9500r();
        return viewM9514n;
    }

    /* JADX INFO: renamed from: n */
    public View m9514n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return axw.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m9513i1(oww owwVar) {
        this.f9472I = owwVar;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m9516q() {
        if (lqa.a()) {
            this.f9476d.f313a.h(0).getMedia();
        } else {
            Media media = this.f9475c.f316a.h(0).N;
        }
        return false;
    }

    @Override // p003l.uvl
    /* JADX INFO: renamed from: r0 */
    public boolean mo497r0(boolean z) {
        if (!z) {
            for (Media media : lqa.a() ? this.f9476d.getAllMedia() : this.f9475c.getAllMedia()) {
                if (media != null && !TEnum.equals(media.status, "normal")) {
                    m9510G(false);
                    return true;
                }
            }
        }
        if (z || !m9516q()) {
            return super.mo497r0(z);
        }
        m9511H(true);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m9517s(wvl wvlVar, View view) {
        m9512I(wvlVar.getItemType());
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m9518u(List list) {
        this.f9472I.m6776n0(list);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m9519v(List list) {
        this.f9472I.m6776n0(list);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m9520z(boolean z, View view) {
        if (z) {
            this.f9472I.m6770h0();
        } else {
            act().finish();
        }
    }

    public void destroy() {
    }
}
