package p149l;

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
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.util.FragmentRestoreViewStateException;
import com.tantanapp.common.utils.CrashHelper;
import java.net.Socket;

/* JADX INFO: loaded from: classes11.dex */
public class ii5 {
    /* JADX INFO: renamed from: a */
    public static Drawable m136331a(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().setDensity(resources.getDisplayMetrics().densityDpi);
        }
        return (Drawable) kmc0.m146495m("com.facebook.drawee.generic.WrappingUtils").m146502c("applyLeafRounding", drawable, roundingParams, resources).m146506h();
    }

    /* JADX INFO: renamed from: b */
    public static void m136332b(Socket socket) {
        try {
            tck0.m188007h(socket);
        } catch (RuntimeException e) {
            if (!"bio == null".equals(e.getMessage())) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m136333c(knl knlVar, String str) {
        try {
            return knlVar.mo146571b(str);
        } catch (Throwable th) {
            CrashHelper.m81297d(th, 10000);
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m136334d(BluetoothAdapter bluetoothAdapter, int i) {
        if (Build.VERSION.SDK_INT < 34) {
            return bluetoothAdapter.getProfileConnectionState(i);
        }
        if (PermissionHelper.m79881b("android.permission.BLUETOOTH_CONNECT")) {
            return bluetoothAdapter.getProfileConnectionState(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static WebResourceResponse m136335e(byte[] bArr, WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getRequestHeaders().remove("If-Modified-Since");
        webResourceRequest.getRequestHeaders().remove("If-None-Match");
        return WebDNSHandler.handleInterceptRequest(bArr, webView, webResourceRequest);
    }

    /* JADX INFO: renamed from: f */
    public static void m136336f(Notification notification) {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append(notification.toString());
            sb.append(SignParameters.NEW_LINE);
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
                sb.append(")\n");
            }
            du2.m113670a("[CommonByteCodeMethods]", sb.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m136337g(NotificationManager notificationManager, int i, Notification notification) {
        notificationManager.notify(i, notification);
        m136336f(notification);
    }

    /* JADX INFO: renamed from: h */
    public static void m136338h(NotificationManager notificationManager, String str, int i, Notification notification) {
        notificationManager.notify(str, i, notification);
        m136336f(notification);
    }

    /* JADX INFO: renamed from: i */
    public static RecyclerView.AbstractC0566d0 m136339i(RecyclerView.Adapter adapter, ViewGroup viewGroup, int i) {
        RecyclerView.AbstractC0566d0 abstractC0566d0OnCreateViewHolder = adapter.onCreateViewHolder(viewGroup, i);
        if (abstractC0566d0OnCreateViewHolder.itemView.getParent() != null) {
            CrashHelper.m81296c(new RuntimeException("创建viewHolder完成后, holder.itemView !=null  ".concat(adapter.getClass().getName())));
        }
        return abstractC0566d0OnCreateViewHolder;
    }

    /* JADX INFO: renamed from: j */
    public static void m136340j(ConnectivityManager connectivityManager, NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback) {
        try {
            connectivityManager.registerNetworkCallback(networkRequest, networkCallback);
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
        }
    }

    /* JADX INFO: renamed from: k */
    public static Intent m136341k(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return Build.VERSION.SDK_INT >= 26 ? application.registerReceiver(broadcastReceiver, intentFilter, 2) : application.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* JADX INFO: renamed from: l */
    public static Intent m136342l(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return Build.VERSION.SDK_INT >= 26 ? context.registerReceiver(broadcastReceiver, intentFilter, 2) : context.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* JADX INFO: renamed from: m */
    public static void m136343m(Fragment fragment, Bundle bundle) {
        try {
            kmc0.m146494l(fragment).m146502c("restoreViewState", bundle);
        } catch (Throwable th) {
            CrashHelper.m81296c(new FragmentRestoreViewStateException("FragmentRestoreViewStateException class name ".concat(fragment.getClass().getName()), th));
        }
    }
}
