package p153l;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatHeat;
import com.p051p1.mobile.putong.core.data.ChatHeatActionData;
import com.p051p1.mobile.putong.core.data.SpecialNotifyFlag;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class rv4 {

    /* JADX INFO: renamed from: a */
    public static long f164968a = 3000;

    /* JADX INFO: renamed from: b */
    public static long f164969b = 0;

    /* JADX INFO: renamed from: c */
    public static WeakReference<kcg0> f164970c = null;

    /* JADX INFO: renamed from: d */
    public static SoundPool f164971d = null;

    /* JADX INFO: renamed from: e */
    public static int f164972e = -1;

    /* JADX INFO: renamed from: f */
    public static int f164973f;

    /* JADX INFO: renamed from: l.rv4$a */
    public class C19917a implements SoundPool.OnLoadCompleteListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f164974a;

        public C19917a(int i) {
            this.f164974a = i;
        }

        @Override // android.media.SoundPool.OnLoadCompleteListener
        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            if (i2 == 0) {
                soundPool.play(this.f164974a, 1.0f, 1.0f, 1, 0, 1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.rv4$b */
    public class C19918b implements SoundPool.OnLoadCompleteListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f164975a;

        public C19918b(int i) {
            this.f164975a = i;
        }

        @Override // android.media.SoundPool.OnLoadCompleteListener
        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            if (i2 == 0) {
                int i3 = this.f164975a;
                rv4.f164972e = i3;
                rv4.f164971d = soundPool;
                soundPool.play(i3, 1.0f, 1.0f, 1, 0, 1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m183251a(ChatHeat chatHeat) {
        if (NullChecker.m82486a(chatHeat) && chatHeat.specialRemind && pzi0.m174454o() - f164969b >= f164968a) {
            f164969b = pzi0.m174454o();
            m183257g();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m183252b(View view) {
    }

    /* JADX INFO: renamed from: c */
    public static void m183253c() {
        f164971d = null;
        f164972e = -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m183254d(MessagesAct messagesAct, ChatHeatActionData chatHeatActionData) {
        if (chatHeatActionData.isSuccess()) {
            if (chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.CHECK || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.ENTER_CHECK) {
                new t6f(messagesAct).m189525E(messagesAct, messagesAct.mo50158l().mo111034r3());
                return;
            } else {
                CoreModule.f18264c.f20384f0.m33653Fo();
                return;
            }
        }
        if (m183256f(chatHeatActionData.getThrowable())) {
            m183255e(messagesAct, chatHeatActionData.getThrowable(), chatHeatActionData.getType());
            return;
        }
        if ((chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.CHECK || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.ENTER_CHECK || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.INVITE || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.ACCEPT || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.SPECIAL_REMIND || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.CANCEL) && !m183260j(chatHeatActionData.getThrowable(), messagesAct)) {
            if ((chatHeatActionData.getThrowable() instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) chatHeatActionData.getThrowable()).code == 40339) {
                String str = ((TantanException.Client.TantanForbidden) chatHeatActionData.getThrowable()).message;
                String str2 = "e_private_chat_error_invited";
                if (TextUtils.isEmpty(str) || !str.contains("对方已向你发起专属聊天")) {
                    if (!TextUtils.isEmpty(str) && str.contains("不支持此功能")) {
                        str2 = "e_private_chat_error_no_function";
                    } else if (!TextUtils.isEmpty(str) && str.contains("版本过低")) {
                        str2 = "e_private_chat_error_low_version";
                    }
                }
                i4g0.m138526x(str2, OMSDialogPositon.p_chat_view);
            }
            CoreModule.m30933P().m143412i().mo180452d(chatHeatActionData.getThrowable());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m183255e(Act act, Throwable th, ChatHeatActionData.ExclusiveAction exclusiveAction) {
        try {
            JSONObject jSONObject = new JSONObject(((TantanException.Client.TantanForbidden) th).message);
            String strOptString = jSONObject.optString("otherUserId");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObject.optString("otherUserID");
            }
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            ov4.m169421j(act, strOptString, exclusiveAction);
        } catch (Exception e) {
            e.toString();
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m183256f(Throwable th) {
        return (th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40344;
    }

    /* JADX INFO: renamed from: g */
    public static void m183257g() {
        SoundPool.Builder builder = new SoundPool.Builder();
        builder.setMaxStreams(1);
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        builder2.setLegacyStreamType(3);
        builder.setAudioAttributes(builder2.build());
        SoundPool soundPoolBuild = builder.build();
        soundPoolBuild.setOnLoadCompleteListener(new C19917a(soundPoolBuild.load(App.f16088e, tfc0.f173945d, 1)));
    }

    /* JADX INFO: renamed from: h */
    public static void m183258h() {
        f164973f++;
        if (NullChecker.m82486a(f164971d)) {
            f164971d.play(f164972e, 1.0f, 1.0f, 1, 0, 1.0f);
            return;
        }
        SoundPool.Builder builder = new SoundPool.Builder();
        builder.setMaxStreams(10);
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        builder2.setLegacyStreamType(3);
        builder.setAudioAttributes(builder2.build());
        SoundPool soundPoolBuild = builder.build();
        soundPoolBuild.setOnLoadCompleteListener(new C19918b(soundPoolBuild.load(App.f16088e, tfc0.f173946e, 1)));
    }

    /* JADX INFO: renamed from: i */
    public static void m183259i(String str) {
        SpecialNotifyFlag specialNotifyFlagM111477v3;
        if (gta.m132210e().m132214d().mo34670Cn() && (specialNotifyFlagM111477v3 = CoreModule.f18264c.f20328M1.m111477v3(str)) != null && specialNotifyFlagM111477v3.checkAndPlayAudioOnce()) {
            if (NullChecker.m82486a(f164970c) && NullChecker.m82486a(f164970c.get())) {
                psd0.m173633z(f164970c.get());
            }
            f164970c = new WeakReference<>(CoreModule.f18264c.f20328M1.m111474s3(str).first().subscribe(psd0.m173596G(new y20() { // from class: l.qv4
                @Override // p153l.y20
                public final void call(Object obj) {
                    rv4.m183251a((ChatHeat) obj);
                }
            })));
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m183260j(Throwable th, Act act) {
        if (!(th instanceof TantanException.Client.TantanForbidden)) {
            return false;
        }
        TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
        if (tantanForbidden.code != 40343) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(tantanForbidden.message);
            String strOptString = jSONObject.optString("title");
            String strOptString2 = jSONObject.optString("subTitle");
            if (TextUtils.isEmpty(strOptString2)) {
                return true;
            }
            th0.C20312a c20312a = new th0.C20312a(act);
            if (!TextUtils.isEmpty(strOptString)) {
                c20312a.m191160s(strOptString);
            }
            c20312a.m191151j(strOptString2);
            c20312a.m191159r("知道了").m191156o(new View.OnClickListener() { // from class: l.pv4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    rv4.m183252b(view);
                }
            });
            c20312a.m191142a().m191141g();
            return true;
        } catch (Exception e) {
            e.toString();
            return false;
        }
    }
}
