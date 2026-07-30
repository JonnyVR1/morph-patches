package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.TarotData;
import com.p051p1.mobile.putong.core.data.TarotDataEnvelope;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VRadioButton;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010?\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\"\u0010B\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u00107\u001a\u0004\b@\u00109\"\u0004\bA\u0010;R\"\u0010E\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u001b\u001a\u0004\bC\u0010\u001d\"\u0004\bD\u0010\u001fR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010F¨\u0006G"}, m88121d2 = {"Ll/mli0;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "g", "(Landroid/view/View;)V", "Ll/pej0;", OMSTemplateType.dialog, "n", "(Ll/pej0;)V", "h", "()V", "rootView", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/pej0;", "o", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VButton;", "b", "Lv/VButton;", "k", "()Lv/VButton;", "set_close", "(Lv/VButton;)V", "_close", "Lv/VText;", "c", "Lv/VText;", "m", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", Constants.INAPP_DATA_TAG, "get_content", "set_content", "_content", "Landroid/widget/RadioGroup;", "e", "Landroid/widget/RadioGroup;", BLiveStormDanmakuGiftResourceType.f45292l, "()Landroid/widget/RadioGroup;", "set_radio_group", "(Landroid/widget/RadioGroup;)V", "_radio_group", "Lv/VRadioButton;", "f", "Lv/VRadioButton;", "get_radio_group_radio_left", "()Lv/VRadioButton;", "set_radio_group_radio_left", "(Lv/VRadioButton;)V", "_radio_group_radio_left", "get_radio_group_radio_center", "set_radio_group_radio_center", "_radio_group_radio_center", "get_radio_group_radio_right", "set_radio_group_radio_right", "_radio_group_radio_right", "j", "set_bottom_button", "_bottom_button", "Ll/pej0;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class mli0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VButton _close;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _content;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public RadioGroup _radio_group;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VRadioButton _radio_group_radio_left;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VRadioButton _radio_group_radio_center;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VRadioButton _radio_group_radio_right;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VButton _bottom_button;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public pej0 dialog;

    public mli0(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m158880a(Throwable th) {
        o1j0.m165634h(R$string.f18312Aq);
    }

    /* JADX INFO: renamed from: b */
    public static void m158881b(pej0 pej0Var, View view) {
        pej0Var.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m158882c(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m158883d(mli0 mli0Var, View view) {
        if (mli0Var.m158891l().getCheckedRadioButtonId() != -1) {
            i4g0.m138520r("e_tarot_choose_popup_confirm", "p_tarot_choose_popup");
            mli0Var.m158887h();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m158884e(mli0 mli0Var, RadioGroup radioGroup, int i) {
        radioGroup.getClass();
        mli0Var.m158889j().setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: f */
    public static Unit m158885f(mli0 mli0Var, TarotDataEnvelope tarotDataEnvelope) {
        int i = tarotDataEnvelope.data.cardType;
        if (1 > i || i >= 45) {
            o1j0.m165634h(R$string.f18312Aq);
        } else {
            CoreModule.f18264c.f20436w1.m102955r3(tarotDataEnvelope);
            CoreModule.f18264c.f20436w1.m102954q3(tarotDataEnvelope.data.cardType);
            oli0.Companion companion = oli0.INSTANCE;
            Act act = mli0Var.act;
            TarotData tarotData = tarotDataEnvelope.data;
            tarotData.getClass();
            companion.m168124b(act, tarotData);
            pej0 pej0Var = mli0Var.dialog;
            if (pej0Var == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
                pej0Var = null;
            }
            pej0Var.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final void m158886g(View view) {
        nli0.m163687a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m158887h() {
        pej0 pej0Var = this.dialog;
        if (pej0Var == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var = null;
        }
        C22421c c22421cObserveOn = pej0Var.duringCreated(CoreModule.f18264c.f20436w1.m102947g3()).observeOn(fo0.m126432a());
        final Function1 function1 = new Function1() { // from class: l.jli0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mli0.m158885f(this.f121557a, (TarotDataEnvelope) obj);
            }
        };
        c22421cObserveOn.subscribe(new y20() { // from class: l.kli0
            @Override // p153l.y20
            public final void call(Object obj) {
                mli0.m158882c(function1, obj);
            }
        }, new y20() { // from class: l.lli0
            @Override // p153l.y20
            public final void call(Object obj) {
                mli0.m158880a((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final pej0 m158888i(Act act, View rootView) {
        pej0 pej0Var = new pej0(act, agc0.f71118d);
        pej0Var.setContentView(rootView);
        pej0Var.setCancelable(true);
        return pej0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VButton m158889j() {
        VButton vButton = this._bottom_button;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_bottom_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VButton m158890k() {
        VButton vButton = this._close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final RadioGroup m158891l() {
        RadioGroup radioGroup = this._radio_group;
        if (radioGroup != null) {
            return radioGroup;
        }
        Intrinsics.m88391r("_radio_group");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VText m158892m() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m158893n(final pej0 dialog) {
        m158892m().setTypeface(ami0.m98827i(this.act));
        m158891l().setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.gli0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                mli0.m158884e(this.f104853a, radioGroup, i);
            }
        });
        bnl0.m105509E0(m158890k(), new View.OnClickListener() { // from class: l.hli0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mli0.m158881b(dialog, view);
            }
        });
        bnl0.m105509E0(m158889j(), new View.OnClickListener() { // from class: l.ili0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mli0.m158883d(this.f115578a, view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m158894o() {
        pej0 pej0Var = null;
        View viewInflate = p9r.m171370a(this.act).inflate(kec0.f125566P5, (ViewGroup) null);
        viewInflate.getClass();
        m158886g(viewInflate);
        uqb0.f180374G.m127098D(viewInflate, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlVMVUdYV0JMUUFKRk5HVFVYSkFZSkI3WVhRRlZWNDE0IiwidyI6MTEyNSwiaCI6MTIzOSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE0NzU3MTcwNDA4ODI2Mzc0MTY5fQ.webp");
        pej0 pej0VarM158888i = m158888i(this.act, viewInflate);
        this.dialog = pej0VarM158888i;
        if (pej0VarM158888i == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0VarM158888i = null;
        }
        m158893n(pej0VarM158888i);
        pej0 pej0Var2 = this.dialog;
        if (pej0Var2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            pej0Var = pej0Var2;
        }
        pej0Var.show();
    }
}
