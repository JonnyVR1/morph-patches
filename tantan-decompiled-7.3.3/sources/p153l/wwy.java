package p153l;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.core.p058ui.breaking.SwapAnswerBottomSheetAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.meme.CorePopularMemeAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class wwy extends jic0<Sticker> {

    /* JADX INFO: renamed from: d */
    public final MessagesAct f191335d;

    /* JADX INFO: renamed from: e */
    public int f191336e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f191337f = false;

    /* JADX INFO: renamed from: c */
    public final List<Sticker> f191334c = new ArrayList();

    public wwy(MessagesAct messagesAct) {
        this.f191335d = messagesAct;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m208333O(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ boolean m208334S(int i, int i2, int i3, Intent intent) {
        if (i2 != i || i3 != -1 || !NullChecker.m82486a(intent)) {
            return false;
        }
        Sticker sticker = (Sticker) intent.getSerializableExtra(CorePopularMemeAct.f32710o);
        if (!NullChecker.m82486a(sticker)) {
            return true;
        }
        m208348d0(sticker);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m208335T(View view, View view2) {
        i4g0.m138520r("e_gif_search", OMSDialogPositon.p_chat_view);
        Intent intent = new Intent(view.getContext(), (Class<?>) CorePopularMemeAct.class);
        intent.putExtra(CorePopularMemeAct.f32705j, true);
        if (this.f191336e == 1 && !TextUtils.isEmpty(this.f191335d.m50164y2().m178958l0())) {
            intent.putExtra(CorePopularMemeAct.f32709n, this.f191335d.m50164y2().m178958l0());
            intent.putExtra(CorePopularMemeAct.f32708m, true);
        }
        final int i = 10003;
        this.f191335d.startActivityForResult(10003, intent, new C4468a.a() { // from class: l.nwy
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i2, int i3, Intent intent2) {
                return this.f144051a.m208334S(i, i2, i3, intent2);
            }
        });
        this.f191335d.overridePendingTransition(y7c0.f197767e, y7c0.f197763a);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f191334c.size() == 0) {
            return 0;
        }
        return this.f191334c.size() + (this.f191337f ? 1 : 0);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return m208337Q(i);
        }
        View viewInflate = p9r.m171370a(viewGroup.getContext()).inflate(qec0.f157071m, viewGroup, false);
        RecyclerView.C0580p c0580p = (RecyclerView.C0580p) viewInflate.getLayoutParams();
        boolean zM133418G = h39.m133418G();
        ((ViewGroup.MarginLayoutParams) c0580p).width = zM133418G ? qa00.f156294G : qa00.f156297J;
        ((ViewGroup.MarginLayoutParams) c0580p).height = zM133418G ? qa00.f156294G : qa00.f156297J;
        VImage vImage = (VImage) viewInflate.findViewById(edc0.f93422o1);
        if (zM133418G) {
            bnl0.m105540X(vImage, qa00.m175859d(11.0f));
        } else {
            bnl0.m105540X(vImage, qa00.m175859d(17.0f));
        }
        VText vText = (VText) viewInflate.findViewById(edc0.f93180C2);
        vText.setTextSize(11.0f);
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        if (zM133418G) {
            bnl0.m105537U(vText, qa00.m175859d(8.0f));
            return viewInflate;
        }
        bnl0.m105537U(vText, qa00.m175859d(10.0f));
        return viewInflate;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo29822A(final View view, Sticker sticker, int i, int i2) {
        if (i == 0) {
            bnl0.m105522L(view, new View.OnClickListener() { // from class: l.lwy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f133873a.m208335T(view, view2);
                }
            });
            return;
        }
        if (i == 2 && (view instanceof VText)) {
            m208350f0((VText) view, sticker);
        } else if (i == 1 && (view instanceof VDraweeView)) {
            m208349e0((VDraweeView) view, sticker);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final View m208337Q(int i) {
        if (i == 2) {
            VText vText = new VText(this.f191335d);
            vText.setLayoutParams(new ViewGroup.LayoutParams(-2, qa00.f156336w));
            bnl0.m105550d0(vText, qa00.f156321h);
            bnl0.m105552e0(vText, qa00.f156322i);
            vText.setBackgroundResource(ibc0.f114066l);
            vText.setTextColor(Color.parseColor("#CC000000"));
            vText.setEmojiEnable(true);
            vText.setLargeEmojiEnable(true);
            vText.setTextSize(14.0f);
            vText.setGravity(16);
            return vText;
        }
        VDraweeView vDraweeView = new VDraweeView(this.f191335d);
        if (this.f191336e == 1) {
            if (h39.m133418G()) {
                int i2 = qa00.f156294G;
                vDraweeView.setLayoutParams(new RecyclerView.C0580p(i2, i2));
                return vDraweeView;
            }
            int i3 = qa00.f156297J;
            vDraweeView.setLayoutParams(new RecyclerView.C0580p(i3, i3));
            return vDraweeView;
        }
        if (h39.m133437a()) {
            int i4 = hxy.f112070j;
            vDraweeView.setLayoutParams(new RecyclerView.C0580p(i4, i4));
            return vDraweeView;
        }
        int i5 = hxy.f112069i;
        vDraweeView.setLayoutParams(new RecyclerView.C0580p(i5, i5));
        return vDraweeView;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public Sticker getItem(int i) {
        if (i == this.f191334c.size()) {
            return null;
        }
        return this.f191334c.get(i);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m208339U(Sticker sticker) {
        this.f191335d.f32488f.m110909R6(sticker, false);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m208340V(Sticker sticker, View view) {
        i4g0.m138523u("e_chat_icebreak_gif", OMSDialogPositon.p_chat_view, jyb.m147494Y("other_user_id", this.f191335d.mo50158l().mo111034r3()), jyb.m147494Y("gift_url", sticker.pictures.get(0).url), jyb.m147494Y("chat_source", hxy.m137680l(this.f191336e)));
        m208348d0(sticker);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m208341W(VText vText, View view) {
        if (this.f191335d.m50164y2() instanceof yxz) {
            MessagesAct messagesAct = this.f191335d;
            SwapAnswerBottomSheetAct.m45633E2(messagesAct, messagesAct.mo50158l().mo111034r3(), null);
            i4g0.m138523u("e_shortcut", this.f191335d.pageId(), pf60.m172085a("show_tag", vText.getText()));
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m208342X() {
        ((tvz) this.f191335d.f32488f).m193156Kg();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m208343Y(VText vText, View view) {
        if (this.f191335d.m50164y2() instanceof yxz) {
            this.f191335d.m50164y2().mo178911Q1(true, new Runnable() { // from class: l.mwy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f139167a.m208342X();
                }
            });
            i4g0.m138523u("e_shortcut", this.f191335d.pageId(), pf60.m172085a("show_tag", vText.getText()));
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m208344Z() {
        o6c0 o6c0Var = (o6c0) ((tvz) this.f191335d.f32488f).m193310uc(o6c0.class);
        if (o6c0Var != null) {
            ((yxz) this.f191335d.m50164y2()).m217886l5(o6c0Var.m166212d(), "click_entrance");
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m208345a0(VText vText, View view) {
        if (this.f191335d.m50164y2() instanceof yxz) {
            this.f191335d.m50164y2().mo178911Q1(true, new Runnable() { // from class: l.vwy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f186215a.m208344Z();
                }
            });
            i4g0.m138523u("e_shortcut", this.f191335d.pageId(), pf60.m172085a("show_tag", vText.getText()));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m208346b0(Sticker sticker, VText vText, View view) {
        this.f191335d.f32488f.m110914S6(sticker.status);
        i4g0.m138523u("e_shortcut", this.f191335d.pageId(), pf60.m172085a("show_tag", vText.getText()));
    }

    /* JADX INFO: renamed from: c0 */
    public void m208347c0(List<Sticker> list, int i) {
        this.f191336e = i;
        this.f191334c.clear();
        this.f191337f = false;
        if (i == 1) {
            if (!h39.m133418G()) {
                this.f191337f = true;
            } else if (list.size() > 5) {
                for (int i2 = 0; i2 < 5; i2++) {
                    this.f191334c.add(list.get(i2));
                }
                this.f191337f = true;
                notifyDataSetChanged();
                return;
            }
        }
        this.f191334c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m208348d0(Sticker sticker) {
        this.f191335d.f32488f.m143372e0().mo50138B0().m143374g0().m114041t0().getBar_center_text().setText("");
        this.f191335d.duringCreated(CoreModule.f18264c.f20366Z.f20885T.m35955Q(sticker.cloneSticker()).filter(new vo7()).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.twy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176435a.m208339U((Sticker) obj);
            }
        }, new y20() { // from class: l.uwy
            @Override // p153l.y20
            public final void call(Object obj) {
                wwy.m208333O((Throwable) obj);
            }
        }));
        int i = this.f191336e;
        if (i == 4) {
            CoreModule.f18264c.f20384f0.f20622N0.put(0);
            CoreModule.f18264c.f20384f0.f20619M0.put(Long.valueOf(pzi0.m174454o()));
        } else if (i == 5) {
            CoreModule.f18264c.f20384f0.f20628P0.put(0);
            CoreModule.f18264c.f20384f0.f20625O0.put(Long.valueOf(pzi0.m174454o()));
        } else if (i == 9) {
            ConversationCounterTypeSp.iceBreakLastMessageShowCountLimit.set(this.f191335d.f32488f.f82474c, 0);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m208349e0(VDraweeView vDraweeView, final Sticker sticker) {
        CoreModule.m30932N().mo61494R9(vDraweeView, 10.0f);
        if (jyb.m147479J(sticker.pictures)) {
            uqb0.f180374G.m98798o(vDraweeView);
            return;
        }
        if (TEnum.equals(sticker.source, "shanmeng")) {
            uqb0.f180374G.m127115L0(vDraweeView, sticker.pictures.get(0).url);
            sticker.hash = niw.m163315e(sticker.pictures.get(0).url);
        } else {
            uqb0.f180374G.m127096B0(vDraweeView, m208351g0(sticker.pictures.get(0)));
        }
        bnl0.m105522L(vDraweeView, new View.OnClickListener() { // from class: l.swy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171059a.m208340V(sticker, view);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m208350f0(final VText vText, final Sticker sticker) {
        Drawable drawable;
        vText.setCompoundDrawables(null, null, null, null);
        vText.setCompoundDrawablePadding(qa00.f156316c);
        if (TextUtils.equals(sticker.name, "phrase")) {
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.rwy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f165254a.m208346b0(sticker, vText, view);
                }
            });
        } else {
            if (TextUtils.equals(sticker.name, "exchange")) {
                if (gta.m132210e().m132214d().mo34702I4()) {
                    drawable = this.f191335d.getResources().getDrawable(ibc0.f114155u7);
                } else {
                    boolean zM133421J = h39.m133421J();
                    MessagesAct messagesAct = this.f191335d;
                    drawable = zM133421J ? messagesAct.getResources().getDrawable(ibc0.f114164v7) : messagesAct.getResources().getDrawable(ibc0.f114146t7);
                }
                bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.owy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f149586a.m208341W(vText, view);
                    }
                });
            } else if (TextUtils.equals(sticker.name, "prologue")) {
                drawable = this.f191335d.getResources().getDrawable(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114119q7 : ibc0.f114110p7);
                bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.pwy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f154451a.m208343Y(vText, view);
                    }
                });
            } else if (TextUtils.equals(sticker.name, "chatPrologue")) {
                drawable = this.f191335d.getResources().getDrawable(ibc0.f114128r7);
                bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.qwy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f159989a.m208345a0(vText, view);
                    }
                });
            } else {
                drawable = null;
            }
            if (NullChecker.m82486a(drawable)) {
                drawable.setBounds(0, 0, qa00.m175859d(20.0f), qa00.m175859d(20.0f));
                vText.setCompoundDrawables(drawable, null, null, null);
            }
        }
        vText.setText(sticker.status);
    }

    /* JADX INFO: renamed from: g0 */
    public Picture.ImageUri m208351g0(Picture picture) {
        return picture.aboutWidth((bnl0.m105592y0() - (qa00.m175859d(12.0f) * 5)) / 4, ".png");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f191336e == 10) {
            return 2;
        }
        return i == this.f191334c.size() ? 0 : 1;
    }
}
