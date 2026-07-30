package p153l;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.core.data.Permissions;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\u0018\u0000 I2\u00020\u0001:\u0001<B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00172\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u00020\u00172\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010 J-\u0010\"\u001a\u00020\u00172\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010#J%\u0010$\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b$\u0010%J/\u0010(\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b*\u0010\u0015J1\u00100\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\n2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u00172\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J9\u00103\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\n2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u00172\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u00102\u001a\u00020\u0017¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b5\u00106J\u0015\u00109\u001a\u00020\u000e2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u0002070;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR&\u0010F\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, m88121d2 = {"Ll/bm3;", "", "Ll/hul;", "webView", "<init>", "(Ll/hul;)V", "Landroid/app/Activity;", "j", "()Landroid/app/Activity;", "", "", Permissions.TYPE, "", "requestCode", "", ResourceDirection.f39656v, "([Ljava/lang/String;I)V", "activity", "p", "(Landroid/app/Activity;)V", "n", "(I)V", "m", "", "g", "()Z", "permission", "h", "(Ljava/lang/String;)Z", RXScreenCaptureService.KEY_INDEX, "([Ljava/lang/String;)Z", "q", "([Ljava/lang/String;I)Z", "shieldDialog", "r", "([Ljava/lang/String;IZ)Z", BLiveStormDanmakuGiftResourceType.f45292l, "([Ljava/lang/String;I)Ljava/lang/String;", "", "grantResults", "o", "(I[Ljava/lang/String;[I)V", BLiveStormDanmakuGiftResourceType.f45294s, "title", "message", "needFinish", "Landroid/content/DialogInterface$OnDismissListener;", "dismissListener", Constants.KEY_T, "(Ljava/lang/String;Ljava/lang/String;ZLandroid/content/DialogInterface$OnDismissListener;)V", "forceShow", "u", "(Ljava/lang/String;Ljava/lang/String;ZLandroid/content/DialogInterface$OnDismissListener;Z)V", "k", "(I)Ljava/lang/String;", "Ll/xr60;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "f", "(Ll/xr60;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "a", "Ljava/util/concurrent/CopyOnWriteArrayList;", "permissionListeners", "Landroid/app/AlertDialog;", "b", "Landroid/app/AlertDialog;", "guideDialog", "", "c", "Ljava/util/Map;", "requestCodeToPermissions", Constants.INAPP_DATA_TAG, "Ll/hul;", "Companion", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class bm3 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private AlertDialog guideDialog;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final hul webView;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CopyOnWriteArrayList<xr60> permissionListeners = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<Integer, String[]> requestCodeToPermissions = new LinkedHashMap();

    /* JADX INFO: renamed from: l.bm3$b */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m88121d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class DialogInterfaceOnClickListenerC16034b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Activity f77241b;

        public DialogInterfaceOnClickListenerC16034b(Activity activity) {
            this.f77241b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            bm3.this.guideDialog = null;
            bm3.this.m104972p(this.f77241b);
        }
    }

    /* JADX INFO: renamed from: l.bm3$c */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m88121d2 = {"<anonymous>", "", OMSTemplateType.dialog, "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class DialogInterfaceOnClickListenerC16035c implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC16035c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            bm3.this.guideDialog = null;
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: l.bm3$d */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m88121d2 = {"<anonymous>", "", OMSTemplateType.dialog, "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class DialogInterfaceOnDismissListenerC16036d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f77244b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Activity f77245c;

        public DialogInterfaceOnDismissListenerC16036d(boolean z, Activity activity) {
            this.f77244b = z;
            this.f77245c = activity;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            if (this.f77244b && bm3.this.m104968g()) {
                this.f77245c.finish();
            }
            bm3.this.guideDialog = null;
        }
    }

    /* JADX INFO: renamed from: l.bm3$e */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m88121d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class DialogInterfaceOnClickListenerC16037e implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Activity f77247b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String[] f77248c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f77249d;

        public DialogInterfaceOnClickListenerC16037e(Activity activity, String[] strArr, int i) {
            this.f77247b = activity;
            this.f77248c = strArr;
            this.f77249d = i;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            bm3.this.guideDialog = null;
            v40.m199644u(this.f77247b, this.f77248c, this.f77249d);
        }
    }

    /* JADX INFO: renamed from: l.bm3$f */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m88121d2 = {"<anonymous>", "", OMSTemplateType.dialog, "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class DialogInterfaceOnClickListenerC16038f implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f77251b;

        public DialogInterfaceOnClickListenerC16038f(int i) {
            this.f77251b = i;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            bm3.this.guideDialog = null;
            dialogInterface.dismiss();
            bm3.this.requestCodeToPermissions.remove(Integer.valueOf(this.f77251b));
            bm3.this.m104970m(this.f77251b);
        }
    }

    /* JADX INFO: renamed from: l.bm3$g */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m88121d2 = {"<anonymous>", "", Careers.f39580it, "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class DialogInterfaceOnCancelListenerC16039g implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f77253b;

        public DialogInterfaceOnCancelListenerC16039g(int i) {
            this.f77253b = i;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            bm3.this.guideDialog = null;
            bm3.this.requestCodeToPermissions.remove(Integer.valueOf(this.f77253b));
            bm3.this.m104970m(this.f77253b);
        }
    }

    public bm3(@Nullable hul hulVar) {
        this.webView = hulVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final boolean m104968g() {
        Activity activityM104969j = m104969j();
        return (activityM104969j == null || activityM104969j.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    private final Activity m104969j() {
        Context webContext;
        hul hulVar = this.webView;
        if (hulVar != null && (webContext = hulVar.getWebContext()) != null) {
            if (webContext instanceof Activity) {
                return (Activity) webContext;
            }
            if (webContext instanceof ContextThemeWrapper) {
                Context baseContext = ((ContextThemeWrapper) webContext).getBaseContext();
                if (baseContext instanceof Activity) {
                    return (Activity) baseContext;
                }
                return null;
            }
            if (webContext instanceof r26) {
                Context baseContext2 = ((r26) webContext).getBaseContext();
                if (baseContext2 instanceof Activity) {
                    return (Activity) baseContext2;
                }
                return null;
            }
            if (webContext instanceof MutableContextWrapper) {
                Context baseContext3 = ((MutableContextWrapper) webContext).getBaseContext();
                if (baseContext3 instanceof Activity) {
                    return (Activity) baseContext3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final void m104970m(int requestCode) {
        Iterator<T> it = this.permissionListeners.iterator();
        while (it.hasNext()) {
            try {
                ((xr60) it.next()).mo98813a(requestCode);
            } catch (Exception e) {
                jzv.m147729b("BusinessPermissionChecker", "Error in permission listener, requestCode: " + requestCode + ", exception: " + e);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m104971n(int requestCode) {
        Iterator<T> it = this.permissionListeners.iterator();
        while (it.hasNext()) {
            try {
                ((xr60) it.next()).mo98814b(requestCode);
            } catch (Exception e) {
                jzv.m147729b("BusinessPermissionChecker", "Error in permission listener, requestCode: " + requestCode + ", exception: " + e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final void m104972p(Activity activity) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
            activity.startActivity(intent);
        } catch (Exception e) {
            jzv.m147729b("BusinessPermissionChecker", "Failed to open app settings, exception: " + e);
        }
    }

    /* JADX INFO: renamed from: v */
    private final void m104973v(String[] permissions, int requestCode) {
        AlertDialog alertDialog;
        Activity activityM104969j = m104969j();
        if (activityM104969j != null) {
            String strM104978l = m104978l(permissions, requestCode);
            if (StringsKt.m94329e0(strM104978l)) {
                v40.m199644u(activityM104969j, permissions, requestCode);
                return;
            }
            this.guideDialog = new AlertDialog.Builder(activityM104969j).setTitle("权限使用说明").setMessage(strM104978l).setPositiveButton("去设置", new DialogInterfaceOnClickListenerC16037e(activityM104969j, permissions, requestCode)).setNegativeButton("取消", new DialogInterfaceOnClickListenerC16038f(requestCode)).setOnCancelListener(new DialogInterfaceOnCancelListenerC16039g(requestCode)).create();
            if (activityM104969j.isFinishing() || (alertDialog = this.guideDialog) == null) {
                return;
            }
            alertDialog.show();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m104974f(@NotNull xr60 listener) {
        listener.getClass();
        if (this.permissionListeners.contains(listener)) {
            return;
        }
        this.permissionListeners.add(listener);
    }

    /* JADX INFO: renamed from: h */
    public boolean m104975h(@NotNull String permission) {
        Context webContext;
        permission.getClass();
        hul hulVar = this.webView;
        return (hulVar == null || (webContext = hulVar.getWebContext()) == null || j26.m143188a(webContext, permission) != 0) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m104976i(@NotNull String[] permissions) {
        Context webContext;
        permissions.getClass();
        hul hulVar = this.webView;
        if (hulVar == null || (webContext = hulVar.getWebContext()) == null) {
            return false;
        }
        for (String str : permissions) {
            if (j26.m143188a(webContext, str) != 0) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final String m104977k(int requestCode) {
        switch (requestCode) {
            case 10001:
                return "需使用麦克风及相机权限，以正常使用语音、视频、直播等功能。";
            case 10002:
                return "需使用麦克风权限，以正常使用语音、视频、直播等功能。";
            case 10003:
                return "需使用存储权限，以保存和读取文件。";
            case 10004:
                return "需使用位置权限，以获取您的位置信息。";
            case 10005:
                return "需使用相机权限，以使用拍照和录像功能。";
            default:
                return "需使用相关权限才能使用此功能。";
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public String m104978l(@NotNull String[] permissions, int requestCode) {
        permissions.getClass();
        switch (requestCode) {
            case 10001:
                return "需要麦克风和相机权限，以正常使用语音、视频、直播等功能。\n\n请在设置中开启相应权限。";
            case 10002:
                return "需要麦克风权限，以正常使用语音、视频、直播等功能。\n\n请在设置中开启相应权限。";
            case 10003:
                return "需要存储权限，以保存和读取文件。\n\n请在设置中开启相应权限。";
            case 10004:
                return "需要位置权限，以获取您的位置信息。\n\n请在设置中开启相应权限。";
            case 10005:
                return "需要相机权限，以使用拍照和录像功能。\n\n请在设置中开启相应权限。";
            default:
                return "需要相关权限才能使用此功能。\n\n请在设置中开启相应权限。";
        }
    }

    /* JADX INFO: renamed from: o */
    public void m104979o(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        if (grantResults.length == 0) {
            jzv.m147734g("BusinessPermissionChecker", "Grant results is empty");
            this.requestCodeToPermissions.remove(Integer.valueOf(requestCode));
            return;
        }
        this.requestCodeToPermissions.remove(Integer.valueOf(requestCode));
        for (int i : grantResults) {
            if (i != 0) {
                jzv.m147728a("BusinessPermissionChecker", "Some permissions denied for requestCode: " + requestCode);
                m104970m(requestCode);
                Activity activityM104969j = m104969j();
                for (String str : permissions) {
                    if (activityM104969j != null && !v40.m199647x(activityM104969j, str) && !m104975h(str)) {
                        m104982s(requestCode);
                        return;
                    }
                }
                return;
            }
        }
        jzv.m147728a("BusinessPermissionChecker", "All permissions granted for requestCode: " + requestCode);
        m104971n(requestCode);
    }

    /* JADX INFO: renamed from: q */
    public boolean m104980q(@NotNull String[] permissions, int requestCode) {
        permissions.getClass();
        return m104981r(permissions, requestCode, false);
    }

    /* JADX INFO: renamed from: r */
    public boolean m104981r(@NotNull String[] permissions, int requestCode, boolean shieldDialog) {
        permissions.getClass();
        Activity activityM104969j = m104969j();
        if (activityM104969j == null) {
            jzv.m147729b("BusinessPermissionChecker", "Activity is null, cannot request permission");
            return false;
        }
        if (m104976i(permissions)) {
            return true;
        }
        if (shieldDialog) {
            jzv.m147728a("BusinessPermissionChecker", "Shield dialog is enabled, skip requesting permission");
            return false;
        }
        this.requestCodeToPermissions.put(Integer.valueOf(requestCode), permissions);
        for (String str : permissions) {
            if (v40.m199647x(activityM104969j, str)) {
                m104973v(permissions, requestCode);
                return false;
            }
        }
        try {
            v40.m199644u(activityM104969j, permissions, requestCode);
            jzv.m147728a("BusinessPermissionChecker", "Request permissions: " + ArraysKt.joinToString$default(permissions, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) + ", requestCode: " + requestCode);
            return false;
        } catch (Exception unused) {
            jzv.m147729b("BusinessPermissionChecker", "Failed to request permissions: " + ArraysKt.joinToString$default(permissions, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) + ", requestCode: " + requestCode);
            this.requestCodeToPermissions.remove(Integer.valueOf(requestCode));
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m104982s(int requestCode) {
        String strM104977k = m104977k(requestCode);
        if (!i8g0.m139000b(strM104977k)) {
            m104983t(null, strM104977k, false, null);
            return;
        }
        jzv.m147729b("BusinessPermissionChecker", "Permission guide message is blank for requestCode: " + requestCode);
    }

    /* JADX INFO: renamed from: t */
    public final void m104983t(@Nullable String title, @NotNull String message, boolean needFinish, @Nullable DialogInterface.OnDismissListener dismissListener) {
        message.getClass();
        m104984u(title, message, needFinish, dismissListener, false);
    }

    /* JADX INFO: renamed from: u */
    public final void m104984u(@Nullable String title, @NotNull String message, boolean needFinish, @Nullable DialogInterface.OnDismissListener dismissListener, boolean forceShow) {
        AlertDialog alertDialog;
        message.getClass();
        Activity activityM104969j = m104969j();
        if (activityM104969j != null) {
            this.guideDialog = new AlertDialog.Builder(activityM104969j).setMessage(message).setPositiveButton("去设置", new DialogInterfaceOnClickListenerC16034b(activityM104969j)).setNegativeButton("取消", new DialogInterfaceOnClickListenerC16035c()).create();
            if (!i8g0.m139001c(title) && (alertDialog = this.guideDialog) != null) {
                alertDialog.setTitle(title);
            }
            if (dismissListener == null) {
                dismissListener = new DialogInterfaceOnDismissListenerC16036d(needFinish, activityM104969j);
            }
            AlertDialog alertDialog2 = this.guideDialog;
            if (alertDialog2 != null) {
                alertDialog2.setOnDismissListener(dismissListener);
            }
            AlertDialog alertDialog3 = this.guideDialog;
            if (alertDialog3 == null || alertDialog3.isShowing()) {
                return;
            }
            if (forceShow) {
                if (activityM104969j.isFinishing()) {
                    return;
                }
                alertDialog3.show();
            } else {
                if (activityM104969j.isFinishing()) {
                    return;
                }
                alertDialog3.show();
            }
        }
    }
}
