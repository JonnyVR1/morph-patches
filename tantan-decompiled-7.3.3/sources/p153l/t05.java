package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatPartnerText;
import com.p051p1.mobile.putong.core.data.ChatPartners;
import com.p051p1.mobile.putong.core.newui.partner.ChatPartnerSelectFriendAct;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class t05 extends pej0 {

    /* JADX INFO: renamed from: f */
    public VLinear f171446f;

    /* JADX INFO: renamed from: g */
    public VImage f171447g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f171448h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f171449i;

    /* JADX INFO: renamed from: j */
    public VText f171450j;

    /* JADX INFO: renamed from: k */
    public VLinear f171451k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f171452l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f171453m;

    /* JADX INFO: renamed from: n */
    public VText f171454n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f171455o;

    /* JADX INFO: renamed from: p */
    public VRecyclerView f171456p;

    /* JADX INFO: renamed from: q */
    public View f171457q;

    /* JADX INFO: renamed from: r */
    public VText_Bold f171458r;

    /* JADX INFO: renamed from: s */
    public Act f171459s;

    /* JADX INFO: renamed from: t */
    public l4g0 f171460t;

    /* JADX INFO: renamed from: u */
    public ChatPartnerText f171461u;

    /* JADX INFO: renamed from: v */
    public ChatPartners f171462v;

    /* JADX INFO: renamed from: l.t05$b */
    public class C20201b extends jic0<ChatPartnerText> {

        /* JADX INFO: renamed from: c */
        public final List<ChatPartnerText> f171465c;

        public C20201b(List<ChatPartnerText> list) {
            ArrayList arrayList = new ArrayList();
            this.f171465c = arrayList;
            arrayList.addAll(list);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f171465c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(t05.this.getContext()).inflate(kec0.f125941m1, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final ChatPartnerText chatPartnerText, int i, int i2) {
            VText vText = (VText) view;
            vText.setText(chatPartnerText.value);
            vText.setBackgroundResource((NullChecker.m82486a(t05.this.f171461u) && TextUtils.equals(t05.this.f171461u.value, chatPartnerText.value)) ? dbc0.f87174l5 : dbc0.f87141k5);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.u05
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f176846a.m188717H(chatPartnerText, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public ChatPartnerText getItem(int i) {
            return this.f171465c.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m188717H(ChatPartnerText chatPartnerText, View view) {
            t05.this.f171454n.setText(chatPartnerText.value);
            t05.this.f171461u = chatPartnerText;
            notifyDataSetChanged();
            i4g0.m138523u("e_preset_word", "p_chatting_partner_signal_pop", pf60.m172085a("word_content", t05.this.f171461u.value));
            i4g0.m138492A("e_preset_word", "p_chatting_partner_signal_pop", pf60.m172085a("word_content", t05.this.f171461u.value));
        }
    }

    public t05(@NonNull Act act, ChatPartners chatPartners) {
        super(act, agc0.f71117c);
        this.f171459s = act;
        this.f171462v = chatPartners;
        setCancelable(false);
    }

    /* JADX INFO: renamed from: G */
    private void m188704G() {
        Window window = getWindow();
        this.f171446f.post(new Runnable() { // from class: l.o05
            @Override // java.lang.Runnable
            public final void run() {
                this.f144497a.m188705I();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m82486a(window)) {
            window.setLayout(-1, -1);
            window.setDimAmount(0.3f);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(odc0.f146877p);
            frameLayout.setBackgroundResource(tbc0.f172878a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C20200a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m188705I() {
        getBehavior().setPeekHeight(this.f171446f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m188706J(View view) {
        i4g0.m138520r("e_close_chatting_partner_signal_pop", "p_chatting_partner_signal_pop");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m188707K(View view) {
        if (NullChecker.m82486a(this.f171461u)) {
            i4g0.m138523u("e_sent_chatting_partner_signal", "p_chatting_partner_signal_pop", pf60.m172085a("word_content", this.f171461u.value));
            this.f171459s.startActivity(ChatPartnerSelectFriendAct.m44117a2(this.f171459s, this.f171462v, this.f171461u.f21111id, "pop1"));
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m188708L(DialogInterface dialogInterface) {
        w1e.m204401e(this.f171460t);
        hlh0.m135741a().m135750j(false, "ChatPartnerHalfDialogViewModel");
    }

    /* JADX INFO: renamed from: F */
    public View m188712F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v05.m198881b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public void m188713H() {
        setContentView(m188712F(LayoutInflater.from(this.f171459s), null));
        m172033v(new zyf0());
        uqb0.f180374G.m127115L0(this.f171452l, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted());
        if (CoreModule.m30932N().mo61460Gc() == null) {
            this.f171453m.setImageResource(dbc0.f87273o5);
        } else {
            uqb0.f180374G.m127115L0(this.f171453m, CoreModule.m30932N().mo61460Gc().emotion.emojiUrl);
        }
        List<ChatPartnerText> list = this.f171462v.texts;
        if (!jyb.m147479J(list)) {
            ChatPartnerText chatPartnerText = list.get(0);
            this.f171461u = chatPartnerText;
            this.f171454n.setText(chatPartnerText.value);
            list.remove(0);
            this.f171456p.setAdapter(new C20201b(list));
        }
        bnl0.m105509E0(this.f171447g, new View.OnClickListener() { // from class: l.r05
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160583a.m188706J(view);
            }
        });
        bnl0.m105509E0(this.f171458r, new View.OnClickListener() { // from class: l.s05
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165659a.m188707K(view);
            }
        });
        if (NullChecker.m82486a(this.f171461u)) {
            i4g0.m138492A("e_preset_word", "p_chatting_partner_signal_pop", pf60.m172085a("word_content", this.f171461u.value));
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m188713H();
        l4g0 l4g0VarM204399c = w1e.m204399c("p_chatting_partner_signal_pop", Dialog.class.getName());
        this.f171460t = l4g0VarM204399c;
        w1e.m204402f(l4g0VarM204399c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.p05
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f150007a.m188708L(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.q05
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                hlh0.m135741a().m135750j(true, "ChatPartnerHalfDialogViewModel");
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m188704G();
    }

    /* JADX INFO: renamed from: l.t05$a */
    public class C20200a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f171463a;

        public C20200a(BottomSheetBehavior bottomSheetBehavior) {
            this.f171463a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f171463a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                t05.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
