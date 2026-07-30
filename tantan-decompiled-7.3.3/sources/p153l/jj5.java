package p153l;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.facebook.drawee.generic.RoundingParams;
import com.immomo.mmdns.WebDNSHandler;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.util.FragmentRestoreViewStateException;
import com.tantanapp.common.utils.CrashHelper;
import java.net.Socket;

/* JADX INFO: loaded from: classes10.dex */
public class jj5 {
    /* JADX INFO: renamed from: a */
    public static Drawable m145007a(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().setDensity(resources.getDisplayMetrics().densityDpi);
        }
        return (Drawable) puc0.m173844m("com.facebook.drawee.generic.WrappingUtils").m173851c("applyLeafRounding", drawable, roundingParams, resources).m173855h();
    }

    /* JADX INFO: renamed from: b */
    public static void m145008b(Socket socket) {
        try {
            zlk0.m220246h(socket);
        } catch (RuntimeException e) {
            if (!"bio == null".equals(e.getMessage())) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m145009c(vpl vplVar, String str) {
        try {
            return vplVar.mo138090b(str);
        } catch (Throwable th) {
            CrashHelper.m82480d(th, 10000);
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m145010d(BluetoothAdapter bluetoothAdapter, int i) {
        if (Build.VERSION.SDK_INT < 34) {
            return bluetoothAdapter.getProfileConnectionState(i);
        }
        if (PermissionHelper.m81064b("android.permission.BLUETOOTH_CONNECT")) {
            return bluetoothAdapter.getProfileConnectionState(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static WebResourceResponse m145011e(byte[] bArr, WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getRequestHeaders().remove("If-Modified-Since");
        webResourceRequest.getRequestHeaders().remove("If-None-Match");
        return WebDNSHandler.handleInterceptRequest(bArr, webView, webResourceRequest);
    }

    /* JADX INFO: renamed from: f */
    public static void m145012f(Notification notification) {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append(notification.toString());
            sb.append(SignParameters.NEW_LINE);
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
                sb.append(")\n");
            }
            tu2.m192703a("[CommonByteCodeMethods]", sb.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m145013g(NotificationManager notificationManager, int i, Notification notification) {
        notificationManager.notify(i, notification);
        m145012f(notification);
    }

    /* JADX INFO: renamed from: h */
    public static void m145014h(NotificationManager notificationManager, String str, int i, Notification notification) {
        notificationManager.notify(str, i, notification);
        m145012f(notification);
    }

    /* JADX INFO: renamed from: i */
    public static RecyclerView.AbstractC0569e0 m145015i(RecyclerView.Adapter adapter, ViewGroup viewGroup, int i) {
        RecyclerView.AbstractC0569e0 abstractC0569e0OnCreateViewHolder = adapter.onCreateViewHolder(viewGroup, i);
        if (abstractC0569e0OnCreateViewHolder.itemView.getParent() != null) {
            CrashHelper.m82479c(new RuntimeException("创建viewHolder完成后, holder.itemView !=null  ".concat(adapter.getClass().getName())));
        }
        return abstractC0569e0OnCreateViewHolder;
    }

    /* JADX INFO: renamed from: j */
    public static void m145016j(ConnectivityManager connectivityManager, NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback) {
        try {
            connectivityManager.registerNetworkCallback(networkRequest, networkCallback);
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
        }
    }

    /* JADX INFO: renamed from: k */
    public static Intent m145017k(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return Build.VERSION.SDK_INT >= 26 ? application.registerReceiver(broadcastReceiver, intentFilter, 2) : application.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* JADX INFO: renamed from: l */
    public static Intent m145018l(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return Build.VERSION.SDK_INT >= 26 ? context.registerReceiver(broadcastReceiver, intentFilter, 2) : context.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* JADX INFO: renamed from: m */
    public static void m145019m(Fragment fragment, Bundle bundle) {
        try {
            puc0.m173843l(fragment).m173851c("restoreViewState", bundle);
        } catch (Throwable th) {
            CrashHelper.m82479c(new FragmentRestoreViewStateException("FragmentRestoreViewStateException class name ".concat(fragment.getClass().getName()), th));
        }
    }
}
