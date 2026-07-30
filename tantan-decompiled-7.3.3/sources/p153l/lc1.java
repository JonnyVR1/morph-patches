package p153l;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.QuickChatPartyCampaignPage;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.DropDownAct;
import com.p051p1.mobile.putong.data.UnlockConversationType;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.iliveroom.TXILiveRoomDefine;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class lc1 extends g1e {

    /* JADX INFO: renamed from: j */
    public ConstraintLayout f131250j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f131251k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f131252l;

    /* JADX INFO: renamed from: m */
    public ImageView f131253m;

    /* JADX INFO: renamed from: n */
    public VImage f131254n;

    /* JADX INFO: renamed from: o */
    public VText f131255o;

    /* JADX INFO: renamed from: p */
    public VText f131256p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f131257q;

    /* JADX INFO: renamed from: r */
    public VText f131258r;

    /* JADX INFO: renamed from: s */
    public VText f131259s;

    /* JADX INFO: renamed from: t */
    public View f131260t;

    /* JADX INFO: renamed from: u */
    public Act f131261u;

    /* JADX INFO: renamed from: v */
    public l4g0 f131262v;

    /* JADX INFO: renamed from: w */
    public QuickChatPartyCampaignPage f131263w;

    /* JADX INFO: renamed from: x */
    public Map<Integer, pf60<Integer, Integer>> f131264x;

    public lc1(Act act, QuickChatPartyCampaignPage quickChatPartyCampaignPage) {
        super(act, false, dgc0.f88277b);
        this.f131264x = new HashMap(24);
        this.f131261u = act;
        this.f131263w = quickChatPartyCampaignPage;
    }

    /* JADX INFO: renamed from: L */
    private String m153604L(int i) {
        switch (i) {
            case 0:
                return "每周日";
            case 1:
                return "每周一";
            case 2:
                return "每周二";
            case 3:
                return "每周三";
            case 4:
                return "每周四";
            case 5:
                return "每周五";
            case 6:
                return "每周六";
            case 7:
                return "每周日";
            default:
                return "每周";
        }
    }

    /* JADX INFO: renamed from: M */
    private void m153605M() {
        this.f131254n.setImageResource(dbc0.f87554wo);
        uqb0.f180374G.m127109I0(this.f131252l, "https://static.tancdn.com/pe-webplatform/XJvjQCUAgG5U7X23Hy_4Mgxo.webp", qa00.m175859d(272.0f), qa00.m175859d(272.0f));
        uqb0.f180374G.m127109I0(this.f131251k, "https://static.tancdn.com/pe-webplatform/0ehHwqaySoNpt_4Ce5KsYbDq.webp", qa00.m175859d(236.0f), qa00.m175859d(228.0f));
        uqb0.f180374G.m127109I0(this.f131257q, "https://static.tancdn.com/pe-webplatform/WZj8NDixaW5RhIFWlQug_4JA.webp", qa00.m175859d(311.0f), qa00.m175859d(320.0f));
    }

    /* JADX INFO: renamed from: N */
    private void m153606N() {
        this.f131254n.setImageResource(dbc0.f87586xo);
        uqb0.f180374G.m127109I0(this.f131252l, "https://static.tancdn.com/pe-webplatform/d1leZpYbk787D4DthEXMG_EV.webp", qa00.m175859d(272.0f), qa00.m175859d(272.0f));
        uqb0.f180374G.m127109I0(this.f131251k, "https://static.tancdn.com/pe-webplatform/4Mf14tKMzXfmszs-NB4SdlaY.webp", qa00.m175859d(236.0f), qa00.m175859d(228.0f));
        uqb0.f180374G.m127109I0(this.f131257q, "https://static.tancdn.com/pe-webplatform/Espsnpgm79p15sNAVGOcsGTv.webp", qa00.m175859d(311.0f), qa00.m175859d(320.0f));
    }

    /* JADX INFO: renamed from: O */
    private void m153607O() {
        if (NullChecker.m82486a(this.f131263w) && TEnum.equals(this.f131263w.partyType, "quickchat")) {
            m153606N();
        } else {
            m153605M();
        }
    }

    /* JADX INFO: renamed from: P */
    private void m153608P() {
        m153607O();
        this.f131256p.setText(m153617K());
        this.f131258r.setText(m153615I());
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C0221a) this.f131253m.getLayoutParams())).topMargin = bnl0.m105511F0() + qa00.f156320g;
        this.f131255o.setTypeface(Typeface.defaultFromStyle(1));
        this.f131259s.setTypeface(Typeface.defaultFromStyle(1));
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ic1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f114269a.m153609Q(dialogInterface);
            }
        });
        bnl0.m105509E0(this.f131259s, new View.OnClickListener() { // from class: l.jc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120016a.m153610R(view);
            }
        });
        bnl0.m105509E0(this.f131253m, new View.OnClickListener() { // from class: l.kc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125012a.m153611S(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m153609Q(DialogInterface dialogInterface) {
        w1e.m204401e(this.f131262v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m153610R(View view) {
        boolean z = NullChecker.m82486a(this.f131263w) && TEnum.equals(this.f131263w.partyType, "quickchat");
        dismiss();
        if (z) {
            i4g0.m138523u("e_quickchat_button", "p_quickchat_party_begin", pf60.m172085a("remainingtimes", Integer.valueOf(C8772a.m51429b0())));
            Act act = this.f131261u;
            act.startActivity(DropDownAct.m55631c2(act, UnlockConversationType.quick_chat, "text_quickchat_party", Boolean.FALSE));
        } else {
            i4g0.m138523u("e_voicechat_button", "p_quickchat_party_begin", pf60.m172085a("remainingtimes", Integer.valueOf(wyb0.m208508i0())));
            Act act2 = this.f131261u;
            act2.startActivity(DropDownAct.m55631c2(act2, "voice_quick_chat", "voice_quickchat_party", Boolean.FALSE));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m153611S(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: T */
    private void m153612T() {
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    }

    /* JADX INFO: renamed from: U */
    public static void m153613U(@NonNull Act act, @NonNull QuickChatPartyCampaignPage quickChatPartyCampaignPage) {
        new lc1(act, quickChatPartyCampaignPage).show();
    }

    /* JADX INFO: renamed from: H */
    public View m153614H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mc1.m157910b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: I */
    public final String m153615I() {
        return "活动火热进行中\n目前共有" + m153616J() + "人在线热聊";
    }

    /* JADX INFO: renamed from: J */
    public final int m153616J() {
        if (this.f131264x.size() <= 0) {
            this.f131264x.put(0, pf60.m172085a(8762, 11014));
            this.f131264x.put(1, pf60.m172085a(5528, 9765));
            this.f131264x.put(2, pf60.m172085a(4669, 6161));
            this.f131264x.put(3, pf60.m172085a(3211, 5203));
            this.f131264x.put(4, pf60.m172085a(2881, 3578));
            this.f131264x.put(5, pf60.m172085a(4249, 6004));
            this.f131264x.put(6, pf60.m172085a(5388, 8066));
            this.f131264x.put(7, pf60.m172085a(7238, 10093));
            this.f131264x.put(8, pf60.m172085a(8347, 11238));
            this.f131264x.put(9, pf60.m172085a(9294, 12185));
            this.f131264x.put(10, pf60.m172085a(11164, Integer.valueOf(CommandMessage.COMMAND_STATISTIC)));
            this.f131264x.put(11, pf60.m172085a(12261, 12837));
            this.f131264x.put(12, pf60.m172085a(10707, 12454));
            this.f131264x.put(13, pf60.m172085a(11410, 12639));
            this.f131264x.put(14, pf60.m172085a(11444, 12759));
            this.f131264x.put(15, pf60.m172085a(Integer.valueOf(TXILiveRoomDefine.TXILiveRoomErrorMusicNotSupportSampleRate), 12570));
            this.f131264x.put(16, pf60.m172085a(11516, 12914));
            this.f131264x.put(17, pf60.m172085a(10781, 12353));
            this.f131264x.put(18, pf60.m172085a(11317, 13007));
            this.f131264x.put(19, pf60.m172085a(11917, 14604));
            this.f131264x.put(20, pf60.m172085a(13380, 15737));
            this.f131264x.put(21, pf60.m172085a(14238, 15995));
            this.f131264x.put(22, pf60.m172085a(13014, 13793));
            this.f131264x.put(23, pf60.m172085a(11781, 12583));
        }
        pf60<Integer, Integer> pf60Var = this.f131264x.get(Integer.valueOf(Calendar.getInstance().get(11)));
        return (int) ((((double) (pf60Var.f152157b.intValue() - pf60Var.f152156a.intValue())) * Math.random()) + ((double) pf60Var.f152156a.intValue()));
    }

    /* JADX INFO: renamed from: K */
    public final String m153617K() {
        StringBuilder sb = new StringBuilder();
        QuickChatPartyCampaignPage quickChatPartyCampaignPage = this.f131263w;
        if (quickChatPartyCampaignPage == null || !quickChatPartyCampaignPage.isValueAvailable()) {
            sb.append("每周");
            return sb.toString();
        }
        sb.append(m153604L(this.f131263w.weekDay));
        int i = this.f131263w.beginHour;
        if (i > 9) {
            sb.append(i);
        } else {
            sb.append(0);
            sb.append(this.f131263w.beginHour);
        }
        sb.append(":00至");
        int i2 = this.f131263w.endHour;
        if (i2 > 9) {
            sb.append(i2);
        } else {
            sb.append(0);
            sb.append(this.f131263w.endHour);
        }
        sb.append(":00，限时开启");
        return sb.toString();
    }

    @Override // p153l.g1e, android.app.Dialog, android.content.DialogInterface, p153l.j1e.InterfaceC17849b
    public void dismiss() {
        super.dismiss();
    }

    @Override // p153l.g1e, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewM153614H = m153614H(this.f131261u.getLayoutInflater(), null);
        this.f131260t = viewM153614H;
        setContentView(viewM153614H);
        m153612T();
        m153608P();
    }

    @Override // p153l.g1e, android.app.Dialog
    public void show() {
        super.show();
        l4g0 l4g0VarM204399c = w1e.m204399c("p_quickchat_party_begin", getClass().getName());
        this.f131262v = l4g0VarM204399c;
        l4g0VarM204399c.m152780o(sfj0.m185595b(sfj0.C20032a.m185616i("is_voicechat", (NullChecker.m82486a(this.f131263w) && TEnum.equals(this.f131263w.partyType, "quickchat")) ? false : true)));
        w1e.m204402f(this.f131262v);
    }
}
