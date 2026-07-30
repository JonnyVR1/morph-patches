package p149l;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatHeat;
import com.p046p1.mobile.putong.core.data.ChatHeatActionData;
import com.p046p1.mobile.putong.core.data.SpecialNotifyFlag;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class su4 {

    /* JADX INFO: renamed from: a */
    public static long f166425a = 3000;

    /* JADX INFO: renamed from: b */
    public static long f166426b = 0;

    /* JADX INFO: renamed from: c */
    public static WeakReference<c4g0> f166427c = null;

    /* JADX INFO: renamed from: d */
    public static SoundPool f166428d = null;

    /* JADX INFO: renamed from: e */
    public static int f166429e = -1;

    /* JADX INFO: renamed from: f */
    public static int f166430f;

    /* JADX INFO: renamed from: l.su4$a */
    public class C20030a implements SoundPool.OnLoadCompleteListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f166431a;

        public C20030a(int i) {
            this.f166431a = i;
        }

        @Override // android.media.SoundPool.OnLoadCompleteListener
        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            if (i2 == 0) {
                soundPool.play(this.f166431a, 1.0f, 1.0f, 1, 0, 1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l.su4$b */
    public class C20031b implements SoundPool.OnLoadCompleteListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f166432a;

        public C20031b(int i) {
            this.f166432a = i;
        }

        @Override // android.media.SoundPool.OnLoadCompleteListener
        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            if (i2 == 0) {
                int i3 = this.f166432a;
                su4.f166429e = i3;
                su4.f166428d = soundPool;
                soundPool.play(i3, 1.0f, 1.0f, 1, 0, 1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m185991a(ChatHeat chatHeat) {
        if (NullChecker.m81303a(chatHeat) && chatHeat.specialRemind && mqi0.m155944o() - f166426b >= f166425a) {
            f166426b = mqi0.m155944o();
            m185997g();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m185992b(View view) {
    }

    /* JADX INFO: renamed from: c */
    public static void m185993c() {
        f166428d = null;
        f166429e = -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m185994d(MessagesAct messagesAct, ChatHeatActionData chatHeatActionData) {
        if (chatHeatActionData.isSuccess()) {
            if (chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.CHECK || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.ENTER_CHECK) {
                new p5f(messagesAct).m167481E(messagesAct, messagesAct.mo48974l().mo120828r3());
                return;
            } else {
                CoreModule.f17545c.f19642f0.m32650Fo();
                return;
            }
        }
        if (m185996f(chatHeatActionData.getThrowable())) {
            m185995e(messagesAct, chatHeatActionData.getThrowable(), chatHeatActionData.getType());
            return;
        }
        if ((chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.CHECK || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.ENTER_CHECK || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.INVITE || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.ACCEPT || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.SPECIAL_REMIND || chatHeatActionData.getType() == ChatHeatActionData.ExclusiveAction.CANCEL) && !m186000j(chatHeatActionData.getThrowable(), messagesAct)) {
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
                zvf0.m220402x(str2, OMSDialogPositon.p_chat_view);
            }
            CoreModule.m29935P().m94658i().mo158360d(chatHeatActionData.getThrowable());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m185995e(Act act, Throwable th, ChatHeatActionData.ExclusiveAction exclusiveAction) {
        try {
            JSONObject jSONObject = new JSONObject(((TantanException.Client.TantanForbidden) th).message);
            String strOptString = jSONObject.optString("otherUserId");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObject.optString("otherUserID");
            }
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            pu4.m171406j(act, strOptString, exclusiveAction);
        } catch (Exception e) {
            e.toString();
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m185996f(Throwable th) {
        return (th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40344;
    }

    /* JADX INFO: renamed from: g */
    public static void m185997g() {
        SoundPool.Builder builder = new SoundPool.Builder();
        builder.setMaxStreams(1);
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        builder2.setLegacyStreamType(3);
        builder.setAudioAttributes(builder2.build());
        SoundPool soundPoolBuild = builder.build();
        soundPoolBuild.setOnLoadCompleteListener(new C20030a(soundPoolBuild.load(App.f15369e, p7c0.f147491d, 1)));
    }

    /* JADX INFO: renamed from: h */
    public static void m185998h() {
        f166430f++;
        if (NullChecker.m81303a(f166428d)) {
            f166428d.play(f166429e, 1.0f, 1.0f, 1, 0, 1.0f);
            return;
        }
        SoundPool.Builder builder = new SoundPool.Builder();
        builder.setMaxStreams(10);
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        builder2.setLegacyStreamType(3);
        builder.setAudioAttributes(builder2.build());
        SoundPool soundPoolBuild = builder.build();
        soundPoolBuild.setOnLoadCompleteListener(new C20031b(soundPoolBuild.load(App.f15369e, p7c0.f147492e, 1)));
    }

    /* JADX INFO: renamed from: i */
    public static void m185999i(String str) {
        SpecialNotifyFlag specialNotifyFlagM215252v3;
        if (ura.m195053e().m195057d().mo33667Cn() && (specialNotifyFlagM215252v3 = CoreModule.f17545c.f19586M1.m215252v3(str)) != null && specialNotifyFlagM215252v3.checkAndPlayAudioOnce()) {
            if (NullChecker.m81303a(f166427c) && NullChecker.m81303a(f166427c.get())) {
                mkd0.m154992z(f166427c.get());
            }
            f166427c = new WeakReference<>(CoreModule.f17545c.f19586M1.m215249s3(str).first().subscribe(mkd0.m154955G(new e30() { // from class: l.ru4
                @Override // p149l.e30
                public final void call(Object obj) {
                    su4.m185991a((ChatHeat) obj);
                }
            })));
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m186000j(Throwable th, Act act) {
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
            xh0.C21150a c21150a = new xh0.C21150a(act);
            if (!TextUtils.isEmpty(strOptString)) {
                c21150a.m208740s(strOptString);
            }
            c21150a.m208731j(strOptString2);
            c21150a.m208739r("知道了").m208736o(new View.OnClickListener() { // from class: l.qu4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    su4.m185992b(view);
                }
            });
            c21150a.m208722a().m208721g();
            return true;
        } catch (Exception e) {
            e.toString();
            return false;
        }
    }
}
