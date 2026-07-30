package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.C0254a;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.PlaybackException;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15407c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.fkj;
import p149l.gkj;
import p149l.hkj;
import p149l.ikj;
import p149l.m4j0;
import p149l.n4j0;
import p149l.qkq0;
import p149l.rfx;
import p149l.uwp;
import p149l.xxi0;
import p149l.yxi0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH\u0083@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m87232d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "Ll/m4j0;", "Ll/n4j0;", "mTopicsManager", "<init>", "(Ll/n4j0;)V", "Ll/gkj;", SocialConstants.TYPE_REQUEST, "Ll/hkj;", "a", "(Ll/gkj;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/fkj;", "c", "(Ll/gkj;)Ll/fkj;", "Ll/ikj;", "response", Constants.INAPP_DATA_TAG, "(Ll/ikj;)Ll/hkj;", "getTopicsRequest", "f", "(Ll/fkj;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/n4j0;", "ads-adservices_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SuppressLint({"NewApi"})
@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 4)
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension
public class TopicsManagerImplCommon extends m4j0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final n4j0 mTopicsManager;

    public TopicsManagerImplCommon(@NotNull n4j0 n4j0Var) {
        n4j0Var.getClass();
        this.mTopicsManager = n4j0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @DoNotInline
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m3216e(TopicsManagerImplCommon topicsManagerImplCommon, gkj gkjVar, Continuation<? super hkj> continuation) throws Throwable {
        TopicsManagerImplCommon$getTopics$1 topicsManagerImplCommon$getTopics$1;
        if (continuation instanceof TopicsManagerImplCommon$getTopics$1) {
            topicsManagerImplCommon$getTopics$1 = (TopicsManagerImplCommon$getTopics$1) continuation;
            int i = topicsManagerImplCommon$getTopics$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                topicsManagerImplCommon$getTopics$1.label = i - Integer.MIN_VALUE;
            } else {
                topicsManagerImplCommon$getTopics$1 = new TopicsManagerImplCommon$getTopics$1(topicsManagerImplCommon, continuation);
            }
        } else {
            topicsManagerImplCommon$getTopics$1 = new TopicsManagerImplCommon$getTopics$1(topicsManagerImplCommon, continuation);
        }
        Object objM3220f = topicsManagerImplCommon$getTopics$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = topicsManagerImplCommon$getTopics$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(objM3220f);
            topicsManagerImplCommon.mo3218c(gkjVar);
            topicsManagerImplCommon$getTopics$1.L$0 = topicsManagerImplCommon;
            topicsManagerImplCommon$getTopics$1.label = 1;
            objM3220f = topicsManagerImplCommon.m3220f(null, topicsManagerImplCommon$getTopics$1);
            if (objM3220f == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            topicsManagerImplCommon = (TopicsManagerImplCommon) topicsManagerImplCommon$getTopics$1.L$0;
            ResultKt.m87239b(objM3220f);
        }
        return topicsManagerImplCommon.m3219d((ikj) objM3220f);
    }

    @Override // p149l.m4j0
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @DoNotInline
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo3217a(@NotNull gkj gkjVar, @NotNull Continuation<? super hkj> continuation) {
        return m3216e(this, gkjVar, continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public fkj mo3218c(@NotNull gkj request) {
        request.getClass();
        new fkj.C16868a().m121873b(request.getAdsSdkName()).m121872a();
        throw null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final hkj m3219d(@NotNull ikj response) {
        response.getClass();
        ArrayList arrayList = new ArrayList();
        for (yxi0 yxi0Var : response.m136801a()) {
            arrayList.add(new xxi0(yxi0Var.m216460b(), yxi0Var.m216459a(), yxi0Var.m216461c()));
        }
        return new hkj(arrayList);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    /* JADX INFO: renamed from: f */
    public final Object m3220f(fkj fkjVar, Continuation<? super ikj> continuation) {
        C15407c c15407c = new C15407c(IntrinsicsKt__IntrinsicsJvmKt.m87368c(continuation), 1);
        c15407c.m93745G();
        this.mTopicsManager.m157873a(fkjVar, new rfx(), C0254a.m1327a(c15407c));
        Object objM93778v = c15407c.m93778v();
        if (objM93778v == uwp.m196133e()) {
            DebugProbesKt.m87383c(continuation);
        }
        return objM93778v;
    }
}
