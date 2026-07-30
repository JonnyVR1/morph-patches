package p003l;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p000p1.mobile.putong.core.p001ui.messages.meme.CorePopularMemeAct;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.core.ui.breaking.SwapAnswerBottomSheetAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c3c0;
import l.j760;
import l.l6c0;
import l.mkd0;
import l.mqi0;
import l.o7r;
import l.ogw;
import l.qib0;
import l.rn7;
import l.szb0;
import l.t100;
import l.ura;
import l.vwb;
import l.xdl0;
import l.y19;
import l.y4c0;
import l.zvf0;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VText;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class zny extends dac0<Sticker> {

    /* JADX INFO: renamed from: d */
    public final MessagesAct f9384d;

    /* JADX INFO: renamed from: e */
    public int f9385e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f9386f = false;

    /* JADX INFO: renamed from: c */
    public final List<Sticker> f9383c = new ArrayList();

    public zny(MessagesAct messagesAct) {
        this.f9384d = messagesAct;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m9440O(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ boolean m9441S(int i, int i2, int i3, Intent intent) {
        if (i2 != i || i3 != -1 || !NullChecker.a(intent)) {
            return false;
        }
        Sticker sticker = (Sticker) intent.getSerializableExtra(CorePopularMemeAct.f1753o);
        if (!NullChecker.a(sticker)) {
            return true;
        }
        m9455d0(sticker);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m9442T(View view, View view2) {
        zvf0.r("e_gif_search", "p_chat_view");
        Intent intent = new Intent(view.getContext(), (Class<?>) CorePopularMemeAct.class);
        intent.putExtra(CorePopularMemeAct.f1748j, true);
        if (this.f9385e == 1 && !TextUtils.isEmpty(this.f9384d.m2072w2().m7940l0())) {
            intent.putExtra(CorePopularMemeAct.f1752n, this.f9384d.m2072w2().m7940l0());
            intent.putExtra(CorePopularMemeAct.f1751m, true);
        }
        MessagesAct messagesAct = this.f9384d;
        final int i = IjkMediaPlayer.PROP_FLOAT_PLAYBACK_RATE;
        messagesAct.startActivityForResult(IjkMediaPlayer.PROP_FLOAT_PLAYBACK_RATE, intent, new a.a() { // from class: l.qny
            /* JADX INFO: renamed from: a */
            public final boolean m7024a(int i2, int i3, Intent intent2) {
                return this.f6654a.m9441S(i, i2, i3, intent2);
            }
        });
        this.f9384d.overridePendingTransition(szb0.e, szb0.a);
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: C */
    public int mo203C() {
        if (this.f9383c.size() == 0) {
            return 0;
        }
        return this.f9383c.size() + (this.f9386f ? 1 : 0);
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: D */
    public View mo204D(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return m9444Q(i);
        }
        View viewInflate = o7r.a(viewGroup.getContext()).inflate(l6c0.m, viewGroup, false);
        RecyclerView.p layoutParams = viewInflate.getLayoutParams();
        boolean zG = y19.G();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = zG ? t100.G : t100.J;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = zG ? t100.G : t100.J;
        AppCompatImageView appCompatImageView = (VImage) viewInflate.findViewById(y4c0.o1);
        if (zG) {
            xdl0.X(appCompatImageView, t100.d(11.0f));
        } else {
            xdl0.X(appCompatImageView, t100.d(17.0f));
        }
        AppCompatTextView appCompatTextView = (VText) viewInflate.findViewById(y4c0.C2);
        appCompatTextView.setTextSize(11.0f);
        appCompatTextView.setTypeface(Typeface.DEFAULT_BOLD);
        if (zG) {
            xdl0.U(appCompatTextView, t100.d(8.0f));
            return viewInflate;
        }
        xdl0.U(appCompatTextView, t100.d(10.0f));
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.dac0
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo202A(final View view, Sticker sticker, int i, int i2) {
        if (i == 0) {
            xdl0.L(view, new View.OnClickListener() { // from class: l.ony
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f6186a.m9442T(view, view2);
                }
            });
            return;
        }
        if (i == 2 && (view instanceof VText)) {
            m9457f0((VText) view, sticker);
        } else if (i == 1 && (view instanceof VDraweeView)) {
            m9456e0((VDraweeView) view, sticker);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View, android.widget.TextView, androidx.appcompat.widget.AppCompatTextView, v.VText] */
    /* JADX INFO: renamed from: Q */
    public final View m9444Q(int i) {
        if (i == 2) {
            ?? vText = new VText(this.f9384d);
            vText.setLayoutParams(new ViewGroup.LayoutParams(-2, t100.w));
            xdl0.d0((View) vText, t100.h);
            xdl0.e0((View) vText, t100.i);
            vText.setBackgroundResource(c3c0.l);
            vText.setTextColor(Color.parseColor("#CC000000"));
            vText.setEmojiEnable(true);
            vText.setLargeEmojiEnable(true);
            vText.setTextSize(14.0f);
            vText.setGravity(16);
            return vText;
        }
        SimpleDraweeView vDraweeView = new VDraweeView(this.f9384d);
        if (this.f9385e == 1) {
            if (y19.G()) {
                int i2 = t100.G;
                vDraweeView.setLayoutParams(new RecyclerView.p(i2, i2));
                return vDraweeView;
            }
            int i3 = t100.J;
            vDraweeView.setLayoutParams(new RecyclerView.p(i3, i3));
            return vDraweeView;
        }
        if (y19.a()) {
            int i4 = koy.f4985j;
            vDraweeView.setLayoutParams(new RecyclerView.p(i4, i4));
            return vDraweeView;
        }
        int i5 = koy.f4984i;
        vDraweeView.setLayoutParams(new RecyclerView.p(i5, i5));
        return vDraweeView;
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public Sticker getItem(int i) {
        if (i == this.f9383c.size()) {
            return null;
        }
        return this.f9383c.get(i);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m9446U(Sticker sticker) {
        this.f9384d.f1531f.m4168R6(sticker, false);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m9447V(Sticker sticker, View view) {
        zvf0.u("e_chat_icebreak_gif", "p_chat_view", new j760[]{vwb.Y("other_user_id", this.f9384d.mo2066l().m4295r3()), vwb.Y("gift_url", ((Media) ((Picture) sticker.pictures.get(0))).url), vwb.Y("chat_source", koy.m5735l(this.f9385e))});
        m9455d0(sticker);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m9448W(VText vText, View view) {
        if (this.f9384d.m2072w2() instanceof bpz) {
            MessagesAct messagesAct = this.f9384d;
            SwapAnswerBottomSheetAct.D2(messagesAct, messagesAct.mo2066l().m4295r3(), (String) null);
            zvf0.u("e_shortcut", this.f9384d.pageId(), new j760[]{j760.a("show_tag", vText.getText())});
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m9449X() {
        this.f9384d.f1531f.Kg();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m9450Y(VText vText, View view) {
        if (this.f9384d.m2072w2() instanceof bpz) {
            this.f9384d.m2072w2().mo3081Q1(true, new Runnable() { // from class: l.pny
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6466a.m9449X();
                }
            });
            zvf0.u("e_shortcut", this.f9384d.pageId(), new j760[]{j760.a("show_tag", vText.getText())});
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m9451Z() {
        kyb0 kyb0Var = (kyb0) this.f9384d.f1531f.uc(kyb0.class);
        if (kyb0Var != null) {
            ((bpz) this.f9384d.m2072w2()).m3126l5(kyb0Var.m5903d(), "click_entrance");
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m9452a0(VText vText, View view) {
        if (this.f9384d.m2072w2() instanceof bpz) {
            this.f9384d.m2072w2().mo3081Q1(true, new Runnable() { // from class: l.yny
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9084a.m9451Z();
                }
            });
            zvf0.u("e_shortcut", this.f9384d.pageId(), new j760[]{j760.a("show_tag", vText.getText())});
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m9453b0(Sticker sticker, VText vText, View view) {
        this.f9384d.f1531f.m4173S6(sticker.status);
        zvf0.u("e_shortcut", this.f9384d.pageId(), new j760[]{j760.a("show_tag", vText.getText())});
    }

    /* JADX INFO: renamed from: c0 */
    public void m9454c0(List<Sticker> list, int i) {
        this.f9385e = i;
        this.f9383c.clear();
        this.f9386f = false;
        if (i == 1) {
            if (!y19.G()) {
                this.f9386f = true;
            } else if (list.size() > 5) {
                for (int i2 = 0; i2 < 5; i2++) {
                    this.f9383c.add(list.get(i2));
                }
                this.f9386f = true;
                notifyDataSetChanged();
                return;
            }
        }
        this.f9383c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m9455d0(Sticker sticker) {
        this.f9384d.f1531f.m6497e0().mo2046A0().m6499g0().m4844t0().getBar_center_text().setText("");
        this.f9384d.duringCreated(CoreModule.c.Z.T.Q(sticker.cloneSticker()).filter(new rn7()).take(1)).subscribe((m250) mkd0.H(new e30() { // from class: l.wny
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8577a.m9446U((Sticker) obj);
            }
        }, new e30() { // from class: l.xny
            @Override // p003l.e30
            public final void call(Object obj) {
                zny.m9440O((Throwable) obj);
            }
        }));
        int i = this.f9385e;
        if (i == 4) {
            CoreModule.c.f0.N0.put(0);
            CoreModule.c.f0.M0.put(Long.valueOf(mqi0.o()));
        } else if (i == 5) {
            CoreModule.c.f0.P0.put(0);
            CoreModule.c.f0.O0.put(Long.valueOf(mqi0.o()));
        } else if (i == 9) {
            ConversationCounterTypeSp.iceBreakLastMessageShowCountLimit.set(this.f9384d.f1531f.f3543c, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public final void m9456e0(VDraweeView vDraweeView, final Sticker sticker) {
        CoreModule.N().R9(vDraweeView, 10.0f);
        if (vwb.J(sticker.pictures)) {
            qib0.G.o(vDraweeView);
            return;
        }
        if (TEnum.equals(sticker.source, "shanmeng")) {
            qib0.G.L0(vDraweeView, ((Media) ((Picture) sticker.pictures.get(0))).url);
            sticker.hash = ogw.e(((Media) ((Picture) sticker.pictures.get(0))).url);
        } else {
            qib0.G.B0(vDraweeView, m9458g0((Picture) sticker.pictures.get(0)));
        }
        xdl0.L(vDraweeView, new View.OnClickListener() { // from class: l.vny
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8356a.m9447V(sticker, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public final void m9457f0(final VText vText, final Sticker sticker) {
        Drawable drawable;
        vText.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        vText.setCompoundDrawablePadding(t100.c);
        if (TextUtils.equals(sticker.name, "phrase")) {
            xdl0.E0(vText, new View.OnClickListener() { // from class: l.uny
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8036a.m9453b0(sticker, vText, view);
                }
            });
        } else {
            if (TextUtils.equals(sticker.name, "exchange")) {
                if (ura.e().d().I4()) {
                    drawable = this.f9384d.getResources().getDrawable(c3c0.u7);
                } else {
                    boolean zJ = y19.J();
                    MessagesAct messagesAct = this.f9384d;
                    drawable = zJ ? messagesAct.getResources().getDrawable(c3c0.v7) : messagesAct.getResources().getDrawable(c3c0.t7);
                }
                xdl0.E0(vText, new View.OnClickListener() { // from class: l.rny
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f7003a.m9448W(vText, view);
                    }
                });
            } else if (TextUtils.equals(sticker.name, "prologue")) {
                drawable = this.f9384d.getResources().getDrawable(ura.e().d().I4() ? c3c0.q7 : c3c0.p7);
                xdl0.E0(vText, new View.OnClickListener() { // from class: l.sny
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f7268a.m9450Y(vText, view);
                    }
                });
            } else if (TextUtils.equals(sticker.name, "chatPrologue")) {
                drawable = this.f9384d.getResources().getDrawable(c3c0.r7);
                xdl0.E0(vText, new View.OnClickListener() { // from class: l.tny
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f7564a.m9452a0(vText, view);
                    }
                });
            } else {
                drawable = null;
            }
            if (NullChecker.a(drawable)) {
                drawable.setBounds(0, 0, t100.d(20.0f), t100.d(20.0f));
                vText.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        vText.setText(sticker.status);
    }

    /* JADX INFO: renamed from: g0 */
    public Picture.ImageUri m9458g0(Picture picture) {
        return picture.aboutWidth((xdl0.y0() - (t100.d(12.0f) * 5)) / 4, ".png");
    }

    public int getItemViewType(int i) {
        if (this.f9385e == 10) {
            return 2;
        }
        return i == this.f9383c.size() ? 0 : 1;
    }
}
