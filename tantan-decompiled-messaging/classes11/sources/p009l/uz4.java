package p009l;

import android.R;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.newui.partner.ChatPartnerSelectFriendAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatPartnerText;
import com.p1.mobile.putong.core.data.ChatPartners;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import l.dac0;
import l.f6c0;
import l.i5c0;
import l.j760;
import l.l5j0;
import l.n3c0;
import l.qib0;
import l.v7c0;
import l.vwb;
import l.wz4;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class uz4 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f21379f;

    /* JADX INFO: renamed from: g */
    public VImage f21380g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f21381h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f21382i;

    /* JADX INFO: renamed from: j */
    public VText f21383j;

    /* JADX INFO: renamed from: k */
    public VLinear f21384k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f21385l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f21386m;

    /* JADX INFO: renamed from: n */
    public VText f21387n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f21388o;

    /* JADX INFO: renamed from: p */
    public VRecyclerView f21389p;

    /* JADX INFO: renamed from: q */
    public View f21390q;

    /* JADX INFO: renamed from: r */
    public VText_Bold f21391r;

    /* JADX INFO: renamed from: s */
    public Act f21392s;

    /* JADX INFO: renamed from: t */
    public cwf0 f21393t;

    /* JADX INFO: renamed from: u */
    public ChatPartnerText f21394u;

    /* JADX INFO: renamed from: v */
    public ChatPartners f21395v;

    /* JADX INFO: renamed from: l.uz4$b */
    public class C1226b extends dac0<ChatPartnerText> {

        /* JADX INFO: renamed from: c */
        public final List<ChatPartnerText> f21398c;

        public C1226b(List<ChatPartnerText> list) {
            ArrayList arrayList = new ArrayList();
            this.f21398c = arrayList;
            arrayList.addAll(list);
        }

        /* JADX INFO: renamed from: C */
        public int m23222C() {
            return this.f21398c.size();
        }

        /* JADX INFO: renamed from: D */
        public View m23223D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(uz4.this.getContext()).inflate(f6c0.m1, viewGroup, false);
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void m23221A(View view, final ChatPartnerText chatPartnerText, int i, int i2) {
            VText vText = (VText) view;
            vText.setText(chatPartnerText.value);
            vText.setBackgroundResource((NullChecker.a(uz4.this.f21394u) && TextUtils.equals(uz4.this.f21394u.value, chatPartnerText.value)) ? x2c0.k5 : x2c0.j5);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.vz4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f21825a.m23226H(chatPartnerText, view2);
                }
            });
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public ChatPartnerText getItem(int i) {
            return this.f21398c.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m23226H(ChatPartnerText chatPartnerText, View view) {
            uz4.this.f21387n.setText(chatPartnerText.value);
            uz4.this.f21394u = chatPartnerText;
            notifyDataSetChanged();
            zvf0.u("e_preset_word", "p_chatting_partner_signal_pop", new j760[]{j760.a("word_content", uz4.this.f21394u.value)});
            zvf0.A("e_preset_word", "p_chatting_partner_signal_pop", new j760[]{j760.a("word_content", uz4.this.f21394u.value)});
        }
    }

    public uz4(@NonNull Act act, ChatPartners chatPartners) {
        super(act, v7c0.c);
        this.f21392s = act;
        this.f21395v = chatPartners;
        setCancelable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    private void m23210G() {
        Window window = getWindow();
        this.f21379f.post(new Runnable() { // from class: l.pz4
            @Override // java.lang.Runnable
            public final void run() {
                this.f18974a.m23211I();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.a(window)) {
            window.setLayout(-1, -1);
            window.setDimAmount(0.3f);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.p);
            frameLayout.setBackgroundResource(n3c0.a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C1225a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m23211I() {
        getBehavior().setPeekHeight(this.f21379f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m23212J(View view) {
        zvf0.r("e_close_chatting_partner_signal_pop", "p_chatting_partner_signal_pop");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m23213K(View view) {
        if (NullChecker.a(this.f21394u)) {
            zvf0.u("e_sent_chatting_partner_signal", "p_chatting_partner_signal_pop", new j760[]{j760.a("word_content", this.f21394u.value)});
            this.f21392s.startActivity(ChatPartnerSelectFriendAct.m7314Z1(this.f21392s, this.f21395v, this.f21394u.id, "pop1"));
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m23214L(DialogInterface dialogInterface) {
        i0e.m16064e(this.f21393t);
        zch0.m25654a().m25663j(false, "ChatPartnerHalfDialogViewModel");
    }

    /* JADX INFO: renamed from: F */
    public View m23218F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wz4.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public void m23219H() {
        setContentView(m23218F(LayoutInflater.from(this.f21392s), null));
        v(new qqf0());
        qib0.G.L0(this.f21385l, CoreModule.c.e0.p9().fp().profileSmall().formatted());
        if (CoreModule.N().Gc() == null) {
            this.f21386m.setImageResource(x2c0.n5);
        } else {
            qib0.G.L0(this.f21386m, CoreModule.N().Gc().emotion.emojiUrl);
        }
        List list = this.f21395v.texts;
        if (!vwb.J(list)) {
            ChatPartnerText chatPartnerText = (ChatPartnerText) list.get(0);
            this.f21394u = chatPartnerText;
            this.f21387n.setText(chatPartnerText.value);
            list.remove(0);
            this.f21389p.setAdapter(new C1226b(list));
        }
        xdl0.E0(this.f21380g, new View.OnClickListener() { // from class: l.sz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20503a.m23212J(view);
            }
        });
        xdl0.E0(this.f21391r, new View.OnClickListener() { // from class: l.tz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20925a.m23213K(view);
            }
        });
        if (NullChecker.a(this.f21394u)) {
            zvf0.A("e_preset_word", "p_chatting_partner_signal_pop", new j760[]{j760.a("word_content", this.f21394u.value)});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        m23219H();
        cwf0 cwf0VarM16062c = i0e.m16062c("p_chatting_partner_signal_pop", Dialog.class.getName());
        this.f21393t = cwf0VarM16062c;
        i0e.m16065f(cwf0VarM16062c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.qz4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f19592a.m23214L(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.rz4
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                zch0.m25654a().m25663j(true, "ChatPartnerHalfDialogViewModel");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m23210G();
    }

    /* JADX INFO: renamed from: l.uz4$a */
    public class C1225a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f21396a;

        public C1225a(BottomSheetBehavior bottomSheetBehavior) {
            this.f21396a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f21396a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                uz4.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
