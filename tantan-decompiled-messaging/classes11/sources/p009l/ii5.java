package p009l;

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
import com.facebook.drawee.generic.RoundingParams;
import com.immomo.mmdns.WebDNSHandler;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p000p1.mobile.putong.util.FragmentRestoreViewStateException;
import com.tantanapp.common.utils.CrashHelper;
import java.net.Socket;
import l.d4y0;
import l.du2;
import l.kmc0;
import l.knl;
import l.tck0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ii5 {
    /* JADX INFO: renamed from: a */
    public static Drawable m16557a(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().setDensity(resources.getDisplayMetrics().densityDpi);
        }
        return (Drawable) kmc0.m("com.facebook.drawee.generic.WrappingUtils").c("applyLeafRounding", new Object[]{drawable, roundingParams, resources}).h();
    }

    /* JADX INFO: renamed from: b */
    public static void m16558b(Socket socket) {
        try {
            tck0.h(socket);
        } catch (RuntimeException e) {
            if (!"bio == null".equals(e.getMessage())) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m16559c(knl knlVar, String str) {
        try {
            return knlVar.b(str);
        } catch (Throwable th) {
            CrashHelper.d(th, 10000);
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m16560d(BluetoothAdapter bluetoothAdapter, int i) {
        if (Build.VERSION.SDK_INT < 34) {
            return bluetoothAdapter.getProfileConnectionState(i);
        }
        if (PermissionHelper.m10210b("android.permission.BLUETOOTH_CONNECT")) {
            return bluetoothAdapter.getProfileConnectionState(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static WebResourceResponse m16561e(byte[] bArr, WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getRequestHeaders().remove("If-Modified-Since");
        webResourceRequest.getRequestHeaders().remove("If-None-Match");
        return WebDNSHandler.handleInterceptRequest(bArr, webView, webResourceRequest);
    }

    /* JADX INFO: renamed from: f */
    public static void m16562f(Notification notification) {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append(notification.toString());
            sb.append("\n");
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
                sb.append(")\n");
            }
            du2.a("[CommonByteCodeMethods]", sb.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m16563g(NotificationManager notificationManager, int i, Notification notification) {
        notificationManager.notify(i, notification);
        m16562f(notification);
    }

    /* JADX INFO: renamed from: h */
    public static void m16564h(NotificationManager notificationManager, String str, int i, Notification notification) {
        notificationManager.notify(str, i, notification);
        m16562f(notification);
    }

    /* JADX INFO: renamed from: i */
    public static RecyclerView.d0 m16565i(RecyclerView.Adapter adapter, ViewGroup viewGroup, int i) {
        RecyclerView.d0 d0VarOnCreateViewHolder = adapter.onCreateViewHolder(viewGroup, i);
        if (d0VarOnCreateViewHolder.itemView.getParent() != null) {
            CrashHelper.c(new RuntimeException("创建viewHolder完成后, holder.itemView !=null  ".concat(adapter.getClass().getName())));
        }
        return d0VarOnCreateViewHolder;
    }

    /* JADX INFO: renamed from: j */
    public static void m16566j(ConnectivityManager connectivityManager, NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback) {
        try {
            connectivityManager.registerNetworkCallback(networkRequest, networkCallback);
        } catch (Throwable th) {
            CrashHelper.c(th);
        }
    }

    /* JADX INFO: renamed from: k */
    public static Intent m16567k(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return Build.VERSION.SDK_INT >= 26 ? application.registerReceiver(broadcastReceiver, intentFilter, 2) : application.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* JADX INFO: renamed from: l */
    public static Intent m16568l(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return Build.VERSION.SDK_INT >= 26 ? d4y0.a(context, broadcastReceiver, intentFilter, 2) : context.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* JADX INFO: renamed from: m */
    public static void m16569m(Fragment fragment, Bundle bundle) {
        try {
            kmc0.l(fragment).c("restoreViewState", new Object[]{bundle});
        } catch (Throwable th) {
            CrashHelper.c(new FragmentRestoreViewStateException("FragmentRestoreViewStateException class name ".concat(fragment.getClass().getName()), th));
        }
    }
}
