package p149l;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.core.p053ui.breaking.SwapAnswerBottomSheetAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.meme.CorePopularMemeAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class zny extends dac0<Sticker> {

    /* JADX INFO: renamed from: d */
    public final MessagesAct f204032d;

    /* JADX INFO: renamed from: e */
    public int f204033e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f204034f = false;

    /* JADX INFO: renamed from: c */
    public final List<Sticker> f204031c = new ArrayList();

    public zny(MessagesAct messagesAct) {
        this.f204032d = messagesAct;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m219516O(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ boolean m219517S(int i, int i2, int i3, Intent intent) {
        if (i2 != i || i3 != -1 || !NullChecker.m81303a(intent)) {
            return false;
        }
        Sticker sticker = (Sticker) intent.getSerializableExtra(CorePopularMemeAct.f31862o);
        if (!NullChecker.m81303a(sticker)) {
            return true;
        }
        m219531d0(sticker);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m219518T(View view, View view2) {
        zvf0.m220396r("e_gif_search", OMSDialogPositon.p_chat_view);
        Intent intent = new Intent(view.getContext(), (Class<?>) CorePopularMemeAct.class);
        intent.putExtra(CorePopularMemeAct.f31857j, true);
        if (this.f204033e == 1 && !TextUtils.isEmpty(this.f204032d.m48980w2().m190314l0())) {
            intent.putExtra(CorePopularMemeAct.f31861n, this.f204032d.m48980w2().m190314l0());
            intent.putExtra(CorePopularMemeAct.f31860m, true);
        }
        final int i = 10003;
        this.f204032d.startActivityForResult(10003, intent, new C4317a.a() { // from class: l.qny
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i2, int i3, Intent intent2) {
                return this.f155497a.m219517S(i, i2, i3, intent2);
            }
        });
        this.f204032d.overridePendingTransition(szb0.f167030e, szb0.f167026a);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f204031c.size() == 0) {
            return 0;
        }
        return this.f204031c.size() + (this.f204034f ? 1 : 0);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return m219520Q(i);
        }
        View viewInflate = o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126515m, viewGroup, false);
        RecyclerView.C0578p c0578p = (RecyclerView.C0578p) viewInflate.getLayoutParams();
        boolean zM212147G = y19.m212147G();
        ((ViewGroup.MarginLayoutParams) c0578p).width = zM212147G ? t100.f167232G : t100.f167235J;
        ((ViewGroup.MarginLayoutParams) c0578p).height = zM212147G ? t100.f167232G : t100.f167235J;
        VImage vImage = (VImage) viewInflate.findViewById(y4c0.f196187o1);
        if (zM212147G) {
            xdl0.m208360X(vImage, t100.m186890d(11.0f));
        } else {
            xdl0.m208360X(vImage, t100.m186890d(17.0f));
        }
        VText vText = (VText) viewInflate.findViewById(y4c0.f195945C2);
        vText.setTextSize(11.0f);
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        if (zM212147G) {
            xdl0.m208357U(vText, t100.m186890d(8.0f));
            return viewInflate;
        }
        xdl0.m208357U(vText, t100.m186890d(10.0f));
        return viewInflate;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo28823A(final View view, Sticker sticker, int i, int i2) {
        if (i == 0) {
            xdl0.m208342L(view, new View.OnClickListener() { // from class: l.ony
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f144829a.m219518T(view, view2);
                }
            });
            return;
        }
        if (i == 2 && (view instanceof VText)) {
            m219533f0((VText) view, sticker);
        } else if (i == 1 && (view instanceof VDraweeView)) {
            m219532e0((VDraweeView) view, sticker);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final View m219520Q(int i) {
        if (i == 2) {
            VText vText = new VText(this.f204032d);
            vText.setLayoutParams(new ViewGroup.LayoutParams(-2, t100.f167274w));
            xdl0.m208370d0(vText, t100.f167259h);
            xdl0.m208372e0(vText, t100.f167260i);
            vText.setBackgroundResource(c3c0.f78791l);
            vText.setTextColor(Color.parseColor("#CC000000"));
            vText.setEmojiEnable(true);
            vText.setLargeEmojiEnable(true);
            vText.setTextSize(14.0f);
            vText.setGravity(16);
            return vText;
        }
        VDraweeView vDraweeView = new VDraweeView(this.f204032d);
        if (this.f204033e == 1) {
            if (y19.m212147G()) {
                int i2 = t100.f167232G;
                vDraweeView.setLayoutParams(new RecyclerView.C0578p(i2, i2));
                return vDraweeView;
            }
            int i3 = t100.f167235J;
            vDraweeView.setLayoutParams(new RecyclerView.C0578p(i3, i3));
            return vDraweeView;
        }
        if (y19.m212166a()) {
            int i4 = koy.f124069j;
            vDraweeView.setLayoutParams(new RecyclerView.C0578p(i4, i4));
            return vDraweeView;
        }
        int i5 = koy.f124068i;
        vDraweeView.setLayoutParams(new RecyclerView.C0578p(i5, i5));
        return vDraweeView;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public Sticker getItem(int i) {
        if (i == this.f204031c.size()) {
            return null;
        }
        return this.f204031c.get(i);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m219522U(Sticker sticker) {
        this.f204032d.f31640f.m120703R6(sticker, false);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m219523V(Sticker sticker, View view) {
        zvf0.m220399u("e_chat_icebreak_gif", OMSDialogPositon.p_chat_view, vwb.m200311Y("other_user_id", this.f204032d.mo48974l().mo120828r3()), vwb.m200311Y("gift_url", sticker.pictures.get(0).url), vwb.m200311Y("chat_source", koy.m146769l(this.f204033e)));
        m219531d0(sticker);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m219524W(VText vText, View view) {
        if (this.f204032d.m48980w2() instanceof bpz) {
            MessagesAct messagesAct = this.f204032d;
            SwapAnswerBottomSheetAct.m44449D2(messagesAct, messagesAct.mo48974l().mo120828r3(), null);
            zvf0.m220399u("e_shortcut", this.f204032d.pageId(), j760.m140076a("show_tag", vText.getText()));
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m219525X() {
        ((wmz) this.f204032d.f31640f).m204368Kg();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m219526Y(VText vText, View view) {
        if (this.f204032d.m48980w2() instanceof bpz) {
            this.f204032d.m48980w2().mo103201Q1(true, new Runnable() { // from class: l.pny
                @Override // java.lang.Runnable
                public final void run() {
                    this.f150429a.m219525X();
                }
            });
            zvf0.m220399u("e_shortcut", this.f204032d.pageId(), j760.m140076a("show_tag", vText.getText()));
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m219527Z() {
        kyb0 kyb0Var = (kyb0) ((wmz) this.f204032d.f31640f).m204522uc(kyb0.class);
        if (kyb0Var != null) {
            ((bpz) this.f204032d.m48980w2()).m103246l5(kyb0Var.m147851d(), "click_entrance");
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m219528a0(VText vText, View view) {
        if (this.f204032d.m48980w2() instanceof bpz) {
            this.f204032d.m48980w2().mo103201Q1(true, new Runnable() { // from class: l.yny
                @Override // java.lang.Runnable
                public final void run() {
                    this.f199244a.m219527Z();
                }
            });
            zvf0.m220399u("e_shortcut", this.f204032d.pageId(), j760.m140076a("show_tag", vText.getText()));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m219529b0(Sticker sticker, VText vText, View view) {
        this.f204032d.f31640f.m120708S6(sticker.status);
        zvf0.m220399u("e_shortcut", this.f204032d.pageId(), j760.m140076a("show_tag", vText.getText()));
    }

    /* JADX INFO: renamed from: c0 */
    public void m219530c0(List<Sticker> list, int i) {
        this.f204033e = i;
        this.f204031c.clear();
        this.f204034f = false;
        if (i == 1) {
            if (!y19.m212147G()) {
                this.f204034f = true;
            } else if (list.size() > 5) {
                for (int i2 = 0; i2 < 5; i2++) {
                    this.f204031c.add(list.get(i2));
                }
                this.f204034f = true;
                notifyDataSetChanged();
                return;
            }
        }
        this.f204031c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m219531d0(Sticker sticker) {
        this.f204032d.f31640f.m156455e0().mo48954A0().m156457g0().m128210t0().getBar_center_text().setText("");
        this.f204032d.duringCreated(CoreModule.f17545c.f19624Z.f20143T.m34952Q(sticker.cloneSticker()).filter(new rn7()).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.wny
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187363a.m219522U((Sticker) obj);
            }
        }, new e30() { // from class: l.xny
            @Override // p149l.e30
            public final void call(Object obj) {
                zny.m219516O((Throwable) obj);
            }
        }));
        int i = this.f204033e;
        if (i == 4) {
            CoreModule.f17545c.f19642f0.f19880N0.put(0);
            CoreModule.f17545c.f19642f0.f19877M0.put(Long.valueOf(mqi0.m155944o()));
        } else if (i == 5) {
            CoreModule.f17545c.f19642f0.f19886P0.put(0);
            CoreModule.f17545c.f19642f0.f19883O0.put(Long.valueOf(mqi0.m155944o()));
        } else if (i == 9) {
            ConversationCounterTypeSp.iceBreakLastMessageShowCountLimit.set(this.f204032d.f31640f.f96911c, 0);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m219532e0(VDraweeView vDraweeView, final Sticker sticker) {
        CoreModule.m29934N().mo60310R9(vDraweeView, 10.0f);
        if (vwb.m200296J(sticker.pictures)) {
            qib0.f154691G.m184725o(vDraweeView);
            return;
        }
        if (TEnum.equals(sticker.source, "shanmeng")) {
            qib0.f154691G.m102331L0(vDraweeView, sticker.pictures.get(0).url);
            sticker.hash = ogw.m164284e(sticker.pictures.get(0).url);
        } else {
            qib0.f154691G.m102312B0(vDraweeView, m219534g0(sticker.pictures.get(0)));
        }
        xdl0.m208342L(vDraweeView, new View.OnClickListener() { // from class: l.vny
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182289a.m219523V(sticker, view);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m219533f0(final VText vText, final Sticker sticker) {
        Drawable drawable;
        vText.setCompoundDrawables(null, null, null, null);
        vText.setCompoundDrawablePadding(t100.f167254c);
        if (TextUtils.equals(sticker.name, "phrase")) {
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.uny
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f177472a.m219529b0(sticker, vText, view);
                }
            });
        } else {
            if (TextUtils.equals(sticker.name, "exchange")) {
                if (ura.m195053e().m195057d().mo33699I4()) {
                    drawable = this.f204032d.getResources().getDrawable(c3c0.f78880u7);
                } else {
                    boolean zM212150J = y19.m212150J();
                    MessagesAct messagesAct = this.f204032d;
                    drawable = zM212150J ? messagesAct.getResources().getDrawable(c3c0.f78889v7) : messagesAct.getResources().getDrawable(c3c0.f78871t7);
                }
                xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.rny
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f160337a.m219524W(vText, view);
                    }
                });
            } else if (TextUtils.equals(sticker.name, "prologue")) {
                drawable = this.f204032d.getResources().getDrawable(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78844q7 : c3c0.f78835p7);
                xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.sny
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f165526a.m219526Y(vText, view);
                    }
                });
            } else if (TextUtils.equals(sticker.name, "chatPrologue")) {
                drawable = this.f204032d.getResources().getDrawable(c3c0.f78853r7);
                xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.tny
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f171298a.m219528a0(vText, view);
                    }
                });
            } else {
                drawable = null;
            }
            if (NullChecker.m81303a(drawable)) {
                drawable.setBounds(0, 0, t100.m186890d(20.0f), t100.m186890d(20.0f));
                vText.setCompoundDrawables(drawable, null, null, null);
            }
        }
        vText.setText(sticker.status);
    }

    /* JADX INFO: renamed from: g0 */
    public Picture.ImageUri m219534g0(Picture picture) {
        return picture.aboutWidth((xdl0.m208412y0() - (t100.m186890d(12.0f) * 5)) / 4, ".png");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f204033e == 10) {
            return 2;
        }
        return i == this.f204031c.size() ? 0 : 1;
    }
}
