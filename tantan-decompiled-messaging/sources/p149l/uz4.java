package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatPartnerText;
import com.p046p1.mobile.putong.core.data.ChatPartners;
import com.p046p1.mobile.putong.core.newui.partner.ChatPartnerSelectFriendAct;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class uz4 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f178938f;

    /* JADX INFO: renamed from: g */
    public VImage f178939g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f178940h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f178941i;

    /* JADX INFO: renamed from: j */
    public VText f178942j;

    /* JADX INFO: renamed from: k */
    public VLinear f178943k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f178944l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f178945m;

    /* JADX INFO: renamed from: n */
    public VText f178946n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f178947o;

    /* JADX INFO: renamed from: p */
    public VRecyclerView f178948p;

    /* JADX INFO: renamed from: q */
    public View f178949q;

    /* JADX INFO: renamed from: r */
    public VText_Bold f178950r;

    /* JADX INFO: renamed from: s */
    public Act f178951s;

    /* JADX INFO: renamed from: t */
    public cwf0 f178952t;

    /* JADX INFO: renamed from: u */
    public ChatPartnerText f178953u;

    /* JADX INFO: renamed from: v */
    public ChatPartners f178954v;

    /* JADX INFO: renamed from: l.uz4$b */
    public class C20545b extends dac0<ChatPartnerText> {

        /* JADX INFO: renamed from: c */
        public final List<ChatPartnerText> f178957c;

        public C20545b(List<ChatPartnerText> list) {
            ArrayList arrayList = new ArrayList();
            this.f178957c = arrayList;
            arrayList.addAll(list);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f178957c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(uz4.this.getContext()).inflate(f6c0.f95887m1, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final ChatPartnerText chatPartnerText, int i, int i2) {
            VText vText = (VText) view;
            vText.setText(chatPartnerText.value);
            vText.setBackgroundResource((NullChecker.m81303a(uz4.this.f178953u) && TextUtils.equals(uz4.this.f178953u.value, chatPartnerText.value)) ? x2c0.f190288k5 : x2c0.f190256j5);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.vz4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f183582a.m196395H(chatPartnerText, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public ChatPartnerText getItem(int i) {
            return this.f178957c.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m196395H(ChatPartnerText chatPartnerText, View view) {
            uz4.this.f178946n.setText(chatPartnerText.value);
            uz4.this.f178953u = chatPartnerText;
            notifyDataSetChanged();
            zvf0.m220399u("e_preset_word", "p_chatting_partner_signal_pop", j760.m140076a("word_content", uz4.this.f178953u.value));
            zvf0.m220368A("e_preset_word", "p_chatting_partner_signal_pop", j760.m140076a("word_content", uz4.this.f178953u.value));
        }
    }

    public uz4(@NonNull Act act, ChatPartners chatPartners) {
        super(act, v7c0.f180356c);
        this.f178951s = act;
        this.f178954v = chatPartners;
        setCancelable(false);
    }

    /* JADX INFO: renamed from: G */
    private void m196382G() {
        Window window = getWindow();
        this.f178938f.post(new Runnable() { // from class: l.pz4
            @Override // java.lang.Runnable
            public final void run() {
                this.f151915a.m196383I();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m81303a(window)) {
            window.setLayout(-1, -1);
            window.setDimAmount(0.3f);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.f111555p);
            frameLayout.setBackgroundResource(n3c0.f136963a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C20544a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m196383I() {
        getBehavior().setPeekHeight(this.f178938f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m196384J(View view) {
        zvf0.m220396r("e_close_chatting_partner_signal_pop", "p_chatting_partner_signal_pop");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m196385K(View view) {
        if (NullChecker.m81303a(this.f178953u)) {
            zvf0.m220399u("e_sent_chatting_partner_signal", "p_chatting_partner_signal_pop", j760.m140076a("word_content", this.f178953u.value));
            this.f178951s.startActivity(ChatPartnerSelectFriendAct.m43106Z1(this.f178951s, this.f178954v, this.f178953u.f20369id, "pop1"));
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m196386L(DialogInterface dialogInterface) {
        i0e.m133796e(this.f178952t);
        zch0.m218024a().m218033j(false, "ChatPartnerHalfDialogViewModel");
    }

    /* JADX INFO: renamed from: F */
    public View m196390F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wz4.m206244b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public void m196391H() {
        setContentView(m196390F(LayoutInflater.from(this.f178951s), null));
        m148650v(new qqf0());
        qib0.f154691G.m102331L0(this.f178944l, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted());
        if (CoreModule.m29934N().mo60276Gc() == null) {
            this.f178945m.setImageResource(x2c0.f190384n5);
        } else {
            qib0.f154691G.m102331L0(this.f178945m, CoreModule.m29934N().mo60276Gc().emotion.emojiUrl);
        }
        List<ChatPartnerText> list = this.f178954v.texts;
        if (!vwb.m200296J(list)) {
            ChatPartnerText chatPartnerText = list.get(0);
            this.f178953u = chatPartnerText;
            this.f178946n.setText(chatPartnerText.value);
            list.remove(0);
            this.f178948p.setAdapter(new C20545b(list));
        }
        xdl0.m208329E0(this.f178939g, new View.OnClickListener() { // from class: l.sz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167015a.m196384J(view);
            }
        });
        xdl0.m208329E0(this.f178950r, new View.OnClickListener() { // from class: l.tz4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172684a.m196385K(view);
            }
        });
        if (NullChecker.m81303a(this.f178953u)) {
            zvf0.m220368A("e_preset_word", "p_chatting_partner_signal_pop", j760.m140076a("word_content", this.f178953u.value));
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m196391H();
        cwf0 cwf0VarM133794c = i0e.m133794c("p_chatting_partner_signal_pop", Dialog.class.getName());
        this.f178952t = cwf0VarM133794c;
        i0e.m133797f(cwf0VarM133794c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.qz4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f156993a.m196386L(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.rz4
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                zch0.m218024a().m218033j(true, "ChatPartnerHalfDialogViewModel");
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m196382G();
    }

    /* JADX INFO: renamed from: l.uz4$a */
    public class C20544a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f178955a;

        public C20544a(BottomSheetBehavior bottomSheetBehavior) {
            this.f178955a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f178955a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                uz4.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
