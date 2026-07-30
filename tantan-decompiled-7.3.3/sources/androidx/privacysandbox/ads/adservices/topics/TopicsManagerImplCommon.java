package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.C0255a;
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
import kotlinx.coroutines.C15514c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.b7j0;
import p153l.c7j0;
import p153l.pox;
import p153l.qdj0;
import p153l.rdj0;
import p153l.uyp;
import p153l.vmj;
import p153l.wmj;
import p153l.wtq0;
import p153l.xmj;
import p153l.ymj;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH\u0083@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m88121d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "Ll/qdj0;", "Ll/rdj0;", "mTopicsManager", "<init>", "(Ll/rdj0;)V", "Ll/wmj;", SocialConstants.TYPE_REQUEST, "Ll/xmj;", "a", "(Ll/wmj;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/vmj;", "c", "(Ll/wmj;)Ll/vmj;", "Ll/ymj;", "response", Constants.INAPP_DATA_TAG, "(Ll/ymj;)Ll/xmj;", "getTopicsRequest", "f", "(Ll/vmj;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/rdj0;", "ads-adservices_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SuppressLint({"NewApi"})
@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 4)
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension
public class TopicsManagerImplCommon extends qdj0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final rdj0 mTopicsManager;

    public TopicsManagerImplCommon(@NotNull rdj0 rdj0Var) {
        rdj0Var.getClass();
        this.mTopicsManager = rdj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @DoNotInline
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m3217e(TopicsManagerImplCommon topicsManagerImplCommon, wmj wmjVar, Continuation<? super xmj> continuation) throws Throwable {
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
        Object objM3221f = topicsManagerImplCommon$getTopics$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = topicsManagerImplCommon$getTopics$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(objM3221f);
            topicsManagerImplCommon.mo3219c(wmjVar);
            topicsManagerImplCommon$getTopics$1.L$0 = topicsManagerImplCommon;
            topicsManagerImplCommon$getTopics$1.label = 1;
            objM3221f = topicsManagerImplCommon.m3221f(null, topicsManagerImplCommon$getTopics$1);
            if (objM3221f == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            topicsManagerImplCommon = (TopicsManagerImplCommon) topicsManagerImplCommon$getTopics$1.L$0;
            ResultKt.m88128b(objM3221f);
        }
        return topicsManagerImplCommon.m3220d((ymj) objM3221f);
    }

    @Override // p153l.qdj0
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @DoNotInline
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo3218a(@NotNull wmj wmjVar, @NotNull Continuation<? super xmj> continuation) {
        return m3217e(this, wmjVar, continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public vmj mo3219c(@NotNull wmj request) {
        request.getClass();
        new vmj.C20856a().m201745b(request.getAdsSdkName()).m201744a();
        throw null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final xmj m3220d(@NotNull ymj response) {
        response.getClass();
        ArrayList arrayList = new ArrayList();
        for (c7j0 c7j0Var : response.m216696a()) {
            arrayList.add(new b7j0(c7j0Var.m108306b(), c7j0Var.m108305a(), c7j0Var.m108307c()));
        }
        return new xmj(arrayList);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    /* JADX INFO: renamed from: f */
    public final Object m3221f(vmj vmjVar, Continuation<? super ymj> continuation) {
        C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
        c15514c.m94637G();
        this.mTopicsManager.m180858a(vmjVar, new pox(), C0255a.m1328a(c15514c));
        Object objM94670v = c15514c.m94670v();
        if (objM94670v == uyp.m198688e()) {
            DebugProbesKt.m88272c(continuation);
        }
        return objM94670v;
    }
}
