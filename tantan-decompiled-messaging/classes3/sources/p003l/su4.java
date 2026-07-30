package p003l;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatHeat;
import com.p1.mobile.putong.core.data.ChatHeatActionData;
import com.p1.mobile.putong.core.data.SpecialNotifyFlag;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import l.mkd0;
import l.mqi0;
import l.p7c0;
import l.ura;
import l.xh0;
import l.zvf0;
import org.json.JSONObject;
import org.spongycastle.i18n.MessageBundle;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class su4 {

    /* JADX INFO: renamed from: a */
    public static long f7306a = 3000;

    /* JADX INFO: renamed from: b */
    public static long f7307b = 0;

    /* JADX INFO: renamed from: c */
    public static WeakReference<c4g0> f7308c = null;

    /* JADX INFO: renamed from: d */
    public static SoundPool f7309d = null;

    /* JADX INFO: renamed from: e */
    public static int f7310e = -1;

    /* JADX INFO: renamed from: f */
    public static int f7311f;

    /* JADX INFO: renamed from: l.su4$a */
    public class C0534a implements SoundPool.OnLoadCompleteListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f7312a;

        public C0534a(int i) {
            this.f7312a = i;
        }

        @Override // android.media.SoundPool.OnLoadCompleteListener
        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            if (i2 == 0) {
                soundPool.play(this.f7312a, 1.0f, 1.0f, 1, 0, 1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.su4$b */
    public class C0535b implements SoundPool.OnLoadCompleteListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f7313a;

        public C0535b(int i) {
            this.f7313a = i;
        }

        @Override // android.media.SoundPool.OnLoadCompleteListener
        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            if (i2 == 0) {
                int i3 = this.f7313a;
                su4.f7310e = i3;
                su4.f7309d = soundPool;
                soundPool.play(i3, 1.0f, 1.0f, 1, 0, 1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7632a(ChatHeat chatHeat) {
        if (NullChecker.a(chatHeat) && chatHeat.specialRemind && mqi0.o() - f7307b >= f7306a) {
            f7307b = mqi0.o();
            m7638g();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m7633b(View view) {
    }

    /* JADX INFO: renamed from: c */
    public static void m7634c() {
        f7309d = null;
        f7310e = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static void m7635d(MessagesAct messagesAct, ChatHeatActionData chatHeatActionData) {
        if (chatHeatActionData.isSuccess()) {
            if (chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.CHECK || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.ENTER_CHECK) {
                new p5f(messagesAct).m6799E(messagesAct, messagesAct.mo2066l().m4295r3());
                return;
            } else {
                CoreModule.c.f0.Fo();
                return;
            }
        }
        if (m7637f(chatHeatActionData.getThrowable())) {
            m7636e(messagesAct, chatHeatActionData.getThrowable(), chatHeatActionData.getType());
            return;
        }
        if ((chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.CHECK || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.ENTER_CHECK || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.INVITE || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.ACCEPT || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.SPECIAL_REMIND || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.CANCEL) && !m7641j(chatHeatActionData.getThrowable(), messagesAct)) {
            if ((chatHeatActionData.getThrowable() instanceof TantanException.Client.TantanForbidden) && chatHeatActionData.getThrowable().code == 40339) {
                String str = chatHeatActionData.getThrowable().message;
                String str2 = "e_private_chat_error_invited";
                if (TextUtils.isEmpty(str) || !str.contains("对方已向你发起专属聊天")) {
                    if (!TextUtils.isEmpty(str) && str.contains("不支持此功能")) {
                        str2 = "e_private_chat_error_no_function";
                    } else if (!TextUtils.isEmpty(str) && str.contains("版本过低")) {
                        str2 = "e_private_chat_error_low_version";
                    }
                }
                zvf0.x(str2, "p_chat_view");
            }
            CoreModule.P().i().d(chatHeatActionData.getThrowable());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m7636e(Act act, Throwable th, ChatHeatActionData.ExclusiveAction exclusiveAction) {
        try {
            JSONObject jSONObject = new JSONObject(((TantanException.Client.TantanForbidden) th).message);
            String strOptString = jSONObject.optString("otherUserId");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObject.optString("otherUserID");
            }
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            pu4.m6921j(act, strOptString, exclusiveAction);
        } catch (Exception e) {
            e.toString();
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m7637f(Throwable th) {
        return (th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40344;
    }

    /* JADX INFO: renamed from: g */
    public static void m7638g() {
        SoundPool.Builder builder = new SoundPool.Builder();
        builder.setMaxStreams(1);
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        builder2.setLegacyStreamType(3);
        builder.setAudioAttributes(builder2.build());
        SoundPool soundPoolBuild = builder.build();
        soundPoolBuild.setOnLoadCompleteListener(new C0534a(soundPoolBuild.load(App.e, p7c0.d, 1)));
    }

    /* JADX INFO: renamed from: h */
    public static void m7639h() {
        f7311f++;
        if (NullChecker.a(f7309d)) {
            f7309d.play(f7310e, 1.0f, 1.0f, 1, 0, 1.0f);
            return;
        }
        SoundPool.Builder builder = new SoundPool.Builder();
        builder.setMaxStreams(10);
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        builder2.setLegacyStreamType(3);
        builder.setAudioAttributes(builder2.build());
        SoundPool soundPoolBuild = builder.build();
        soundPoolBuild.setOnLoadCompleteListener(new C0535b(soundPoolBuild.load(App.e, p7c0.e, 1)));
    }

    /* JADX INFO: renamed from: i */
    public static void m7640i(String str) {
        SpecialNotifyFlag specialNotifyFlagV3;
        if (ura.e().d().Cn() && (specialNotifyFlagV3 = CoreModule.c.M1.v3(str)) != null && specialNotifyFlagV3.checkAndPlayAudioOnce()) {
            if (NullChecker.a(f7308c) && NullChecker.a(f7308c.get())) {
                mkd0.z(f7308c.get());
            }
            f7308c = new WeakReference<>(CoreModule.c.M1.s3(str).first().subscribe((m250) mkd0.G(new e30() { // from class: l.ru4
                @Override // p003l.e30
                public final void call(Object obj) {
                    su4.m7632a((ChatHeat) obj);
                }
            })));
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m7641j(Throwable th, Act act) {
        if (!(th instanceof TantanException.Client.TantanForbidden)) {
            return false;
        }
        TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
        if (tantanForbidden.code != 40343) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(tantanForbidden.message);
            String strOptString = jSONObject.optString(MessageBundle.TITLE_ENTRY);
            String strOptString2 = jSONObject.optString("subTitle");
            if (TextUtils.isEmpty(strOptString2)) {
                return true;
            }
            xh0.a aVar = new xh0.a(act);
            if (!TextUtils.isEmpty(strOptString)) {
                aVar.s(strOptString);
            }
            aVar.j(strOptString2);
            aVar.r("知道了").o(new View.OnClickListener() { // from class: l.qu4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    su4.m7633b(view);
                }
            });
            aVar.a().g();
            return true;
        } catch (Exception e) {
            e.toString();
            return false;
        }
    }
}
