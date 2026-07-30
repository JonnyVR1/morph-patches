package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.QuickChatPartyCampaignPage;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.DropDownAct;
import com.p046p1.mobile.putong.data.UnlockConversationType;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.iliveroom.TXILiveRoomDefine;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ec1 extends szd {

    /* JADX INFO: renamed from: j */
    public ConstraintLayout f90450j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f90451k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f90452l;

    /* JADX INFO: renamed from: m */
    public ImageView f90453m;

    /* JADX INFO: renamed from: n */
    public VImage f90454n;

    /* JADX INFO: renamed from: o */
    public VText f90455o;

    /* JADX INFO: renamed from: p */
    public VText f90456p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f90457q;

    /* JADX INFO: renamed from: r */
    public VText f90458r;

    /* JADX INFO: renamed from: s */
    public VText f90459s;

    /* JADX INFO: renamed from: t */
    public View f90460t;

    /* JADX INFO: renamed from: u */
    public Act f90461u;

    /* JADX INFO: renamed from: v */
    public cwf0 f90462v;

    /* JADX INFO: renamed from: w */
    public QuickChatPartyCampaignPage f90463w;

    /* JADX INFO: renamed from: x */
    public Map<Integer, j760<Integer, Integer>> f90464x;

    public ec1(Act act, QuickChatPartyCampaignPage quickChatPartyCampaignPage) {
        super(act, false, y7c0.f196692b);
        this.f90464x = new HashMap(24);
        this.f90461u = act;
        this.f90463w = quickChatPartyCampaignPage;
    }

    /* JADX INFO: renamed from: L */
    private String m115643L(int i) {
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
    private void m115644M() {
        this.f90454n.setImageResource(x2c0.f189400Hn);
        qib0.f154691G.m102325I0(this.f90452l, "https://static.tancdn.com/pe-webplatform/XJvjQCUAgG5U7X23Hy_4Mgxo.webp", t100.m186890d(272.0f), t100.m186890d(272.0f));
        qib0.f154691G.m102325I0(this.f90451k, "https://static.tancdn.com/pe-webplatform/0ehHwqaySoNpt_4Ce5KsYbDq.webp", t100.m186890d(236.0f), t100.m186890d(228.0f));
        qib0.f154691G.m102325I0(this.f90457q, "https://static.tancdn.com/pe-webplatform/WZj8NDixaW5RhIFWlQug_4JA.webp", t100.m186890d(311.0f), t100.m186890d(320.0f));
    }

    /* JADX INFO: renamed from: N */
    private void m115645N() {
        this.f90454n.setImageResource(x2c0.f189431In);
        qib0.f154691G.m102325I0(this.f90452l, "https://static.tancdn.com/pe-webplatform/d1leZpYbk787D4DthEXMG_EV.webp", t100.m186890d(272.0f), t100.m186890d(272.0f));
        qib0.f154691G.m102325I0(this.f90451k, "https://static.tancdn.com/pe-webplatform/4Mf14tKMzXfmszs-NB4SdlaY.webp", t100.m186890d(236.0f), t100.m186890d(228.0f));
        qib0.f154691G.m102325I0(this.f90457q, "https://static.tancdn.com/pe-webplatform/Espsnpgm79p15sNAVGOcsGTv.webp", t100.m186890d(311.0f), t100.m186890d(320.0f));
    }

    /* JADX INFO: renamed from: O */
    private void m115646O() {
        if (NullChecker.m81303a(this.f90463w) && TEnum.equals(this.f90463w.partyType, "quickchat")) {
            m115645N();
        } else {
            m115644M();
        }
    }

    /* JADX INFO: renamed from: P */
    private void m115647P() {
        m115646O();
        this.f90456p.setText(m115656K());
        this.f90458r.setText(m115654I());
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C0220a) this.f90453m.getLayoutParams())).topMargin = xdl0.m208331F0() + t100.f167258g;
        this.f90455o.setTypeface(Typeface.defaultFromStyle(1));
        this.f90459s.setTypeface(Typeface.defaultFromStyle(1));
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.bc1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f74895a.m115648Q(dialogInterface);
            }
        });
        xdl0.m208329E0(this.f90459s, new View.OnClickListener() { // from class: l.cc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80195a.m115649R(view);
            }
        });
        xdl0.m208329E0(this.f90453m, new View.OnClickListener() { // from class: l.dc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85360a.m115650S(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m115648Q(DialogInterface dialogInterface) {
        i0e.m133796e(this.f90462v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m115649R(View view) {
        boolean z = NullChecker.m81303a(this.f90463w) && TEnum.equals(this.f90463w.partyType, "quickchat");
        dismiss();
        if (z) {
            zvf0.m220399u("e_quickchat_button", "p_quickchat_party_begin", j760.m140076a("remainingtimes", Integer.valueOf(C8609a.m50246b0())));
            Act act = this.f90461u;
            act.startActivity(DropDownAct.m54448b2(act, UnlockConversationType.quick_chat, "text_quickchat_party", Boolean.FALSE));
        } else {
            zvf0.m220399u("e_voicechat_button", "p_quickchat_party_begin", j760.m140076a("remainingtimes", Integer.valueOf(sqb0.m185513i0())));
            Act act2 = this.f90461u;
            act2.startActivity(DropDownAct.m54448b2(act2, "voice_quick_chat", "voice_quickchat_party", Boolean.FALSE));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m115650S(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: T */
    private void m115651T() {
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    }

    /* JADX INFO: renamed from: U */
    public static void m115652U(@NonNull Act act, @NonNull QuickChatPartyCampaignPage quickChatPartyCampaignPage) {
        new ec1(act, quickChatPartyCampaignPage).show();
    }

    /* JADX INFO: renamed from: H */
    public View m115653H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fc1.m120417b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: I */
    public final String m115654I() {
        return "活动火热进行中\n目前共有" + m115655J() + "人在线热聊";
    }

    /* JADX INFO: renamed from: J */
    public final int m115655J() {
        if (this.f90464x.size() <= 0) {
            this.f90464x.put(0, j760.m140076a(8762, 11014));
            this.f90464x.put(1, j760.m140076a(5528, 9765));
            this.f90464x.put(2, j760.m140076a(4669, 6161));
            this.f90464x.put(3, j760.m140076a(3211, 5203));
            this.f90464x.put(4, j760.m140076a(2881, 3578));
            this.f90464x.put(5, j760.m140076a(4249, 6004));
            this.f90464x.put(6, j760.m140076a(5388, 8066));
            this.f90464x.put(7, j760.m140076a(7238, 10093));
            this.f90464x.put(8, j760.m140076a(8347, 11238));
            this.f90464x.put(9, j760.m140076a(9294, 12185));
            this.f90464x.put(10, j760.m140076a(11164, Integer.valueOf(CommandMessage.COMMAND_STATISTIC)));
            this.f90464x.put(11, j760.m140076a(12261, 12837));
            this.f90464x.put(12, j760.m140076a(10707, 12454));
            this.f90464x.put(13, j760.m140076a(11410, 12639));
            this.f90464x.put(14, j760.m140076a(11444, 12759));
            this.f90464x.put(15, j760.m140076a(Integer.valueOf(TXILiveRoomDefine.TXILiveRoomErrorMusicNotSupportSampleRate), 12570));
            this.f90464x.put(16, j760.m140076a(11516, 12914));
            this.f90464x.put(17, j760.m140076a(10781, 12353));
            this.f90464x.put(18, j760.m140076a(11317, 13007));
            this.f90464x.put(19, j760.m140076a(11917, 14604));
            this.f90464x.put(20, j760.m140076a(13380, 15737));
            this.f90464x.put(21, j760.m140076a(14238, 15995));
            this.f90464x.put(22, j760.m140076a(13014, 13793));
            this.f90464x.put(23, j760.m140076a(11781, 12583));
        }
        j760<Integer, Integer> j760Var = this.f90464x.get(Integer.valueOf(Calendar.getInstance().get(11)));
        return (int) ((((double) (j760Var.f116565b.intValue() - j760Var.f116564a.intValue())) * Math.random()) + ((double) j760Var.f116564a.intValue()));
    }

    /* JADX INFO: renamed from: K */
    public final String m115656K() {
        StringBuilder sb = new StringBuilder();
        QuickChatPartyCampaignPage quickChatPartyCampaignPage = this.f90463w;
        if (quickChatPartyCampaignPage == null || !quickChatPartyCampaignPage.isValueAvailable()) {
            sb.append("每周");
            return sb.toString();
        }
        sb.append(m115643L(this.f90463w.weekDay));
        int i = this.f90463w.beginHour;
        if (i > 9) {
            sb.append(i);
        } else {
            sb.append(0);
            sb.append(this.f90463w.beginHour);
        }
        sb.append(":00至");
        int i2 = this.f90463w.endHour;
        if (i2 > 9) {
            sb.append(i2);
        } else {
            sb.append(0);
            sb.append(this.f90463w.endHour);
        }
        sb.append(":00，限时开启");
        return sb.toString();
    }

    @Override // p149l.szd, android.app.Dialog, android.content.DialogInterface, p149l.vzd.InterfaceC20772b
    public void dismiss() {
        super.dismiss();
    }

    @Override // p149l.szd, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewM115653H = m115653H(this.f90461u.getLayoutInflater(), null);
        this.f90460t = viewM115653H;
        setContentView(viewM115653H);
        m115651T();
        m115647P();
    }

    @Override // p149l.szd, android.app.Dialog
    public void show() {
        super.show();
        cwf0 cwf0VarM133794c = i0e.m133794c("p_quickchat_party_begin", getClass().getName());
        this.f90462v = cwf0VarM133794c;
        cwf0VarM133794c.m109039o(o6j0.m162858b(o6j0.C18854a.m162879i("is_voicechat", (NullChecker.m81303a(this.f90463w) && TEnum.equals(this.f90463w.partyType, "quickchat")) ? false : true)));
        i0e.m133797f(this.f90462v);
    }
}
