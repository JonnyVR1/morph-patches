package com.clevertap.android.pushsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.interfaces.NotificationRenderedListener;
import com.clevertap.android.sdk.pushnotification.INotificationRenderer;
import com.clevertap.android.sdk.pushnotification.PushNotificationUtil;
import com.google.firebase.messaging.RemoteMessage;
import com.guardsquare.dexguard.decodeByteArray;
import com.guardsquare.dexguard.height;
import com.guardsquare.dexguard.valueOf;
import com.momo.momortc.MMConstants;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.UnsupportedEncodingException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes.dex */
public class registerForContextMenu extends BroadcastReceiver implements NotificationRenderedListener {
    private static int decodeByteArray;
    private static char duration;
    private static char height;
    private static char isOpaque;
    public static final byte[] setContentView = null;
    private static char setTime;
    private static int sync;
    public static final int unregisterForContextMenu = 0;
    private static final String valueOf;
    private long Movie;
    private ScheduledExecutorService onContextItemSelected;
    private Future<?> onOptionsItemSelected;
    private boolean openContextMenu;
    private long registerForContextMenu;
    private BroadcastReceiver.PendingResult values;
    private final Runnable width = new Runnable() { // from class: com.clevertap.android.pushsdk.registerForContextMenu.3
        private static char[] onOptionsItemSelected = {':', Constants.INAPP_POSITION_TOP, Constants.INAPP_POSITION_TOP, Constants.INAPP_POSITION_BOTTOM, Matrix.MATRIX_TYPE_ZERO, 'i', 'k'};
        private static int openContextMenu = 0;
        private static int setContentView = 1;

        private static void registerForContextMenu(boolean z, String str, int[] iArr, Object[] objArr) throws UnsupportedEncodingException {
            String str2;
            Object bytes = str;
            if (str != null) {
                bytes = str.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            synchronized (com.guardsquare.dexguard.values.registerForContextMenu) {
                try {
                    int i = iArr[0];
                    int i2 = iArr[1];
                    int i3 = iArr[2];
                    int i4 = iArr[3];
                    char[] cArr = new char[i2];
                    System.arraycopy(onOptionsItemSelected, i, cArr, 0, i2);
                    if (bArr != null) {
                        char[] cArr2 = new char[i2];
                        com.guardsquare.dexguard.values.onOptionsItemSelected = 0;
                        char c = 0;
                        while (true) {
                            int i5 = com.guardsquare.dexguard.values.onOptionsItemSelected;
                            if (i5 >= i2) {
                                break;
                            }
                            if (bArr[i5] == 1) {
                                cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                            } else {
                                cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                            }
                            c = cArr2[i5];
                            com.guardsquare.dexguard.values.onOptionsItemSelected = i5 + 1;
                        }
                        cArr = cArr2;
                    }
                    if (i4 > 0) {
                        char[] cArr3 = new char[i2];
                        System.arraycopy(cArr, 0, cArr3, 0, i2);
                        int i6 = i2 - i4;
                        System.arraycopy(cArr3, 0, cArr, i6, i4);
                        System.arraycopy(cArr3, i4, cArr, 0, i6);
                    }
                    if (z) {
                        char[] cArr4 = new char[i2];
                        com.guardsquare.dexguard.values.onOptionsItemSelected = 0;
                        while (true) {
                            int i7 = com.guardsquare.dexguard.values.onOptionsItemSelected;
                            if (i7 >= i2) {
                                break;
                            }
                            cArr4[i7] = cArr[(i2 - i7) - 1];
                            com.guardsquare.dexguard.values.onOptionsItemSelected = i7 + 1;
                        }
                        cArr = cArr4;
                    }
                    if (i3 > 0) {
                        com.guardsquare.dexguard.values.onOptionsItemSelected = 0;
                        while (true) {
                            int i8 = com.guardsquare.dexguard.values.onOptionsItemSelected;
                            if (i8 >= i2) {
                                break;
                            }
                            cArr[i8] = (char) (cArr[i8] - iArr[2]);
                            com.guardsquare.dexguard.values.onOptionsItemSelected = i8 + 1;
                        }
                    }
                    str2 = new String(cArr);
                } catch (Throwable th) {
                    throw th;
                }
            }
            objArr[0] = str2;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                registerForContextMenu registerforcontextmenu = registerForContextMenu.this;
                Object[] objArr = new Object[1];
                registerForContextMenu(true, "\u0000\u0000\u0001\u0000\u0000\u0000\u0000", new int[]{0, 7, 0, 1}, objArr);
                registerForContextMenu.registerForContextMenu(registerforcontextmenu, ((String) objArr[0]).intern());
                if (registerForContextMenu.registerForContextMenu(registerForContextMenu.this) != null) {
                    int i = openContextMenu + 69;
                    setContentView = i % 128;
                    int i2 = i % 2;
                    registerForContextMenu registerforcontextmenu2 = registerForContextMenu.this;
                    if (i2 == 0) {
                        registerForContextMenu.registerForContextMenu(registerforcontextmenu2).shutdown();
                        throw null;
                    }
                    registerForContextMenu.registerForContextMenu(registerforcontextmenu2).shutdown();
                }
                int i3 = openContextMenu + 23;
                setContentView = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    static {
        onOptionsItemSelected();
        decodeByteArray = 0;
        sync = 1;
        registerForContextMenu();
        Object[] objArr = new Object[1];
        registerForContextMenu("뀙\u2fea饪\ueaa7", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, objArr);
        valueOf = ((String) objArr[0]).intern();
        sync = (decodeByteArray + 7) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:234:0x07f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:238:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:240:0x0819  */
    /* JADX WARN: Code duplicated, block: B:245:0x0822  */
    /* JADX WARN: Code duplicated, block: B:247:0x083e  */
    /* JADX WARN: Code duplicated, block: B:360:0x0851 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private void onOptionsItemSelected(String str) throws Throwable {
        int i;
        byte[] bArr;
        int i2;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object objInvoke;
        int i3;
        char c;
        int i4;
        values valuesVar = new values(this, str);
        byte[] bArr2 = setContentView;
        Object[] objArr4 = new Object[1];
        setContentView((byte) (bArr2[713] - 1), 832, 85, objArr4);
        int i5 = 0;
        String str2 = (String) objArr4[0];
        byte b = bArr2[713];
        int i6 = unregisterForContextMenu;
        Object[] objArr5 = new Object[1];
        setContentView(b, (short) (i6 | 1842), 497, objArr5);
        try {
            Object[] objArr6 = {(String) objArr5[0]};
            Object[] objArr7 = new Object[1];
            setContentView(bArr2[1], 1030, 482, objArr7);
            Class<?> cls = Class.forName((String) objArr7[0]);
            byte b2 = bArr2[31];
            Object[] objArr8 = new Object[1];
            setContentView(b2, (short) (b2 | 2276), (short) (i6 | 297), objArr8);
            String str3 = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            setContentView(bArr2[1], 1030, 482, objArr9);
            Object[] objArr10 = (Object[]) cls.getMethod(str3, Class.forName((String) objArr9[0])).invoke(str2, objArr6);
            int[] iArr = new int[objArr10.length];
            int i7 = 0;
            while (i7 < objArr10.length) {
                try {
                    Object[] objArr11 = {objArr10[i7]};
                    byte[] bArr3 = setContentView;
                    int i8 = i5;
                    Object[] objArr12 = new Object[1];
                    setContentView(bArr3[1], 2411, 481, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[i8]);
                    byte b3 = bArr3[22];
                    Object[] objArr13 = new Object[1];
                    setContentView(b3, (short) (b3 | 845), 491, objArr13);
                    String str4 = (String) objArr13[i8];
                    Object[] objArr14 = new Object[1];
                    setContentView(bArr3[1], 1030, 482, objArr14);
                    Object objInvoke2 = cls2.getMethod(str4, Class.forName((String) objArr14[i8])).invoke(null, objArr11);
                    try {
                        Object[] objArr15 = new Object[1];
                        setContentView(bArr3[1], 2411, 481, objArr15);
                        Class<?> cls3 = Class.forName((String) objArr15[i8]);
                        Object[] objArr16 = new Object[1];
                        setContentView(bArr3[67], 839, 490, objArr16);
                        iArr[i7] = ((Integer) cls3.getMethod((String) objArr16[i8], null).invoke(objInvoke2, null)).intValue();
                        i7++;
                        i5 = i8;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i9 = i5;
            int i10 = 22;
            int i11 = i9;
            while (true) {
                int i12 = i11 + 1;
                try {
                    int iOpenContextMenu = valuesVar.openContextMenu(iArr[i11]);
                    Class cls4 = Long.TYPE;
                    Class cls5 = Integer.TYPE;
                    switch (iOpenContextMenu) {
                        case -53:
                            i11 = 116;
                            break;
                        case -52:
                            i = i10;
                            try {
                                valuesVar.openContextMenu(i);
                                int i13 = valuesVar.setContentView;
                                i11 = (i13 == 7 || i13 != 62) ? 59 : 71;
                            } catch (Throwable th3) {
                                th = th3;
                                bArr = setContentView;
                                byte b4 = bArr[1];
                                i2 = unregisterForContextMenu;
                                objArr = new Object[1];
                                setContentView(b4, (short) (i2 | 1842), (short) (i2 | 283), objArr);
                                if (Class.forName((String) objArr[i9]).isInstance(th)) {
                                    objArr2 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr2);
                                    if (Class.forName((String) objArr2[i9]).isInstance(th)) {
                                        objArr3 = new Object[1];
                                        setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                        if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    objArr3 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                    if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                objArr2 = new Object[1];
                                setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr2);
                                if (Class.forName((String) objArr2[i9]).isInstance(th)) {
                                    objArr3 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                    if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                objArr3 = new Object[1];
                                setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                }
                                throw th;
                                valuesVar.onContextItemSelected = th;
                                valuesVar.openContextMenu(55);
                                i11 = 72;
                            }
                            i10 = i;
                            break;
                        case -51:
                            i11 = 111;
                            i10 = 22;
                            break;
                        case -50:
                            valuesVar.openContextMenu(i10);
                            int i14 = valuesVar.setContentView;
                            i11 = (i14 == 0 || i14 != 1) ? 103 : 78;
                            i10 = 22;
                            break;
                        case -49:
                            i11 = 106;
                            i10 = 22;
                            break;
                        case -48:
                            try {
                                valuesVar.openContextMenu(i10);
                                i11 = valuesVar.setContentView != 9 ? 83 : 71;
                                i10 = 22;
                            } catch (Throwable th4) {
                                th = th4;
                                i = 22;
                                bArr = setContentView;
                                byte b5 = bArr[1];
                                i2 = unregisterForContextMenu;
                                objArr = new Object[1];
                                setContentView(b5, (short) (i2 | 1842), (short) (i2 | 283), objArr);
                                if (Class.forName((String) objArr[i9]).isInstance(th)) {
                                    objArr2 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr2);
                                    if (Class.forName((String) objArr2[i9]).isInstance(th)) {
                                        objArr3 = new Object[1];
                                        setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                        if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    objArr3 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                    if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                objArr2 = new Object[1];
                                setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr2);
                                if (Class.forName((String) objArr2[i9]).isInstance(th)) {
                                    objArr3 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                    if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                objArr3 = new Object[1];
                                setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                }
                                throw th;
                                valuesVar.onContextItemSelected = th;
                                valuesVar.openContextMenu(55);
                                i11 = 72;
                                i10 = i;
                            }
                            break;
                        case -47:
                            i11 = 112;
                            break;
                        case -46:
                            i11 = 114;
                            break;
                        case -45:
                            valuesVar.openContextMenu(18);
                            i11 = valuesVar.setContentView == 0 ? 102 : i12;
                            break;
                        case -44:
                            i11 = 64;
                            break;
                        case -43:
                            i11 = 91;
                            break;
                        case -42:
                            valuesVar.openContextMenu(18);
                            if (valuesVar.setContentView == 0) {
                                i11 = 90;
                            }
                            break;
                        case -41:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(9);
                            decodeByteArray = valuesVar.setContentView;
                            break;
                        case -40:
                            i4 = sync;
                            valuesVar.openContextMenu = i4;
                            valuesVar.openContextMenu(4);
                            break;
                        case -39:
                            i11 = 71;
                            break;
                        case -38:
                            i11 = 1;
                            break;
                        case -37:
                            return;
                        case -36:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            Object obj = valuesVar.width;
                            try {
                                byte[] bArr4 = setContentView;
                                byte b6 = bArr4[1];
                                Object[] objArr17 = new Object[1];
                                setContentView(b6, (short) (b6 | 1874), (short) (unregisterForContextMenu | 283), objArr17);
                                Class<?> cls6 = Class.forName((String) objArr17[i9]);
                                Object[] objArr18 = new Object[1];
                                setContentView(bArr4[6], 2083, 483, objArr18);
                                cls6.getMethod((String) objArr18[i9], null).invoke(obj, null);
                            } catch (Throwable th5) {
                                Throwable cause3 = th5.getCause();
                                if (cause3 == null) {
                                    throw th5;
                                }
                                throw cause3;
                            }
                            break;
                        case -35:
                            i11 = 81;
                            break;
                        case -34:
                            i11 = 92;
                            break;
                        case -33:
                            valuesVar.openContextMenu = 2;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            registerForContextMenu registerforcontextmenu = (registerForContextMenu) valuesVar.width;
                            valuesVar.openContextMenu(9);
                            registerforcontextmenu.openContextMenu = valuesVar.setContentView != 0 ? 1 : i9;
                            break;
                        case -32:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            Object obj2 = valuesVar.width;
                            try {
                                byte[] bArr5 = setContentView;
                                Object[] objArr19 = new Object[1];
                                setContentView(bArr5[592], 1985, 451, objArr19);
                                Class<?> cls7 = Class.forName((String) objArr19[i9]);
                                Object[] objArr20 = new Object[1];
                                setContentView(bArr5[21], 2149, (short) (unregisterForContextMenu | 296), objArr20);
                                cls7.getMethod((String) objArr20[i9], null).invoke(obj2, null);
                            } catch (Throwable th6) {
                                Throwable cause4 = th6.getCause();
                                if (cause4 == null) {
                                    throw th6;
                                }
                                throw cause4;
                            }
                            break;
                        case -31:
                            i11 = 107;
                            break;
                        case -30:
                            i11 = 109;
                            break;
                        case -29:
                            valuesVar.openContextMenu(41);
                            if (valuesVar.setContentView == 0) {
                                i11 = 63;
                            }
                            break;
                        case -28:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            i4 = ((registerForContextMenu) valuesVar.width).openContextMenu;
                            valuesVar.openContextMenu = i4;
                            valuesVar.openContextMenu(4);
                            break;
                        case -27:
                            i11 = 117;
                            break;
                        case -26:
                            i11 = 119;
                            break;
                        case ShareConstants.ERROR_LOAD_PATCH_UNCAUGHT_EXCEPTION /* -25 */:
                            valuesVar.openContextMenu(40);
                            if (valuesVar.setContentView == 0) {
                                i11 = 58;
                            }
                            break;
                        case ShareConstants.ERROR_LOAD_PATCH_VERSION_RESOURCE_MD5_MISMATCH /* -24 */:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            objInvoke = ((registerForContextMenu) valuesVar.width).values;
                            try {
                                valuesVar.onContextItemSelected = objInvoke;
                                valuesVar.openContextMenu(2);
                            } catch (Throwable th7) {
                                th = th7;
                                i = i10;
                                bArr = setContentView;
                                byte b7 = bArr[1];
                                i2 = unregisterForContextMenu;
                                objArr = new Object[1];
                                setContentView(b7, (short) (i2 | 1842), (short) (i2 | 283), objArr);
                                if (Class.forName((String) objArr[i9]).isInstance(th)) {
                                    objArr2 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr2);
                                    if (Class.forName((String) objArr2[i9]).isInstance(th)) {
                                        objArr3 = new Object[1];
                                        setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                        if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    objArr3 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                    if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                objArr2 = new Object[1];
                                setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr2);
                                if (Class.forName((String) objArr2[i9]).isInstance(th)) {
                                    objArr3 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                    if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                objArr3 = new Object[1];
                                setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                }
                                throw th;
                                valuesVar.onContextItemSelected = th;
                                valuesVar.openContextMenu(55);
                                i11 = 72;
                                i10 = i;
                            }
                            break;
                        case ShareConstants.ERROR_LOAD_PATCH_VERSION_RESOURCE_LOAD_EXCEPTION /* -23 */:
                            try {
                                valuesVar.openContextMenu = 1;
                                valuesVar.openContextMenu(7);
                                valuesVar.openContextMenu(8);
                                Object obj3 = valuesVar.width;
                                try {
                                    byte[] bArr6 = setContentView;
                                    Object[] objArr21 = new Object[1];
                                    setContentView(bArr6[1], bArr6[9], 482, objArr21);
                                    Class<?> cls8 = Class.forName((String) objArr21[i9]);
                                    Object[] objArr22 = new Object[1];
                                    try {
                                        setContentView(bArr6[83], bArr6[17], 490, objArr22);
                                        objInvoke = cls8.getMethod((String) objArr22[i9], null).invoke(obj3, null);
                                        valuesVar.onContextItemSelected = objInvoke;
                                        valuesVar.openContextMenu(2);
                                    } catch (Throwable th8) {
                                        th = th8;
                                        Throwable cause5 = th.getCause();
                                        if (cause5 == null) {
                                            throw th;
                                        }
                                        throw cause5;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                i = i10;
                                bArr = setContentView;
                                byte b8 = bArr[1];
                                i2 = unregisterForContextMenu;
                                objArr = new Object[1];
                                setContentView(b8, (short) (i2 | 1842), (short) (i2 | 283), objArr);
                                if (Class.forName((String) objArr[i9]).isInstance(th)) {
                                    objArr2 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr2);
                                    if (Class.forName((String) objArr2[i9]).isInstance(th)) {
                                        objArr3 = new Object[1];
                                        setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                        if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    objArr3 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                    if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                objArr2 = new Object[1];
                                setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr2);
                                if (Class.forName((String) objArr2[i9]).isInstance(th)) {
                                    objArr3 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                    if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                objArr3 = new Object[1];
                                setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                }
                                throw th;
                                valuesVar.onContextItemSelected = th;
                                valuesVar.openContextMenu(55);
                                i11 = 72;
                                i10 = i;
                            }
                            break;
                        case ShareConstants.ERROR_LOAD_PATCH_VERSION_RESOURCE_FILE_NOT_EXIST /* -22 */:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(9);
                            try {
                                Object[] objArr23 = {Integer.valueOf(valuesVar.setContentView)};
                                byte[] bArr7 = setContentView;
                                Object[] objArr24 = new Object[1];
                                setContentView(bArr7[592], 176, 475, objArr24);
                                Class<?> cls9 = Class.forName((String) objArr24[i9]);
                                Object[] objArr25 = new Object[1];
                                setContentView(bArr7[675], 2725, (short) (unregisterForContextMenu | 288), objArr25);
                                valuesVar.onOptionsItemSelected = ((Float) cls9.getMethod((String) objArr25[i9], cls5).invoke(null, objArr23)).floatValue();
                                valuesVar.openContextMenu(37);
                            } catch (Throwable th11) {
                                Throwable cause6 = th11.getCause();
                                if (cause6 == null) {
                                    throw th11;
                                }
                                throw cause6;
                            }
                            break;
                        case -21:
                            valuesVar.onContextItemSelected = "\u1a5f\u0dce颻릠\uead9폞劉\u2d7a穨偷\uf1ca蔮\ude35킐銱犂뙲퓽笑\u2062Ϝ橂䳱\u18fd咋\uee6d\ue82c﮾\uf05e숉\ue9be\udc85\uf2b3\uf83e䳱\u18fd՜\uee74\ueaef㚻\ue82c﮾箉띩ﭺ껷ﰣ駜";
                            valuesVar.openContextMenu(2);
                            break;
                        case -20:
                            valuesVar.openContextMenu = 2;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            Object obj4 = valuesVar.width;
                            valuesVar.openContextMenu(35);
                            try {
                                Object[] objArr26 = {Long.valueOf(valuesVar.unregisterForContextMenu)};
                                byte[] bArr8 = setContentView;
                                Object[] objArr27 = new Object[1];
                                setContentView(bArr8[1], 1939, 475, objArr27);
                                Class<?> cls10 = Class.forName((String) objArr27[i9]);
                                byte b9 = bArr8[592];
                                short s = bArr8[i10];
                                Object[] objArr28 = new Object[1];
                                setContentView(b9, s, (short) (s | 492), objArr28);
                                valuesVar.onContextItemSelected = cls10.getMethod((String) objArr28[i9], cls4).invoke(obj4, objArr26);
                                valuesVar.openContextMenu(2);
                            } catch (Throwable th12) {
                                Throwable cause7 = th12.getCause();
                                if (cause7 == null) {
                                    throw th12;
                                }
                                throw cause7;
                            }
                            break;
                        case -19:
                            valuesVar.openContextMenu = 2;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            Object obj5 = valuesVar.width;
                            valuesVar.openContextMenu(35);
                            try {
                                Object[] objArr29 = {Long.valueOf(valuesVar.unregisterForContextMenu)};
                                byte[] bArr9 = setContentView;
                                Object[] objArr30 = new Object[1];
                                setContentView(bArr9[1], 387, (short) (unregisterForContextMenu | 273), objArr30);
                                Class<?> cls11 = Class.forName((String) objArr30[i9]);
                                Object[] objArr31 = new Object[1];
                                setContentView(bArr9[83], 1593, 489, objArr31);
                                valuesVar.registerForContextMenu = ((Long) cls11.getMethod((String) objArr31[i9], cls4).invoke(obj5, objArr29)).longValue();
                                i3 = 29;
                                valuesVar.openContextMenu(i3);
                            } catch (Throwable th13) {
                                Throwable cause8 = th13.getCause();
                                if (cause8 == null) {
                                    throw th13;
                                }
                                throw cause8;
                            }
                            break;
                        case -18:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            valuesVar.registerForContextMenu = ((registerForContextMenu) valuesVar.width).Movie;
                            i3 = 29;
                            valuesVar.openContextMenu(i3);
                            break;
                        case ShareConstants.ERROR_LOAD_PATCH_VERSION_LIB_DIRECTORY_NOT_EXIST /* -17 */:
                            byte[] bArr10 = setContentView;
                            byte b10 = bArr10[1];
                            int i15 = unregisterForContextMenu;
                            Object[] objArr32 = new Object[1];
                            setContentView(b10, 387, (short) (i15 | 273), objArr32);
                            Class<?> cls12 = Class.forName((String) objArr32[i9]);
                            Object[] objArr33 = new Object[1];
                            setContentView(bArr10[312], 1626, (short) (i15 | 291), objArr33);
                            valuesVar.onContextItemSelected = cls12.getField((String) objArr33[i9]).get(null);
                            valuesVar.openContextMenu(2);
                            break;
                        case -16:
                            valuesVar.openContextMenu = 2;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            Object obj6 = valuesVar.width;
                            valuesVar.openContextMenu(8);
                            try {
                                Object[] objArr34 = {valuesVar.width};
                                byte[] bArr11 = setContentView;
                                Object[] objArr35 = new Object[1];
                                setContentView(bArr11[1], 1939, 475, objArr35);
                                Class<?> cls13 = Class.forName((String) objArr35[i9]);
                                byte b11 = bArr11[592];
                                short s2 = bArr11[i10];
                                Object[] objArr36 = new Object[1];
                                setContentView(b11, s2, (short) (s2 | 492), objArr36);
                                String str5 = (String) objArr36[i9];
                                Object[] objArr37 = new Object[1];
                                setContentView(bArr11[1], 1030, 482, objArr37);
                                valuesVar.onContextItemSelected = cls13.getMethod(str5, Class.forName((String) objArr37[i9])).invoke(obj6, objArr34);
                                valuesVar.openContextMenu(2);
                            } catch (Throwable th14) {
                                Throwable cause9 = th14.getCause();
                                if (cause9 == null) {
                                    throw th14;
                                }
                                throw cause9;
                            }
                            break;
                        case -15:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(9);
                            valuesVar.openContextMenu = AndroidCharacter.getMirror((char) valuesVar.setContentView);
                            valuesVar.openContextMenu(4);
                            break;
                        case -14:
                            valuesVar.onContextItemSelected = "銱犂뙲퓽笑\u2062튎౼⌑崰뭁䧋䳱\u18fd咋\uee6d\ue82c﮾殑όﰣ駜";
                            valuesVar.openContextMenu(2);
                            break;
                        case -13:
                            try {
                                Object[] objArr38 = new Object[1];
                                setContentView(setContentView[1], 1939, 475, objArr38);
                                valuesVar.onContextItemSelected = Class.forName((String) objArr38[i9]).getDeclaredConstructor(null).newInstance(null);
                                valuesVar.openContextMenu(2);
                            } catch (Throwable th15) {
                                Throwable cause10 = th15.getCause();
                                if (cause10 == null) {
                                    throw th15;
                                }
                                throw cause10;
                            }
                            break;
                        case -12:
                            try {
                                valuesVar.openContextMenu = 3;
                                valuesVar.openContextMenu(7);
                                valuesVar.openContextMenu(9);
                                int i16 = valuesVar.setContentView;
                                valuesVar.openContextMenu(9);
                                int i17 = valuesVar.setContentView;
                                valuesVar.openContextMenu(9);
                                try {
                                    Object[] objArr39 = new Object[3];
                                    objArr39[2] = Integer.valueOf(valuesVar.setContentView);
                                    objArr39[1] = Integer.valueOf(i17);
                                    objArr39[i9] = Integer.valueOf(i16);
                                    byte[] bArr12 = setContentView;
                                    Object[] objArr40 = new Object[1];
                                    setContentView(bArr12[592], HttpStatus.REQUEST_TIMEOUT_408, 476, objArr40);
                                    Class<?> cls14 = Class.forName((String) objArr40[i9]);
                                    Object[] objArr41 = new Object[1];
                                    setContentView(bArr12[24], 1595, (short) (unregisterForContextMenu | 299), objArr41);
                                    valuesVar.openContextMenu = ((Integer) cls14.getMethod((String) objArr41[i9], cls5, cls5, cls5).invoke(null, objArr39)).intValue();
                                    valuesVar.openContextMenu(4);
                                } catch (Throwable th16) {
                                    Throwable cause11 = th16.getCause();
                                    if (cause11 == null) {
                                        throw th16;
                                    }
                                    throw cause11;
                                }
                            } catch (Throwable th17) {
                                th = th17;
                                i = i10;
                                bArr = setContentView;
                                byte b12 = bArr[1];
                                i2 = unregisterForContextMenu;
                                objArr = new Object[1];
                                setContentView(b12, (short) (i2 | 1842), (short) (i2 | 283), objArr);
                                if (Class.forName((String) objArr[i9]).isInstance(th)) {
                                    objArr2 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr2);
                                    if (Class.forName((String) objArr2[i9]).isInstance(th)) {
                                        objArr3 = new Object[1];
                                        setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                        if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    objArr3 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                    if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                objArr2 = new Object[1];
                                setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr2);
                                if (Class.forName((String) objArr2[i9]).isInstance(th)) {
                                    objArr3 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                    if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                objArr3 = new Object[1];
                                setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                }
                                throw th;
                                valuesVar.onContextItemSelected = th;
                                valuesVar.openContextMenu(55);
                                i11 = 72;
                                i10 = i;
                            }
                            break;
                        case -11:
                            c = 497;
                            valuesVar.openContextMenu = -16777212;
                            valuesVar.openContextMenu(4);
                            break;
                        case -10:
                            c = 497;
                            try {
                                byte[] bArr13 = setContentView;
                                Object[] objArr42 = new Object[1];
                                setContentView(bArr13[1], 2426, 482, objArr42);
                                Class<?> cls15 = Class.forName((String) objArr42[i9]);
                                byte b13 = bArr13[19];
                                Object[] objArr43 = new Object[1];
                                setContentView(b13, (short) (b13 | 1570), 490, objArr43);
                                try {
                                    valuesVar.registerForContextMenu = ((Long) cls15.getMethod((String) objArr43[i9], null).invoke(null, null)).longValue();
                                    valuesVar.openContextMenu(29);
                                } catch (Throwable th18) {
                                    th = th18;
                                    i = i10;
                                    bArr = setContentView;
                                    byte b14 = bArr[1];
                                    i2 = unregisterForContextMenu;
                                    objArr = new Object[1];
                                    setContentView(b14, (short) (i2 | 1842), (short) (i2 | 283), objArr);
                                    if (Class.forName((String) objArr[i9]).isInstance(th)) {
                                        objArr2 = new Object[1];
                                        setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr2);
                                        if (Class.forName((String) objArr2[i9]).isInstance(th)) {
                                            objArr3 = new Object[1];
                                            setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                            if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                            }
                                            throw th;
                                        }
                                        objArr3 = new Object[1];
                                        setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                        if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    objArr2 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr2);
                                    if (Class.forName((String) objArr2[i9]).isInstance(th)) {
                                        objArr3 = new Object[1];
                                        setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                        if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    objArr3 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                    if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                                    }
                                    throw th;
                                    valuesVar.onContextItemSelected = th;
                                    valuesVar.openContextMenu(55);
                                    i11 = 72;
                                    i10 = i;
                                }
                            } catch (Throwable th19) {
                                Throwable cause12 = th19.getCause();
                                if (cause12 == null) {
                                    throw th19;
                                }
                                throw cause12;
                            }
                            break;
                        case -9:
                            try {
                                valuesVar.openContextMenu = 2;
                                valuesVar.openContextMenu(7);
                                valuesVar.openContextMenu(8);
                                Object obj7 = valuesVar.width;
                                valuesVar.openContextMenu(8);
                                try {
                                    Object[] objArr44 = new Object[2];
                                    objArr44[1] = valuesVar.width;
                                    objArr44[i9] = obj7;
                                    byte[] bArr14 = setContentView;
                                    Object[] objArr45 = new Object[1];
                                    setContentView(bArr14[675], 1917, 466, objArr45);
                                    Class<?> cls16 = Class.forName((String) objArr45[i9]);
                                    Object[] objArr46 = new Object[1];
                                    c = 497;
                                    try {
                                        setContentView(bArr14[i10], bArr14[11], 497, objArr46);
                                        String str6 = (String) objArr46[i9];
                                        Object[] objArr47 = new Object[1];
                                        setContentView(bArr14[1], 1030, 482, objArr47);
                                        Class<?> cls17 = Class.forName((String) objArr47[i9]);
                                        Object[] objArr48 = new Object[1];
                                        setContentView(bArr14[1], 1030, 482, objArr48);
                                        cls16.getMethod(str6, cls17, Class.forName((String) objArr48[i9])).invoke(null, objArr44);
                                    } catch (Throwable th20) {
                                        th = th20;
                                        Throwable cause13 = th.getCause();
                                        if (cause13 == null) {
                                            throw th;
                                        }
                                        throw cause13;
                                    }
                                } catch (Throwable th21) {
                                    th = th21;
                                }
                            } catch (Throwable th22) {
                                th = th22;
                                c = 497;
                                i = i10;
                                bArr = setContentView;
                                byte b15 = bArr[1];
                                i2 = unregisterForContextMenu;
                                objArr = new Object[1];
                                setContentView(b15, (short) (i2 | 1842), (short) (i2 | 283), objArr);
                                if (Class.forName((String) objArr[i9]).isInstance(th) || i12 < 1 || i12 > 59) {
                                    objArr2 = new Object[1];
                                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr2);
                                    if (Class.forName((String) objArr2[i9]).isInstance(th) || i12 < 59 || i12 > 64) {
                                        objArr3 = new Object[1];
                                        setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                                        if (Class.forName((String) objArr3[i9]).isInstance(th) || i12 < 64 || i12 > 71) {
                                            throw th;
                                        }
                                    }
                                }
                                valuesVar.onContextItemSelected = th;
                                valuesVar.openContextMenu(55);
                                i11 = 72;
                                i10 = i;
                            }
                            break;
                        case -8:
                            valuesVar.openContextMenu = 3;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(9);
                            int i18 = valuesVar.setContentView;
                            valuesVar.openContextMenu(9);
                            int i19 = valuesVar.setContentView;
                            valuesVar.openContextMenu(9);
                            valuesVar.openContextMenu = View.resolveSizeAndState(i18, i19, valuesVar.setContentView);
                            valuesVar.openContextMenu(4);
                            break;
                        case -7:
                            valuesVar.onContextItemSelected = "銱犂뙲퓽笑\u2062Ϝ橂䳱\u18fd咋\uee6d\ue82c﮾\uf05e숉\ue9be\udc85\uf2b3\uf83e䳱\u18fd՜\uee74\ueaef㚻\ue82c﮾⥒鲸ʎ嚩얹\udcd2뮛\ud9f0၅泐";
                            valuesVar.openContextMenu(2);
                            break;
                        case -6:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            Object obj8 = valuesVar.width;
                            try {
                                byte[] bArr15 = setContentView;
                                Object[] objArr49 = new Object[1];
                                setContentView(bArr15[1], 1030, 482, objArr49);
                                Class<?> cls18 = Class.forName((String) objArr49[i9]);
                                Object[] objArr50 = new Object[1];
                                setContentView(bArr15[67], 850, (short) (unregisterForContextMenu | 296), objArr50);
                                valuesVar.onContextItemSelected = cls18.getMethod((String) objArr50[i9], null).invoke(obj8, null);
                                valuesVar.openContextMenu(2);
                            } catch (Throwable th23) {
                                Throwable cause14 = th23.getCause();
                                if (cause14 == null) {
                                    throw th23;
                                }
                                throw cause14;
                            }
                            break;
                        case -5:
                            valuesVar.openContextMenu = 2;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            String str7 = (String) valuesVar.width;
                            valuesVar.openContextMenu(9);
                            Object[] objArr51 = new Object[1];
                            registerForContextMenu(str7, valuesVar.setContentView, objArr51);
                            valuesVar.onContextItemSelected = (String) objArr51[i9];
                            valuesVar.openContextMenu(2);
                            break;
                        case -4:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            valuesVar.openContextMenu = Process.getGidForName((String) valuesVar.width);
                            valuesVar.openContextMenu(4);
                            break;
                        case -3:
                            valuesVar.onContextItemSelected = "";
                            valuesVar.openContextMenu(2);
                            break;
                        case -2:
                            valuesVar.onContextItemSelected = "뀙\u2fea饪\ueaa7";
                            valuesVar.openContextMenu(2);
                            break;
                        case -1:
                            i11 = 74;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th24) {
                    th = th24;
                    i = i10;
                    bArr = setContentView;
                    byte b16 = bArr[1];
                    i2 = unregisterForContextMenu;
                    objArr = new Object[1];
                    setContentView(b16, (short) (i2 | 1842), (short) (i2 | 283), objArr);
                    if (Class.forName((String) objArr[i9]).isInstance(th)) {
                        objArr2 = new Object[1];
                        setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr2);
                        if (Class.forName((String) objArr2[i9]).isInstance(th)) {
                            objArr3 = new Object[1];
                            setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                            if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                            }
                            throw th;
                        }
                        objArr3 = new Object[1];
                        setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                        if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                        }
                        throw th;
                    }
                    objArr2 = new Object[1];
                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr2);
                    if (Class.forName((String) objArr2[i9]).isInstance(th)) {
                        objArr3 = new Object[1];
                        setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                        if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                        }
                        throw th;
                    }
                    objArr3 = new Object[1];
                    setContentView(bArr[1], (short) (i2 | 1842), (short) (i2 | 283), objArr3);
                    if (Class.forName((String) objArr3[i9]).isInstance(th)) {
                    }
                    throw th;
                    valuesVar.onContextItemSelected = th;
                    valuesVar.openContextMenu(55);
                    i11 = 72;
                    i10 = i;
                }
            }
        } catch (Throwable th25) {
            Throwable cause15 = th25.getCause();
            if (cause15 == null) {
                throw th25;
            }
            throw cause15;
        }
    }

    public static /* synthetic */ long openContextMenu(registerForContextMenu registerforcontextmenu) throws Throwable {
        values valuesVar = new values(registerforcontextmenu);
        byte[] bArr = setContentView;
        byte b = (byte) (bArr[713] - 1);
        int i = unregisterForContextMenu;
        Object[] objArr = new Object[1];
        setContentView(b, (short) (i | 2051), 399, objArr);
        int i2 = 0;
        String str = (String) objArr[0];
        Object[] objArr2 = new Object[1];
        setContentView(bArr[713], (short) (i | 1842), 497, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            Object[] objArr4 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            byte b2 = bArr[31];
            Object[] objArr5 = new Object[1];
            setContentView(b2, (short) (b2 | 2276), (short) (i | 297), objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i3 = 0;
            while (i3 < objArr7.length) {
                try {
                    Object[] objArr8 = {objArr7[i3]};
                    byte[] bArr2 = setContentView;
                    Object[] objArr9 = new Object[1];
                    setContentView(bArr2[1], 2411, 481, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[i2]);
                    byte b3 = bArr2[22];
                    Object[] objArr10 = new Object[1];
                    int i4 = i2;
                    setContentView(b3, (short) (b3 | 845), 491, objArr10);
                    String str3 = (String) objArr10[i4];
                    Object[] objArr11 = new Object[1];
                    setContentView(bArr2[1], 1030, 482, objArr11);
                    Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr11[i4])).invoke(null, objArr8);
                    try {
                        Object[] objArr12 = new Object[1];
                        setContentView(bArr2[1], 2411, 481, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[i4]);
                        Object[] objArr13 = new Object[1];
                        setContentView(bArr2[67], 839, 490, objArr13);
                        iArr[i3] = ((Integer) cls3.getMethod((String) objArr13[i4], null).invoke(objInvoke, null)).intValue();
                        i3++;
                        i2 = i4;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            while (true) {
                int i5 = i2 + 1;
                switch (valuesVar.openContextMenu(iArr[i2])) {
                    case -13:
                        i2 = 1;
                        continue;
                    case -12:
                        i2 = 30;
                        continue;
                    case -11:
                        valuesVar.openContextMenu(18);
                        if (valuesVar.setContentView == 0) {
                            i2 = 29;
                        }
                        break;
                    case -10:
                        i2 = 7;
                        continue;
                    case -9:
                        i2 = 19;
                        continue;
                    case -8:
                        valuesVar.openContextMenu(18);
                        if (valuesVar.setContentView == 0) {
                            i2 = 18;
                        }
                        break;
                    case -7:
                        valuesVar.openContextMenu = 1;
                        valuesVar.openContextMenu(7);
                        valuesVar.openContextMenu(9);
                        decodeByteArray = valuesVar.setContentView;
                        break;
                    case -6:
                        valuesVar.openContextMenu = sync;
                        valuesVar.openContextMenu(4);
                        break;
                    case -5:
                        valuesVar.openContextMenu(101);
                        return valuesVar.unregisterForContextMenu;
                    case -4:
                        i2 = 20;
                        continue;
                    case -3:
                        i2 = 9;
                        continue;
                    case -2:
                        valuesVar.openContextMenu = 1;
                        valuesVar.openContextMenu(7);
                        valuesVar.openContextMenu(8);
                        valuesVar.registerForContextMenu = ((registerForContextMenu) valuesVar.width).registerForContextMenu;
                        valuesVar.openContextMenu(29);
                        break;
                    case -1:
                        i2 = 4;
                        continue;
                }
                i2 = i5;
            }
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }

    public static /* synthetic */ long registerForContextMenu(registerForContextMenu registerforcontextmenu, long j) throws Throwable {
        values valuesVar = new values(registerforcontextmenu, j);
        byte[] bArr = setContentView;
        Object[] objArr = new Object[1];
        setContentView((byte) (bArr[713] - 1), 352, 321, objArr);
        int i = 0;
        String str = (String) objArr[0];
        byte b = bArr[713];
        int i2 = unregisterForContextMenu;
        Object[] objArr2 = new Object[1];
        setContentView(b, (short) (i2 | 1842), 497, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            Object[] objArr4 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            byte b2 = bArr[31];
            Object[] objArr5 = new Object[1];
            setContentView(b2, (short) (b2 | 2276), (short) (i2 | 297), objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i3 = 0;
            while (i3 < objArr7.length) {
                try {
                    Object[] objArr8 = {objArr7[i3]};
                    byte[] bArr2 = setContentView;
                    Object[] objArr9 = new Object[1];
                    int i4 = i;
                    setContentView(bArr2[1], 2411, 481, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[i4]);
                    byte b3 = bArr2[22];
                    Object[] objArr10 = new Object[1];
                    setContentView(b3, (short) (b3 | 845), 491, objArr10);
                    String str3 = (String) objArr10[i4];
                    Object[] objArr11 = new Object[1];
                    setContentView(bArr2[1], 1030, 482, objArr11);
                    Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr11[i4])).invoke(null, objArr8);
                    try {
                        Object[] objArr12 = new Object[1];
                        setContentView(bArr2[1], 2411, 481, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[i4]);
                        Object[] objArr13 = new Object[1];
                        setContentView(bArr2[67], 839, 490, objArr13);
                        iArr[i3] = ((Integer) cls3.getMethod((String) objArr13[i4], null).invoke(objInvoke, null)).intValue();
                        i3++;
                        i = i4;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            int i5 = i;
            int i6 = i5;
            while (true) {
                int i7 = i6 + 1;
                try {
                    switch (valuesVar.openContextMenu(iArr[i6])) {
                        case -21:
                            i6 = 48;
                            break;
                        case -20:
                            valuesVar.openContextMenu(22);
                            int i8 = valuesVar.setContentView;
                            i6 = (i8 == 0 || i8 != 1) ? 1 : 36;
                            break;
                        case -19:
                            i6 = 43;
                            break;
                        case -18:
                            valuesVar.openContextMenu(22);
                            i6 = valuesVar.setContentView != 0 ? 9 : 22;
                            break;
                        case ShareConstants.ERROR_LOAD_PATCH_VERSION_LIB_DIRECTORY_NOT_EXIST /* -17 */:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            Object obj = valuesVar.width;
                            try {
                                byte[] bArr3 = setContentView;
                                Object[] objArr14 = new Object[1];
                                setContentView(bArr3[1], bArr3[9], 482, objArr14);
                                Class<?> cls4 = Class.forName((String) objArr14[i5]);
                                Object[] objArr15 = new Object[1];
                                try {
                                    setContentView(bArr3[76], 1585, 490, objArr15);
                                    try {
                                        valuesVar.openContextMenu = ((Integer) cls4.getMethod((String) objArr15[i5], null).invoke(obj, null)).intValue();
                                        valuesVar.openContextMenu(4);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (i7 >= 23 && i7 <= 27) {
                                            i7 = 21;
                                        } else {
                                            if (i7 < 39 || i7 > 43) {
                                                throw th;
                                            }
                                            i7 = 35;
                                        }
                                        valuesVar.onContextItemSelected = th;
                                        valuesVar.openContextMenu(55);
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    Throwable cause3 = th.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            break;
                        case -16:
                            i6 = 49;
                            break;
                        case -15:
                            i6 = 51;
                            break;
                        case -14:
                            valuesVar.openContextMenu(18);
                            i6 = valuesVar.setContentView == 0 ? 34 : i7;
                            break;
                        case -13:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(9);
                            decodeByteArray = valuesVar.setContentView;
                            break;
                        case -12:
                            valuesVar.openContextMenu = sync;
                            valuesVar.openContextMenu(4);
                            break;
                        case -11:
                            valuesVar.openContextMenu(79);
                            throw ((Throwable) valuesVar.width);
                        case -10:
                            i6 = 44;
                            break;
                        case -9:
                            i6 = 46;
                            break;
                        case -8:
                            valuesVar.openContextMenu(41);
                            if (valuesVar.setContentView == 0) {
                                i6 = 20;
                            }
                            break;
                        case -7:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(9);
                            sync = valuesVar.setContentView;
                            break;
                        case -6:
                            valuesVar.openContextMenu = decodeByteArray;
                            valuesVar.openContextMenu(4);
                            break;
                        case -5:
                            valuesVar.openContextMenu(101);
                            return valuesVar.unregisterForContextMenu;
                        case -4:
                            i6 = 27;
                            break;
                        case -3:
                            i6 = 11;
                            break;
                        case -2:
                            valuesVar.openContextMenu = 2;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            registerForContextMenu registerforcontextmenu2 = (registerForContextMenu) valuesVar.width;
                            valuesVar.openContextMenu(35);
                            registerforcontextmenu2.registerForContextMenu = valuesVar.unregisterForContextMenu;
                            break;
                        case -1:
                            i6 = 5;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        } catch (Throwable th7) {
            Throwable cause4 = th7.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th7;
        }
    }

    public static /* synthetic */ Runnable setContentView(registerForContextMenu registerforcontextmenu) throws Throwable {
        int i;
        int i2;
        values valuesVar = new values(registerforcontextmenu);
        byte[] bArr = setContentView;
        Object[] objArr = new Object[1];
        setContentView((byte) (bArr[713] - 1), 1768, 355, objArr);
        int i3 = 0;
        String str = (String) objArr[0];
        byte b = bArr[713];
        int i4 = unregisterForContextMenu;
        Object[] objArr2 = new Object[1];
        setContentView(b, (short) (i4 | 1842), 497, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            Object[] objArr4 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            byte b2 = bArr[31];
            Object[] objArr5 = new Object[1];
            setContentView(b2, (short) (b2 | 2276), (short) (i4 | 297), objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i5 = 0;
            while (i5 < objArr7.length) {
                try {
                    Object[] objArr8 = {objArr7[i5]};
                    byte[] bArr2 = setContentView;
                    Object[] objArr9 = new Object[1];
                    setContentView(bArr2[1], 2411, 481, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[i3]);
                    byte b3 = bArr2[22];
                    Object[] objArr10 = new Object[1];
                    int i6 = i3;
                    setContentView(b3, (short) (b3 | 845), 491, objArr10);
                    String str3 = (String) objArr10[i6];
                    Object[] objArr11 = new Object[1];
                    setContentView(bArr2[1], 1030, 482, objArr11);
                    Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr11[i6])).invoke(null, objArr8);
                    try {
                        Object[] objArr12 = new Object[1];
                        setContentView(bArr2[1], 2411, 481, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[i6]);
                        Object[] objArr13 = new Object[1];
                        setContentView(bArr2[67], 839, 490, objArr13);
                        iArr[i5] = ((Integer) cls3.getMethod((String) objArr13[i6], null).invoke(objInvoke, null)).intValue();
                        i5++;
                        i3 = i6;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            while (true) {
                int i7 = i3 + 1;
                try {
                    int iOpenContextMenu = valuesVar.openContextMenu(iArr[i3]);
                    i3 = 41;
                    switch (iOpenContextMenu) {
                        case -18:
                            i3 = 38;
                            break;
                        case ShareConstants.ERROR_LOAD_PATCH_VERSION_LIB_DIRECTORY_NOT_EXIST /* -17 */:
                            valuesVar.openContextMenu(22);
                            int i8 = valuesVar.setContentView;
                            i3 = (i8 == 77 || i8 != 93) ? 9 : 22;
                            break;
                        case -16:
                            i3 = 1;
                            break;
                        case -15:
                            i3 = 37;
                            break;
                        case -14:
                            valuesVar.openContextMenu(18);
                            if (valuesVar.setContentView != 0) {
                                i3 = i7;
                            } else {
                                i = 36;
                                i3 = i;
                            }
                            break;
                        case -13:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(9);
                            decodeByteArray = valuesVar.setContentView;
                            i3 = i7;
                            break;
                        case -12:
                            i2 = sync;
                            valuesVar.openContextMenu = i2;
                            valuesVar.openContextMenu(4);
                            i3 = i7;
                            break;
                        case -11:
                            valuesVar.openContextMenu(79);
                            throw ((Throwable) valuesVar.width);
                        case -10:
                            i3 = 39;
                            break;
                        case -9:
                            break;
                        case -8:
                            valuesVar.openContextMenu(41);
                            if (valuesVar.setContentView != 0) {
                                i3 = i7;
                            } else {
                                i = 20;
                                i3 = i;
                            }
                            break;
                        case -7:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(9);
                            sync = valuesVar.setContentView;
                            i3 = i7;
                            break;
                        case -6:
                            i2 = decodeByteArray;
                            valuesVar.openContextMenu = i2;
                            valuesVar.openContextMenu(4);
                            i3 = i7;
                            break;
                        case -5:
                            valuesVar.openContextMenu(79);
                            return (Runnable) valuesVar.width;
                        case -4:
                            i3 = 26;
                            break;
                        case -3:
                            i3 = 11;
                            break;
                        case -2:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            valuesVar.onContextItemSelected = ((registerForContextMenu) valuesVar.width).width;
                            valuesVar.openContextMenu(2);
                            i3 = i7;
                            break;
                        case -1:
                            i3 = 4;
                            break;
                        default:
                            i3 = i7;
                            break;
                    }
                } catch (Throwable th3) {
                    if (i7 < 23 || i7 > 26) {
                        throw th3;
                    }
                    valuesVar.onContextItemSelected = th3;
                    valuesVar.openContextMenu(55);
                    i3 = 21;
                }
            }
        } catch (Throwable th4) {
            Throwable cause3 = th4.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th4;
        }
    }

    public static /* synthetic */ Future unregisterForContextMenu(registerForContextMenu registerforcontextmenu) throws Throwable {
        int i;
        int i2;
        values valuesVar = new values(registerforcontextmenu);
        byte[] bArr = setContentView;
        byte b = (byte) (bArr[713] - 1);
        int i3 = unregisterForContextMenu;
        Object[] objArr = new Object[1];
        setContentView(b, (short) (i3 | 2360), 367, objArr);
        int i4 = 0;
        String str = (String) objArr[0];
        Object[] objArr2 = new Object[1];
        setContentView(bArr[713], (short) (i3 | 1842), 497, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            Object[] objArr4 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            byte b2 = bArr[31];
            Object[] objArr5 = new Object[1];
            setContentView(b2, (short) (b2 | 2276), (short) (i3 | 297), objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i5 = 0;
            while (i5 < objArr7.length) {
                try {
                    Object[] objArr8 = {objArr7[i5]};
                    byte[] bArr2 = setContentView;
                    Object[] objArr9 = new Object[1];
                    setContentView(bArr2[1], 2411, 481, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[i4]);
                    byte b3 = bArr2[22];
                    Object[] objArr10 = new Object[1];
                    int i6 = i4;
                    setContentView(b3, (short) (b3 | 845), 491, objArr10);
                    String str3 = (String) objArr10[i6];
                    Object[] objArr11 = new Object[1];
                    setContentView(bArr2[1], 1030, 482, objArr11);
                    Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr11[i6])).invoke(null, objArr8);
                    try {
                        Object[] objArr12 = new Object[1];
                        setContentView(bArr2[1], 2411, 481, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[i6]);
                        Object[] objArr13 = new Object[1];
                        setContentView(bArr2[67], 839, 490, objArr13);
                        iArr[i5] = ((Integer) cls3.getMethod((String) objArr13[i6], null).invoke(objInvoke, null)).intValue();
                        i5++;
                        i4 = i6;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            while (true) {
                int i7 = i4 + 1;
                try {
                    switch (valuesVar.openContextMenu(iArr[i4])) {
                        case -18:
                            i4 = 34;
                            break;
                        case ShareConstants.ERROR_LOAD_PATCH_VERSION_LIB_DIRECTORY_NOT_EXIST /* -17 */:
                            valuesVar.openContextMenu(22);
                            if (valuesVar.setContentView != 58) {
                                i = 21;
                                i4 = i;
                            } else {
                                i4 = 8;
                            }
                            break;
                        case -16:
                            i4 = 1;
                            break;
                        case -15:
                            i4 = 33;
                            break;
                        case -14:
                            valuesVar.openContextMenu(18);
                            if (valuesVar.setContentView != 0) {
                                i4 = i7;
                            } else {
                                i = 32;
                                i4 = i;
                            }
                            break;
                        case -13:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(9);
                            decodeByteArray = valuesVar.setContentView;
                            i4 = i7;
                            break;
                        case -12:
                            i2 = sync;
                            valuesVar.openContextMenu = i2;
                            valuesVar.openContextMenu(4);
                            i4 = i7;
                            break;
                        case -11:
                            valuesVar.openContextMenu(79);
                            throw ((Throwable) valuesVar.width);
                        case -10:
                            i4 = 35;
                            break;
                        case -9:
                            i4 = 37;
                            break;
                        case -8:
                            valuesVar.openContextMenu(41);
                            if (valuesVar.setContentView != 0) {
                                i4 = i7;
                            } else {
                                i = 19;
                                i4 = i;
                            }
                            break;
                        case -7:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(9);
                            sync = valuesVar.setContentView;
                            i4 = i7;
                            break;
                        case -6:
                            i2 = decodeByteArray;
                            valuesVar.openContextMenu = i2;
                            valuesVar.openContextMenu(4);
                            i4 = i7;
                            break;
                        case -5:
                            valuesVar.openContextMenu(79);
                            return (Future) valuesVar.width;
                        case -4:
                            i4 = 24;
                            break;
                        case -3:
                            i4 = 10;
                            break;
                        case -2:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            valuesVar.onContextItemSelected = ((registerForContextMenu) valuesVar.width).onOptionsItemSelected;
                            valuesVar.openContextMenu(2);
                            i4 = i7;
                            break;
                        case -1:
                            i4 = 4;
                            break;
                        default:
                            i4 = i7;
                            break;
                    }
                } catch (Throwable th3) {
                    if (i7 < 22 || i7 > 24) {
                        throw th3;
                    }
                    valuesVar.onContextItemSelected = th3;
                    valuesVar.openContextMenu(55);
                    i4 = 20;
                }
            }
        } catch (Throwable th4) {
            Throwable cause3 = th4.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th4;
        }
    }

    @Override // com.clevertap.android.sdk.interfaces.NotificationRenderedListener
    public void onNotificationRendered(boolean z) throws Throwable {
        int edgeSlop;
        Object objInvoke;
        values valuesVar = new values((Object) this, z ? 1 : 0);
        byte[] bArr = setContentView;
        Object[] objArr = new Object[1];
        setContentView((byte) (bArr[713] - 1), 154, 373, objArr);
        int i = 0;
        String str = (String) objArr[0];
        byte b = bArr[713];
        int i2 = unregisterForContextMenu;
        Object[] objArr2 = new Object[1];
        setContentView(b, (short) (i2 | 1842), 497, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            Object[] objArr4 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            byte b2 = bArr[31];
            Object[] objArr5 = new Object[1];
            setContentView(b2, (short) (b2 | 2276), (short) (i2 | 297), objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i3 = 0;
            while (i3 < objArr7.length) {
                try {
                    Object[] objArr8 = {objArr7[i3]};
                    byte[] bArr2 = setContentView;
                    Object[] objArr9 = new Object[1];
                    int i4 = i;
                    setContentView(bArr2[1], 2411, 481, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[i4]);
                    byte b3 = bArr2[22];
                    Object[] objArr10 = new Object[1];
                    setContentView(b3, (short) (b3 | 845), 491, objArr10);
                    String str3 = (String) objArr10[i4];
                    Object[] objArr11 = new Object[1];
                    setContentView(bArr2[1], 1030, 482, objArr11);
                    Object objInvoke2 = cls2.getMethod(str3, Class.forName((String) objArr11[i4])).invoke(null, objArr8);
                    try {
                        Object[] objArr12 = new Object[1];
                        setContentView(bArr2[1], 2411, 481, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[i4]);
                        Object[] objArr13 = new Object[1];
                        setContentView(bArr2[67], 839, 490, objArr13);
                        iArr[i3] = ((Integer) cls3.getMethod((String) objArr13[i4], null).invoke(objInvoke2, null)).intValue();
                        i3++;
                        i = i4;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i5 = i;
            int i6 = i5;
            while (true) {
                int i7 = i6 + 1;
                switch (valuesVar.openContextMenu(iArr[i6])) {
                    case -16:
                        i6 = 36;
                        break;
                    case -15:
                        valuesVar.openContextMenu(22);
                        int i8 = valuesVar.setContentView;
                        i6 = (i8 == 5 || i8 != 44) ? 27 : 1;
                        break;
                    case -14:
                        i6 = 37;
                        break;
                    case -13:
                        i6 = 39;
                        break;
                    case -12:
                        valuesVar.openContextMenu(18);
                        i6 = valuesVar.setContentView == 0 ? 26 : i7;
                        break;
                    case -11:
                        valuesVar.openContextMenu = 1;
                        valuesVar.openContextMenu(7);
                        valuesVar.openContextMenu(9);
                        decodeByteArray = valuesVar.setContentView;
                        break;
                    case -10:
                        edgeSlop = sync;
                        valuesVar.openContextMenu = edgeSlop;
                        valuesVar.openContextMenu(4);
                        break;
                    case -9:
                        return;
                    case -8:
                        i6 = 17;
                        break;
                    case -7:
                        i6 = 15;
                        break;
                    case -6:
                        valuesVar.openContextMenu = 2;
                        valuesVar.openContextMenu(7);
                        valuesVar.openContextMenu(8);
                        registerForContextMenu registerforcontextmenu = (registerForContextMenu) valuesVar.width;
                        valuesVar.openContextMenu(8);
                        registerforcontextmenu.onOptionsItemSelected((String) valuesVar.width);
                        break;
                    case -5:
                        valuesVar.openContextMenu = 1;
                        valuesVar.openContextMenu(7);
                        valuesVar.openContextMenu(8);
                        Object obj = valuesVar.width;
                        try {
                            byte[] bArr3 = setContentView;
                            Object[] objArr14 = new Object[1];
                            setContentView(bArr3[1], 1030, 482, objArr14);
                            Class<?> cls4 = Class.forName((String) objArr14[i5]);
                            Object[] objArr15 = new Object[1];
                            setContentView(bArr3[67], 850, (short) (unregisterForContextMenu | 296), objArr15);
                            objInvoke = cls4.getMethod((String) objArr15[i5], null).invoke(obj, null);
                            valuesVar.onContextItemSelected = objInvoke;
                            valuesVar.openContextMenu(2);
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                        break;
                    case -4:
                        valuesVar.openContextMenu = 2;
                        valuesVar.openContextMenu(7);
                        valuesVar.openContextMenu(8);
                        String str4 = (String) valuesVar.width;
                        valuesVar.openContextMenu(9);
                        Object[] objArr16 = new Object[1];
                        registerForContextMenu(str4, valuesVar.setContentView, objArr16);
                        objInvoke = (String) objArr16[i5];
                        valuesVar.onContextItemSelected = objInvoke;
                        valuesVar.openContextMenu(2);
                        break;
                    case -3:
                        edgeSlop = ViewConfiguration.getEdgeSlop();
                        valuesVar.openContextMenu = edgeSlop;
                        valuesVar.openContextMenu(4);
                        break;
                    case -2:
                        objInvoke = "\uead9폞➵ݾХ奁銱犂ꔽ帋Х奁\uead9폞Ϝ橂僎擔\ue82c﮾㶏㗳";
                        valuesVar.onContextItemSelected = objInvoke;
                        valuesVar.openContextMenu(2);
                        break;
                    case -1:
                        i6 = 12;
                        break;
                    default:
                        break;
                }
            }
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:232:0x088d A[PHI: r10 r21
      0x088d: PHI (r10v67 int) = 
      (r10v7 int)
      (r10v10 int)
      (r10v12 int)
      (r10v15 int)
      (r10v18 int)
      (r10v19 int)
      (r10v25 int)
      (r10v31 int)
      (r10v34 int)
      (r10v42 int)
      (r10v45 int)
      (r10v68 int)
     binds: [B:257:0x0912, B:250:0x08e9, B:245:0x08d0, B:240:0x08b5, B:235:0x089a, B:231:0x087c, B:230:0x0870, B:212:0x0827, B:169:0x068a, B:156:0x05ba, B:133:0x053a, B:26:0x0159] A[DONT_GENERATE, DONT_INLINE]
      0x088d: PHI (r21v53 char) = 
      (r21v7 char)
      (r21v10 char)
      (r21v13 char)
      (r21v16 char)
      (r21v19 char)
      (r21v20 char)
      (r21v32 char)
      (r21v36 char)
      (r21v41 char)
      (r21v44 char)
      (r21v47 char)
      (r21v54 char)
     binds: [B:257:0x0912, B:250:0x08e9, B:245:0x08d0, B:240:0x08b5, B:235:0x089a, B:231:0x087c, B:230:0x0870, B:212:0x0827, B:169:0x068a, B:156:0x05ba, B:133:0x053a, B:26:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:284:0x098c  */
    /* JADX WARN: Code duplicated, block: B:288:0x0994  */
    /* JADX WARN: Code duplicated, block: B:290:0x0998  */
    /* JADX WARN: Code duplicated, block: B:407:0x09ad A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x01d0  */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        char c;
        int i;
        int i2;
        char c2;
        Object[] objArr;
        int i3;
        int i4;
        char c3;
        values valuesVar = new values(this, context, intent);
        byte[] bArr = setContentView;
        byte b = (byte) (bArr[713] - 1);
        int i5 = unregisterForContextMenu;
        int i6 = 22;
        Object[] objArr2 = new Object[1];
        setContentView(b, (short) (i5 | 1331), bArr[22], objArr2);
        int i7 = 0;
        String str = (String) objArr2[0];
        Object[] objArr3 = new Object[1];
        setContentView(bArr[713], (short) (i5 | 1842), 497, objArr3);
        try {
            Object[] objArr4 = {(String) objArr3[0]};
            Object[] objArr5 = new Object[1];
            int i8 = 482;
            setContentView(bArr[1], 1030, 482, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            char c4 = 31;
            byte b2 = bArr[31];
            Object[] objArr6 = new Object[1];
            setContentView(b2, (short) (b2 | 2276), (short) (i5 | 297), objArr6);
            String str2 = (String) objArr6[0];
            Object[] objArr7 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr7);
            Object[] objArr8 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr7[0])).invoke(str, objArr4);
            int[] iArr = new int[objArr8.length];
            int i9 = 0;
            while (true) {
                c = 491;
                if (i9 >= objArr8.length) {
                    break;
                }
                try {
                    Object[] objArr9 = {objArr8[i9]};
                    byte[] bArr2 = setContentView;
                    char c5 = c4;
                    Object[] objArr10 = new Object[1];
                    int i10 = i6;
                    setContentView(bArr2[1], 2411, 481, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[i7]);
                    byte b3 = bArr2[i10];
                    int i11 = i7;
                    Object[] objArr11 = new Object[1];
                    setContentView(b3, (short) (b3 | 845), 491, objArr11);
                    String str3 = (String) objArr11[i11];
                    Object[] objArr12 = new Object[1];
                    setContentView(bArr2[1], 1030, 482, objArr12);
                    Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr12[i11])).invoke(null, objArr9);
                    try {
                        Object[] objArr13 = new Object[1];
                        setContentView(bArr2[1], 2411, 481, objArr13);
                        Class<?> cls3 = Class.forName((String) objArr13[i11]);
                        Object[] objArr14 = new Object[1];
                        setContentView(bArr2[67], 839, 490, objArr14);
                        iArr[i9] = ((Integer) cls3.getMethod((String) objArr14[i11], null).invoke(objInvoke, null)).intValue();
                        i9++;
                        c4 = c5;
                        i6 = i10;
                        i7 = i11;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i12 = i7;
            int i13 = i6;
            char c6 = c4;
            int i14 = i12;
            while (true) {
                int i15 = i14 + 1;
                try {
                    int iOpenContextMenu = valuesVar.openContextMenu(iArr[i14]);
                    Class cls4 = Long.TYPE;
                    i2 = 35;
                    switch (iOpenContextMenu) {
                        case -59:
                            c2 = 491;
                            i14 = CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA;
                            c = c2;
                            i12 = 0;
                            break;
                        case -58:
                            i = i13;
                            i2 = i8;
                            c2 = 491;
                            try {
                                valuesVar.openContextMenu(i);
                                int i16 = valuesVar.setContentView;
                                i14 = (i16 == 0 || i16 != 1) ? 92 : 78;
                                i13 = i;
                                i8 = i2;
                                c = c2;
                                i12 = 0;
                            } catch (Throwable th3) {
                                th = th3;
                                byte b4 = setContentView[1];
                                int i17 = unregisterForContextMenu;
                                objArr = new Object[1];
                                setContentView(b4, (short) (i17 | 1842), (short) (i17 | 283), objArr);
                                i12 = 0;
                                if (!Class.forName((String) objArr[0]).isInstance(th)) {
                                    if (i15 >= 130) {
                                    }
                                    throw th;
                                }
                                if (i15 >= 130) {
                                }
                                throw th;
                                valuesVar.onContextItemSelected = th;
                                valuesVar.openContextMenu(55);
                                i14 = i3;
                                i13 = i;
                                i8 = i2;
                                c = c2;
                            }
                            break;
                        case -57:
                            c2 = 491;
                            c = 491;
                            i13 = 22;
                            i14 = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA;
                            i12 = 0;
                            break;
                        case -56:
                            i2 = i8;
                            c2 = 491;
                            try {
                                valuesVar.openContextMenu(i13);
                                i14 = valuesVar.setContentView != 80 ? MMConstants.ERR_WATERMARK_READ : 8;
                                i8 = i2;
                                c = 491;
                                i13 = 22;
                                i12 = 0;
                            } catch (Throwable th4) {
                                th = th4;
                                i = 22;
                                byte b5 = setContentView[1];
                                int i18 = unregisterForContextMenu;
                                objArr = new Object[1];
                                setContentView(b5, (short) (i18 | 1842), (short) (i18 | 283), objArr);
                                i12 = 0;
                                if (!Class.forName((String) objArr[0]).isInstance(th)) {
                                    if (i15 >= 130) {
                                    }
                                    throw th;
                                }
                                if (i15 >= 130) {
                                }
                                throw th;
                                valuesVar.onContextItemSelected = th;
                                valuesVar.openContextMenu(55);
                                i14 = i3;
                                i13 = i;
                                i8 = i2;
                                c = c2;
                            }
                            break;
                        case -55:
                            i2 = i8;
                            c2 = 491;
                            valuesVar.openContextMenu(56);
                            if (valuesVar.setContentView == 0) {
                                i14 = CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA;
                            } else {
                                i14 = i15;
                            }
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case -54:
                            valuesVar.openContextMenu(79);
                            throw ((Throwable) valuesVar.width);
                        case -53:
                            c2 = 491;
                            i14 = CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA;
                            c = c2;
                            i12 = 0;
                            break;
                        case -52:
                            c2 = 491;
                            i14 = CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA;
                            c = c2;
                            i12 = 0;
                            break;
                        case -51:
                            i2 = i8;
                            c2 = 491;
                            valuesVar.openContextMenu(18);
                            if (valuesVar.setContentView == 0) {
                                i14 = 127;
                            } else {
                                i14 = i15;
                            }
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case -50:
                            c2 = 491;
                            i14 = 1;
                            c = c2;
                            i12 = 0;
                            break;
                        case -49:
                            c2 = 491;
                            i14 = 117;
                            c = c2;
                            i12 = 0;
                            break;
                        case -48:
                            i2 = i8;
                            c2 = 491;
                            valuesVar.openContextMenu(18);
                            if (valuesVar.setContentView == 0) {
                                i14 = 116;
                            } else {
                                i14 = i15;
                            }
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case -47:
                            c2 = 491;
                            i14 = 82;
                            c = c2;
                            i12 = 0;
                            break;
                        case -46:
                            c2 = 491;
                            i14 = 104;
                            c = c2;
                            i12 = 0;
                            break;
                        case -45:
                            i2 = i8;
                            c2 = 491;
                            valuesVar.openContextMenu(18);
                            if (valuesVar.setContentView == 0) {
                                i14 = 103;
                            } else {
                                i14 = i15;
                            }
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case -44:
                            c2 = 491;
                            i14 = CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA;
                            c = c2;
                            i12 = 0;
                            break;
                        case -43:
                            c2 = 491;
                            i14 = 144;
                            c = c2;
                            i12 = 0;
                            break;
                        case -42:
                            i2 = i8;
                            c2 = 491;
                            valuesVar.openContextMenu(18);
                            if (valuesVar.setContentView == 0) {
                                i14 = 91;
                            } else {
                                i14 = i15;
                            }
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case -41:
                            i2 = i8;
                            c2 = 491;
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(9);
                            decodeByteArray = valuesVar.setContentView;
                            i14 = i15;
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case -40:
                            try {
                                i2 = i8;
                                c2 = 491;
                                valuesVar.openContextMenu = sync;
                                valuesVar.openContextMenu(4);
                                i14 = i15;
                                i8 = i2;
                                c = c2;
                                i12 = 0;
                            } catch (Throwable th5) {
                                th = th5;
                                i = i13;
                                byte b6 = setContentView[1];
                                int i19 = unregisterForContextMenu;
                                objArr = new Object[1];
                                setContentView(b6, (short) (i19 | 1842), (short) (i19 | 283), objArr);
                                i12 = 0;
                                if (!Class.forName((String) objArr[0]).isInstance(th)) {
                                    if (i15 >= 130) {
                                    }
                                    throw th;
                                }
                                if (i15 >= 130) {
                                }
                                throw th;
                                valuesVar.onContextItemSelected = th;
                                valuesVar.openContextMenu(55);
                                i14 = i3;
                                i13 = i;
                                i8 = i2;
                                c = c2;
                            }
                            break;
                        case -39:
                            c2 = 491;
                            i14 = 105;
                            c = c2;
                            i12 = 0;
                            break;
                        case -38:
                            return;
                        case -37:
                            c2 = 491;
                            try {
                                valuesVar.openContextMenu = 1;
                                valuesVar.openContextMenu(7);
                                valuesVar.openContextMenu(8);
                                Object obj = valuesVar.width;
                                try {
                                    byte[] bArr3 = setContentView;
                                    Object[] objArr15 = new Object[1];
                                    i2 = 482;
                                    try {
                                        setContentView(bArr3[1], (short) (unregisterForContextMenu | 2066), 482, objArr15);
                                        Class<?> cls5 = Class.forName((String) objArr15[0]);
                                        Object[] objArr16 = new Object[1];
                                        setContentView(bArr3[c6], UnixStat.DEFAULT_FILE_PERM, UnixStat.DEFAULT_DIR_PERM, objArr16);
                                        cls5.getMethod((String) objArr16[0], null).invoke(obj, null);
                                        i14 = i15;
                                        i8 = i2;
                                        c = c2;
                                        i12 = 0;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        Throwable cause3 = th.getCause();
                                        if (cause3 == null) {
                                            throw th;
                                        }
                                        throw cause3;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                i2 = 482;
                                i = i13;
                                byte b7 = setContentView[1];
                                int i110 = unregisterForContextMenu;
                                objArr = new Object[1];
                                setContentView(b7, (short) (i110 | 1842), (short) (i110 | 283), objArr);
                                i12 = 0;
                                if (!Class.forName((String) objArr[0]).isInstance(th) && i15 >= 43 && i15 <= 55) {
                                    i3 = 55;
                                } else {
                                    if (i15 >= 130 || i15 > 136) {
                                        throw th;
                                    }
                                    i3 = 128;
                                }
                                valuesVar.onContextItemSelected = th;
                                valuesVar.openContextMenu(55);
                                i14 = i3;
                                i13 = i;
                                i8 = i2;
                                c = c2;
                            }
                            break;
                        case -36:
                            c2 = 491;
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            try {
                                Object[] objArr17 = {valuesVar.width};
                                byte[] bArr4 = setContentView;
                                Object[] objArr18 = new Object[1];
                                setContentView(bArr4[1], (short) (unregisterForContextMenu | 2066), 482, objArr18);
                                Class<?> cls6 = Class.forName((String) objArr18[0]);
                                Object[] objArr19 = new Object[1];
                                setContentView(bArr4[1], 2395, 480, objArr19);
                                valuesVar.onContextItemSelected = cls6.getDeclaredConstructor(Class.forName((String) objArr19[0])).newInstance(objArr17);
                                valuesVar.openContextMenu(2);
                                i2 = 482;
                                i14 = i15;
                                i8 = i2;
                                c = c2;
                                i12 = 0;
                            } catch (Throwable th9) {
                                Throwable cause4 = th9.getCause();
                                if (cause4 == null) {
                                    throw th9;
                                }
                                throw cause4;
                            }
                            break;
                        case -35:
                            c2 = 491;
                            valuesVar.openContextMenu = 4;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            registerForContextMenu registerforcontextmenu = (registerForContextMenu) valuesVar.width;
                            valuesVar.openContextMenu(8);
                            final Runnable runnable = (Runnable) valuesVar.width;
                            valuesVar.openContextMenu(35);
                            final long j = valuesVar.unregisterForContextMenu;
                            valuesVar.openContextMenu(8);
                            final Bundle bundle = (Bundle) valuesVar.width;
                            valuesVar.onContextItemSelected = new Runnable() { // from class: com.clevertap.android.pushsdk.registerForContextMenu.4
                                private static int Movie = 0;
                                private static int onOptionsItemSelected = 64;
                                private static int valueOf = 1;

                                private static void openContextMenu(int i20, String str4, int i21, int i22, boolean z, Object[] objArr20) {
                                    String str5;
                                    Object charArray = str4;
                                    if (str4 != null) {
                                        charArray = str4.toCharArray();
                                    }
                                    char[] cArr = (char[]) charArray;
                                    synchronized (valueOf.unregisterForContextMenu) {
                                        try {
                                            char[] cArr2 = new char[i21];
                                            valueOf.registerForContextMenu = 0;
                                            while (true) {
                                                int i23 = valueOf.registerForContextMenu;
                                                if (i23 >= i21) {
                                                    break;
                                                }
                                                valueOf.setContentView = cArr[i23];
                                                cArr2[valueOf.registerForContextMenu] = (char) (valueOf.setContentView + i22);
                                                int i24 = valueOf.registerForContextMenu;
                                                cArr2[i24] = (char) (cArr2[i24] - onOptionsItemSelected);
                                                valueOf.registerForContextMenu = i24 + 1;
                                            }
                                            if (i20 > 0) {
                                                valueOf.openContextMenu = i20;
                                                char[] cArr3 = new char[i21];
                                                System.arraycopy(cArr2, 0, cArr3, 0, i21);
                                                int i25 = valueOf.openContextMenu;
                                                System.arraycopy(cArr3, 0, cArr2, i21 - i25, i25);
                                                int i26 = valueOf.openContextMenu;
                                                System.arraycopy(cArr3, i26, cArr2, 0, i21 - i26);
                                            }
                                            if (z) {
                                                char[] cArr4 = new char[i21];
                                                valueOf.registerForContextMenu = 0;
                                                while (true) {
                                                    int i27 = valueOf.registerForContextMenu;
                                                    if (i27 >= i21) {
                                                        break;
                                                    }
                                                    cArr4[i27] = cArr2[(i21 - i27) - 1];
                                                    valueOf.registerForContextMenu = i27 + 1;
                                                }
                                                cArr2 = cArr4;
                                            }
                                            str5 = new String(cArr2);
                                        } catch (Throwable th10) {
                                            throw th10;
                                        }
                                    }
                                    objArr20[0] = str5;
                                }

                                @Override // java.lang.Runnable
                                public void run() throws Throwable {
                                    Throwable th10;
                                    ExecutorService executorServiceNewSingleThreadExecutor;
                                    Movie = (valueOf + 29) % 128;
                                    ExecutorService executorService = null;
                                    future = null;
                                    Future<?> future = null;
                                    try {
                                        executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                                        try {
                                            try {
                                                Future<?> futureSubmit = executorServiceNewSingleThreadExecutor.submit(runnable);
                                                try {
                                                    long j2 = j;
                                                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                                                    futureSubmit.get(j2, timeUnit);
                                                    if (registerForContextMenu.unregisterForContextMenu(registerForContextMenu.this) == null) {
                                                        try {
                                                            executorServiceNewSingleThreadExecutor.shutdown();
                                                            return;
                                                        } catch (Exception e) {
                                                            e.printStackTrace();
                                                            return;
                                                        }
                                                    }
                                                    long jOpenContextMenu = j - (registerForContextMenu.openContextMenu(registerForContextMenu.this) - registerForContextMenu.onOptionsItemSelected(registerForContextMenu.this));
                                                    if (jOpenContextMenu <= 0) {
                                                        int i20 = valueOf + 101;
                                                        Movie = i20 % 128;
                                                        int i21 = i20 % 2;
                                                        registerForContextMenu registerforcontextmenu2 = registerForContextMenu.this;
                                                        if (i21 != 0) {
                                                            registerForContextMenu.setContentView(registerforcontextmenu2).run();
                                                            throw null;
                                                        }
                                                        registerForContextMenu.setContentView(registerforcontextmenu2).run();
                                                    } else {
                                                        registerForContextMenu.unregisterForContextMenu(registerForContextMenu.this).get(jOpenContextMenu, timeUnit);
                                                        Bundle bundle2 = bundle;
                                                        Object[] objArr20 = new Object[1];
                                                        openContextMenu((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2, "\u0006\uffff�\ufff7\b", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6, 171 - ((byte) KeyEvent.getModifierMetaStateMask()), false, objArr20);
                                                        String strIntern = ((String) objArr20[0]).intern();
                                                        Object[] objArr21 = new Object[1];
                                                        openContextMenu((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1, "\ufff9\ufffe�\u000b\u0004", View.combineMeasuredStates(0, 0) + 5, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 167, true, objArr21);
                                                        if (Boolean.parseBoolean(bundle2.getString(strIntern, ((String) objArr21[0]).intern()))) {
                                                            int i22 = Movie + 95;
                                                            valueOf = i22 % 128;
                                                            int i23 = i22 % 2;
                                                            registerForContextMenu registerforcontextmenu3 = registerForContextMenu.this;
                                                            if (i23 == 0) {
                                                                registerForContextMenu.setContentView(registerforcontextmenu3).run();
                                                                throw null;
                                                            }
                                                            registerForContextMenu.setContentView(registerforcontextmenu3).run();
                                                        }
                                                    }
                                                    try {
                                                        executorServiceNewSingleThreadExecutor.shutdown();
                                                        valueOf = (Movie + 15) % 128;
                                                    } catch (Exception e2) {
                                                        e2.printStackTrace();
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    future = futureSubmit;
                                                    e.printStackTrace();
                                                    registerForContextMenu.setContentView(registerForContextMenu.this).run();
                                                    if (future != null && !future.isCancelled()) {
                                                        Object[] objArr22 = new Object[1];
                                                        openContextMenu(TextUtils.indexOf("", "") + 4, "\ufff6\u0007\u0005\u0000", 4 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 141 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), false, objArr22);
                                                        String strIntern2 = ((String) objArr22[0]).intern();
                                                        Object[] objArr23 = new Object[1];
                                                        openContextMenu(View.resolveSizeAndState(0, 0, 0) + 28, "\ufffe\u0000\u0007\u0007\u0004\t\u0002ﾻ\r\u0000\t\uffff\u0000\r￫\u0010\u000e\u0003\uffef￼\u000e\u0006￭\u0000\u000e\u0010\u0007\u000f\uffde￼\t", 31 - View.getDefaultSize(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 165, false, objArr23);
                                                        Logger.m5866d(strIntern2, ((String) objArr23[0]).intern());
                                                        future.cancel(true);
                                                    }
                                                    if (registerForContextMenu.unregisterForContextMenu(registerForContextMenu.this) != null && !registerForContextMenu.unregisterForContextMenu(registerForContextMenu.this).isCancelled()) {
                                                        Object[] objArr24 = new Object[1];
                                                        openContextMenu(3 - TextUtils.lastIndexOf("", '0'), "\ufff6\u0007\u0005\u0000", 4 - (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.keyCodeFromString("") + CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, false, objArr24);
                                                        String strIntern3 = ((String) objArr24[0]).intern();
                                                        Object[] objArr25 = new Object[1];
                                                        openContextMenu(15 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u0002\u0004\u000b\u000b\b\r\u0006\uffbf\u0005\u0014\u0013\u0014\u0011\u0004\uffd1￢\u0000\r", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, 161 - (ViewConfiguration.getScrollBarSize() >> 8), false, objArr25);
                                                        Logger.m5866d(strIntern3, ((String) objArr25[0]).intern());
                                                        registerForContextMenu.unregisterForContextMenu(registerForContextMenu.this).cancel(true);
                                                    }
                                                    if (executorServiceNewSingleThreadExecutor != null) {
                                                        try {
                                                            executorServiceNewSingleThreadExecutor.shutdown();
                                                        } catch (Exception e4) {
                                                            e4.printStackTrace();
                                                        }
                                                    }
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                            }
                                        } catch (Throwable th11) {
                                            th10 = th11;
                                            executorService = executorServiceNewSingleThreadExecutor;
                                            if (executorService == null) {
                                                throw th10;
                                            }
                                            try {
                                                executorService.shutdown();
                                                throw th10;
                                            } catch (Exception e6) {
                                                e6.printStackTrace();
                                                throw th10;
                                            }
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                        executorServiceNewSingleThreadExecutor = null;
                                    } catch (Throwable th12) {
                                        th10 = th12;
                                    }
                                }
                            };
                            valuesVar.openContextMenu(2);
                            i2 = 482;
                            i14 = i15;
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case -34:
                            c2 = 491;
                            valuesVar.openContextMenu = 5;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            registerForContextMenu registerforcontextmenu2 = (registerForContextMenu) valuesVar.width;
                            valuesVar.openContextMenu(8);
                            final Intent intent2 = (Intent) valuesVar.width;
                            valuesVar.openContextMenu(8);
                            final Bundle bundle2 = (Bundle) valuesVar.width;
                            valuesVar.openContextMenu(8);
                            final RemoteMessage remoteMessage = (RemoteMessage) valuesVar.width;
                            valuesVar.openContextMenu(8);
                            final Context context2 = (Context) valuesVar.width;
                            valuesVar.onContextItemSelected = new Runnable() { // from class: com.clevertap.android.pushsdk.registerForContextMenu.1
                                private static int decodeByteArray = 1;
                                private static int isOpaque;
                                private static char[] values = {13780, 13748, 13811, 13774, 13788, 13804, 13807, 13821, 13822, 13817, 13816, 13781, 13785, 13795, 13810, 13770, 13819, 13815, 13806, 13814, 13809, 13794, 13783, 13801, 13800, 13782, 13813, 13754, 13812, 13786, 13823, 13787, 13802, 13784, 13768, 13820};
                                private static char valueOf = 6;
                                private static char Movie = 23075;
                                private static char width = 49995;
                                private static char height = 20353;
                                private static char onContextItemSelected = 5600;

                                private static void onOptionsItemSelected(String str4, int i20, Object[] objArr20) {
                                    String str5;
                                    Object charArray = str4;
                                    if (str4 != null) {
                                        charArray = str4.toCharArray();
                                    }
                                    char[] cArr = (char[]) charArray;
                                    synchronized (decodeByteArray.setContentView) {
                                        try {
                                            char[] cArr2 = new char[cArr.length];
                                            decodeByteArray.registerForContextMenu = 0;
                                            char[] cArr3 = new char[2];
                                            while (true) {
                                                int i21 = decodeByteArray.registerForContextMenu;
                                                if (i21 < cArr.length) {
                                                    cArr3[0] = cArr[i21];
                                                    cArr3[1] = cArr[i21 + 1];
                                                    int i22 = 58224;
                                                    for (int i23 = 0; i23 < 16; i23++) {
                                                        char c7 = cArr3[1];
                                                        char c8 = cArr3[0];
                                                        char c9 = (char) (c7 - (((c8 + i22) ^ ((c8 << 4) + width)) ^ ((c8 >>> 5) + height)));
                                                        cArr3[1] = c9;
                                                        cArr3[0] = (char) (c8 - (((c9 >>> 5) + Movie) ^ ((c9 + i22) ^ ((c9 << 4) + onContextItemSelected))));
                                                        i22 -= 40503;
                                                    }
                                                    int i24 = decodeByteArray.registerForContextMenu;
                                                    cArr2[i24] = cArr3[0];
                                                    cArr2[i24 + 1] = cArr3[1];
                                                    decodeByteArray.registerForContextMenu = i24 + 2;
                                                } else {
                                                    str5 = new String(cArr2, 0, i20);
                                                }
                                            }
                                        } catch (Throwable th10) {
                                            throw th10;
                                        }
                                    }
                                    objArr20[0] = str5;
                                }

                                private static void setContentView(byte b8, int i20, String str4, Object[] objArr20) {
                                    int i21;
                                    String str5;
                                    Object charArray = str4;
                                    if (str4 != null) {
                                        charArray = str4.toCharArray();
                                    }
                                    char[] cArr = (char[]) charArray;
                                    synchronized (height.Movie) {
                                        try {
                                            char[] cArr2 = values;
                                            char c7 = valueOf;
                                            char[] cArr3 = new char[i20];
                                            if (i20 % 2 != 0) {
                                                i21 = i20 - 1;
                                                cArr3[i21] = (char) (cArr[i21] - b8);
                                            } else {
                                                i21 = i20;
                                            }
                                            if (i21 > 1) {
                                                height.onOptionsItemSelected = 0;
                                                while (true) {
                                                    int i22 = height.onOptionsItemSelected;
                                                    if (i22 >= i21) {
                                                        break;
                                                    }
                                                    height.unregisterForContextMenu = cArr[i22];
                                                    height.registerForContextMenu = cArr[height.onOptionsItemSelected + 1];
                                                    if (height.unregisterForContextMenu == height.registerForContextMenu) {
                                                        cArr3[height.onOptionsItemSelected] = (char) (height.unregisterForContextMenu - b8);
                                                        cArr3[height.onOptionsItemSelected + 1] = (char) (height.registerForContextMenu - b8);
                                                    } else {
                                                        height.setContentView = height.unregisterForContextMenu / c7;
                                                        height.onContextItemSelected = height.unregisterForContextMenu % c7;
                                                        height.openContextMenu = height.registerForContextMenu / c7;
                                                        height.valueOf = height.registerForContextMenu % c7;
                                                        if (height.onContextItemSelected == height.valueOf) {
                                                            height.setContentView = ((height.setContentView + c7) - 1) % c7;
                                                            height.openContextMenu = ((height.openContextMenu + c7) - 1) % c7;
                                                            int i23 = (height.setContentView * c7) + height.onContextItemSelected;
                                                            int i24 = (height.openContextMenu * c7) + height.valueOf;
                                                            int i25 = height.onOptionsItemSelected;
                                                            cArr3[i25] = cArr2[i23];
                                                            cArr3[i25 + 1] = cArr2[i24];
                                                        } else if (height.setContentView == height.openContextMenu) {
                                                            height.onContextItemSelected = ((height.onContextItemSelected + c7) - 1) % c7;
                                                            height.valueOf = ((height.valueOf + c7) - 1) % c7;
                                                            int i26 = (height.setContentView * c7) + height.onContextItemSelected;
                                                            int i27 = (height.openContextMenu * c7) + height.valueOf;
                                                            int i28 = height.onOptionsItemSelected;
                                                            cArr3[i28] = cArr2[i26];
                                                            cArr3[i28 + 1] = cArr2[i27];
                                                        } else {
                                                            int i29 = (height.setContentView * c7) + height.valueOf;
                                                            int i30 = (height.openContextMenu * c7) + height.onContextItemSelected;
                                                            int i31 = height.onOptionsItemSelected;
                                                            cArr3[i31] = cArr2[i29];
                                                            cArr3[i31 + 1] = cArr2[i30];
                                                        }
                                                    }
                                                    height.onOptionsItemSelected += 2;
                                                }
                                            }
                                            for (int i32 = 0; i32 < i20; i32++) {
                                                cArr3[i32] = (char) (cArr3[i32] ^ 13722);
                                            }
                                            str5 = new String(cArr3);
                                        } catch (Throwable th10) {
                                            throw th10;
                                        }
                                    }
                                    objArr20[0] = str5;
                                }

                                @Override // java.lang.Runnable
                                public void run() throws Throwable {
                                    Object[] objArr20 = new Object[1];
                                    setContentView((byte) (53 - TextUtils.lastIndexOf("", '0')), 4 - ExpandableListView.getPackedPositionGroup(0L), "\u000f\u0000\u0004\u001c", objArr20);
                                    String strIntern = ((String) objArr20[0]).intern();
                                    StringBuilder sb = new StringBuilder();
                                    Object[] objArr21 = new Object[1];
                                    onOptionsItemSelected("锣㈴夝톒Ⴤ䨈硍\uaac4\ue1a0皜坶請䒱ख़\uf742ꦴ瓲安嬜讀鶶貘쉆\uab6d붂䍒\ue7ab⬟炪ꭣ", View.getDefaultSize(0, 0) + 30, objArr21);
                                    sb.append(((String) objArr21[0]).intern());
                                    sb.append(width.openContextMenu(intent2.getExtras()));
                                    Logger.m5874v(strIntern, sb.toString());
                                    if (CleverTapAPI.getNotificationInfo(bundle2).fromCleverTap) {
                                        decodeByteArray = (isOpaque + 65) % 128;
                                        try {
                                            if (Utils.isRenderFallback(remoteMessage, context2)) {
                                                try {
                                                    INotificationRenderer iNotificationRenderer = (INotificationRenderer) ((Class) unregisterForContextMenu.setContentView(View.MeasureSpec.getMode(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 50, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getDeclaredConstructor(null).newInstance(null);
                                                    CleverTapAPI globalInstance = CleverTapAPI.getGlobalInstance(context2, PushNotificationUtil.getAccountIdFromNotificationBundle(bundle2));
                                                    if (Thread.currentThread().isInterrupted()) {
                                                        return;
                                                    }
                                                    Objects.requireNonNull(globalInstance);
                                                    globalInstance.setNotificationRenderedListener(registerForContextMenu.this);
                                                    Object[] objArr22 = new Object[1];
                                                    onOptionsItemSelected("慎\udc46쟽合肪\uda71쪏\udfa5ፄ㈍퇞\uf0b7励紪", 13 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr22);
                                                    globalInstance.setCustomSdkVersion(((String) objArr22[0]).intern(), 10003);
                                                    Bundle bundle3 = bundle2;
                                                    Object[] objArr23 = new Object[1];
                                                    onOptionsItemSelected("稣弌꼥퐭ʧࣲ䈎㛖폕婼", 9 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr23);
                                                    String strIntern2 = ((String) objArr23[0]).intern();
                                                    Object[] objArr24 = new Object[1];
                                                    setContentView((byte) (19 - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6, "\"\u0011\u0014\u0012㘒", objArr24);
                                                    bundle3.putString(strIntern2, ((String) objArr24[0]).intern());
                                                    Bundle bundle4 = bundle2;
                                                    Object[] objArr25 = new Object[1];
                                                    onOptionsItemSelected("尧圞泘鱛翪줭ꓔ\uec14买㡒", 9 - TextUtils.indexOf("", ""), objArr25);
                                                    String strIntern3 = ((String) objArr25[0]).intern();
                                                    Object[] objArr26 = new Object[1];
                                                    onOptionsItemSelected("骀鱷ⰹ\u1f5c坶請먫獢\uf132䬧碋ꮰꀝ뜣\ue057錯ﱩ\ue1d4뢅ண䄗贤巂\u0c49쪏\udfa5㆞䮗", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 27, objArr26);
                                                    bundle4.putString(strIntern3, ((String) objArr26[0]).intern());
                                                    registerForContextMenu.onOptionsItemSelected(registerForContextMenu.this, globalInstance.renderPushNotification(iNotificationRenderer, context2, bundle2));
                                                } catch (Throwable th10) {
                                                    Throwable cause5 = th10.getCause();
                                                    if (cause5 == null) {
                                                        throw th10;
                                                    }
                                                    throw cause5;
                                                }
                                            } else {
                                                Object[] objArr27 = new Object[1];
                                                setContentView((byte) (TextUtils.getOffsetBefore("", 0) + 54), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, "\u000f\u0000\u0004\u001c", objArr27);
                                                String strIntern4 = ((String) objArr27[0]).intern();
                                                Object[] objArr28 = new Object[1];
                                                setContentView((byte) (68 - (Process.myPid() >> 22)), 50 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0002\u0018\u0014\u0000 \u0005\n\u000f\u0014\u0000\u001b\u001d\u001a!\u0011\u000e\u0014\u0019\u000e\n\u001a\t\u0018 \u0015\u001d\u001d\u001b\u0015\u0018\u000f\u0011\u0000#\u001c\u000f\u001d!\r\u0016\u0016\u0007\u000f\n\u0015\u001a\u0012 \u0013\u0007", objArr28);
                                                Logger.m5874v(strIntern4, ((String) objArr28[0]).intern());
                                                registerForContextMenu registerforcontextmenu3 = registerForContextMenu.this;
                                                Object[] objArr29 = new Object[1];
                                                onOptionsItemSelected("ᔷ㭎夁뽢琷舓糥\ue51f䑙\ue849嶣ੁ먫獢ꘖ」䇔斥懗뵶줜쐾륃䑑买㡒", 25 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr29);
                                                registerForContextMenu.registerForContextMenu(registerforcontextmenu3, ((String) objArr29[0]).intern());
                                            }
                                        } catch (Throwable th11) {
                                            Object[] objArr30 = new Object[1];
                                            setContentView((byte) (KeyEvent.normalizeMetaState(0) + 54), 3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\u000f\u0000\u0004\u001c", objArr30);
                                            String strIntern5 = ((String) objArr30[0]).intern();
                                            Object[] objArr31 = new Object[1];
                                            onOptionsItemSelected("㛈䯰鉢ﲔⳞ텇麘멚ፄ㈍ﱩ\ue1d4铝징淑씃줆咟麘멚짗犎夝톒둲앑", 25 - TextUtils.getCapsMode("", 0, 0), objArr31);
                                            Logger.m5874v(strIntern5, ((String) objArr31[0]).intern());
                                            th11.printStackTrace();
                                            registerForContextMenu registerforcontextmenu4 = registerForContextMenu.this;
                                            Object[] objArr32 = new Object[1];
                                            setContentView((byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 52), KeyEvent.keyCodeFromString("") + 31, "!\u0012\u0006!\u001e\u0014\b \u001d\u001c\t\u0007\u001a\u0000\u0019\n\u001c\u0019\"\u0018\u0006 \u001b\f\u000b\u0012\u000f\u0002\u0011\u0016㘥", objArr32);
                                            registerForContextMenu.registerForContextMenu(registerforcontextmenu4, ((String) objArr32[0]).intern());
                                        }
                                    } else {
                                        Object[] objArr33 = new Object[1];
                                        setContentView((byte) (54 - Gravity.getAbsoluteGravity(0, 0)), ExpandableListView.getPackedPositionType(0L) + 4, "\u000f\u0000\u0004\u001c", objArr33);
                                        String strIntern6 = ((String) objArr33[0]).intern();
                                        Object[] objArr34 = new Object[1];
                                        setContentView((byte) (ImageFormat.getBitsPerPixel(0) + 38), 44 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0002\u0018\u0014\u0000 \u0005\n\u000f\u0014\u0000\u001b\u001d\u001a!\u0011\u000e\u0014\u0019\u000e\n\u001a\u0003\u0015\u001d\u001d\u001b\u0015\u0018\u001e\u001d\u001d\u000e\u0018\u000f\u0012\u001f\u0000#\u001b\u0000\u000e\"㗙", objArr34);
                                        Logger.m5874v(strIntern6, ((String) objArr34[0]).intern());
                                        registerForContextMenu registerforcontextmenu5 = registerForContextMenu.this;
                                        Object[] objArr35 = new Object[1];
                                        onOptionsItemSelected("垊䶭傁祇䇔斥懗뵶钆䞖\ue1a0皜嶗躋\uf1c8쎜ꗾ\uf71f㟻ॼ쪏\udfa5爵썣샻ত", 26 - (Process.myPid() >> 22), objArr35);
                                        registerForContextMenu.registerForContextMenu(registerforcontextmenu5, ((String) objArr35[0]).intern());
                                    }
                                    registerForContextMenu.registerForContextMenu(registerForContextMenu.this, System.nanoTime());
                                    int i20 = decodeByteArray + 15;
                                    isOpaque = i20 % 128;
                                    if (i20 % 2 != 0) {
                                        throw null;
                                    }
                                }
                            };
                            valuesVar.openContextMenu(2);
                            i2 = 482;
                            i14 = i15;
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case -33:
                            c2 = 491;
                            valuesVar.openContextMenu = 2;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            registerForContextMenu registerforcontextmenu3 = (registerForContextMenu) valuesVar.width;
                            valuesVar.openContextMenu(8);
                            registerforcontextmenu3.values = (BroadcastReceiver.PendingResult) valuesVar.width;
                            i2 = 482;
                            i14 = i15;
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case -32:
                            c2 = 491;
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            try {
                                valuesVar.onContextItemSelected = registerForContextMenu.class.getMethod("goAsync", null).invoke((registerForContextMenu) valuesVar.width, null);
                                valuesVar.openContextMenu(2);
                                i2 = 482;
                                i14 = i15;
                                i8 = i2;
                                c = c2;
                                i12 = 0;
                            } catch (Throwable th10) {
                                Throwable cause5 = th10.getCause();
                                if (cause5 == null) {
                                    throw th10;
                                }
                                throw cause5;
                            }
                            break;
                        case -31:
                            c2 = 491;
                            i14 = 57;
                            c = c2;
                            i8 = 482;
                            i12 = 0;
                            break;
                        case -30:
                            c2 = 491;
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            Object obj2 = valuesVar.width;
                            try {
                                byte[] bArr5 = setContentView;
                                byte b8 = bArr5[1];
                                Object[] objArr20 = new Object[1];
                                setContentView(b8, (short) (b8 | 1874), (short) (unregisterForContextMenu | 283), objArr20);
                                Class<?> cls7 = Class.forName((String) objArr20[0]);
                                Object[] objArr21 = new Object[1];
                                setContentView(bArr5[6], 2083, 483, objArr21);
                                cls7.getMethod((String) objArr21[0], null).invoke(obj2, null);
                                i2 = 482;
                                i14 = i15;
                                i8 = i2;
                                c = c2;
                                i12 = 0;
                            } catch (Throwable th11) {
                                Throwable cause6 = th11.getCause();
                                if (cause6 == null) {
                                    throw th11;
                                }
                                throw cause6;
                            }
                            break;
                        case -29:
                            c2 = 491;
                            i14 = 84;
                            c = c2;
                            i8 = 482;
                            i12 = 0;
                            break;
                        case -28:
                            c2 = 491;
                            try {
                                valuesVar.openContextMenu = 4;
                                valuesVar.openContextMenu(7);
                                valuesVar.openContextMenu(8);
                                Object obj3 = valuesVar.width;
                                valuesVar.openContextMenu(8);
                                Object obj4 = valuesVar.width;
                                valuesVar.openContextMenu(35);
                                long j2 = valuesVar.unregisterForContextMenu;
                                valuesVar.openContextMenu(8);
                                try {
                                    Object[] objArr22 = {obj4, Long.valueOf(j2), valuesVar.width};
                                    byte[] bArr6 = setContentView;
                                    byte b9 = bArr6[1];
                                    int i20 = unregisterForContextMenu;
                                    Object[] objArr23 = new Object[1];
                                    setContentView(b9, 1571, (short) (i20 | 257), objArr23);
                                    Class<?> cls8 = Class.forName((String) objArr23[0]);
                                    byte b10 = bArr6[c6];
                                    Object[] objArr24 = new Object[1];
                                    setContentView(b10, (short) (b10 | 356), 490, objArr24);
                                    String str4 = (String) objArr24[0];
                                    Object[] objArr25 = new Object[1];
                                    setContentView(bArr6[1], 2395, 480, objArr25);
                                    Class<?> cls9 = Class.forName((String) objArr25[0]);
                                    Object[] objArr26 = new Object[1];
                                    setContentView(bArr6[1], 387, (short) (i20 | 273), objArr26);
                                    valuesVar.onContextItemSelected = cls8.getMethod(str4, cls9, cls4, Class.forName((String) objArr26[0])).invoke(obj3, objArr22);
                                    valuesVar.openContextMenu(2);
                                    i2 = 482;
                                    i14 = i15;
                                    i8 = i2;
                                    c = c2;
                                    i12 = 0;
                                } catch (Throwable th12) {
                                    Throwable cause7 = th12.getCause();
                                    if (cause7 == null) {
                                        throw th12;
                                    }
                                    throw cause7;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                i = i13;
                                i2 = 482;
                                byte b11 = setContentView[1];
                                int i111 = unregisterForContextMenu;
                                objArr = new Object[1];
                                setContentView(b11, (short) (i111 | 1842), (short) (i111 | 283), objArr);
                                i12 = 0;
                                if (!Class.forName((String) objArr[0]).isInstance(th)) {
                                    if (i15 >= 130) {
                                    }
                                    throw th;
                                }
                                if (i15 >= 130) {
                                }
                                throw th;
                                valuesVar.onContextItemSelected = th;
                                valuesVar.openContextMenu(55);
                                i14 = i3;
                                i13 = i;
                                i8 = i2;
                                c = c2;
                            }
                            break;
                        case -27:
                            c2 = 491;
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            valuesVar.onContextItemSelected = ((registerForContextMenu) valuesVar.width).width;
                            valuesVar.openContextMenu(2);
                            i2 = i8;
                            i14 = i15;
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case -26:
                            c2 = 491;
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            valuesVar.onContextItemSelected = ((registerForContextMenu) valuesVar.width).onContextItemSelected;
                            valuesVar.openContextMenu(2);
                            i2 = i8;
                            i14 = i15;
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case ShareConstants.ERROR_LOAD_PATCH_UNCAUGHT_EXCEPTION /* -25 */:
                            c2 = 491;
                            try {
                                valuesVar.openContextMenu = 2;
                                valuesVar.openContextMenu(7);
                                valuesVar.openContextMenu(8);
                                registerForContextMenu registerforcontextmenu4 = (registerForContextMenu) valuesVar.width;
                                valuesVar.openContextMenu(8);
                                registerforcontextmenu4.onContextItemSelected = (ScheduledExecutorService) valuesVar.width;
                                i2 = i8;
                                i14 = i15;
                                i8 = i2;
                                c = c2;
                                i12 = 0;
                            } catch (Throwable th14) {
                                th = th14;
                                i = i13;
                                i2 = i8;
                                byte b12 = setContentView[1];
                                int i112 = unregisterForContextMenu;
                                objArr = new Object[1];
                                setContentView(b12, (short) (i112 | 1842), (short) (i112 | 283), objArr);
                                i12 = 0;
                                if (!Class.forName((String) objArr[0]).isInstance(th)) {
                                    if (i15 >= 130) {
                                    }
                                    throw th;
                                }
                                if (i15 >= 130) {
                                }
                                throw th;
                                valuesVar.onContextItemSelected = th;
                                valuesVar.openContextMenu(55);
                                i14 = i3;
                                i13 = i;
                                i8 = i2;
                                c = c2;
                            }
                            break;
                        case ShareConstants.ERROR_LOAD_PATCH_VERSION_RESOURCE_MD5_MISMATCH /* -24 */:
                            c3 = 491;
                            try {
                                byte[] bArr7 = setContentView;
                                byte b13 = bArr7[1];
                                int i21 = unregisterForContextMenu;
                                Object[] objArr27 = new Object[1];
                                setContentView(b13, (short) (i21 | 1824), (short) (i21 | 272), objArr27);
                                Class<?> cls10 = Class.forName((String) objArr27[0]);
                                Object[] objArr28 = new Object[1];
                                setContentView(bArr7[19], 2069, 466, objArr28);
                                valuesVar.onContextItemSelected = cls10.getMethod((String) objArr28[0], null).invoke(null, null);
                                valuesVar.openContextMenu(2);
                                i2 = i8;
                                c2 = c3;
                                i14 = i15;
                                i8 = i2;
                                c = c2;
                                i12 = 0;
                            } catch (Throwable th15) {
                                Throwable cause8 = th15.getCause();
                                if (cause8 == null) {
                                    throw th15;
                                }
                                throw cause8;
                            }
                            break;
                        case ShareConstants.ERROR_LOAD_PATCH_VERSION_RESOURCE_LOAD_EXCEPTION /* -23 */:
                            try {
                                valuesVar.openContextMenu = 2;
                                valuesVar.openContextMenu(7);
                                valuesVar.openContextMenu(8);
                                Object obj5 = valuesVar.width;
                                valuesVar.openContextMenu(35);
                                try {
                                    Object[] objArr29 = {Long.valueOf(valuesVar.unregisterForContextMenu)};
                                    byte[] bArr8 = setContentView;
                                    Object[] objArr30 = new Object[1];
                                    setContentView(bArr8[1], 387, (short) (unregisterForContextMenu | 273), objArr30);
                                    Class<?> cls11 = Class.forName((String) objArr30[0]);
                                    byte b14 = bArr8[83];
                                    Object[] objArr31 = new Object[1];
                                    c3 = 491;
                                    try {
                                        setContentView(b14, (short) (b14 | 1989), 491, objArr31);
                                        try {
                                            valuesVar.registerForContextMenu = ((Long) cls11.getMethod((String) objArr31[0], cls4).invoke(obj5, objArr29)).longValue();
                                            valuesVar.openContextMenu(29);
                                            i2 = i8;
                                            c2 = c3;
                                            i14 = i15;
                                            i8 = i2;
                                            c = c2;
                                            i12 = 0;
                                        } catch (Throwable th16) {
                                            th = th16;
                                            i = i13;
                                            i2 = i8;
                                            c2 = c3;
                                            byte b15 = setContentView[1];
                                            int i113 = unregisterForContextMenu;
                                            objArr = new Object[1];
                                            setContentView(b15, (short) (i113 | 1842), (short) (i113 | 283), objArr);
                                            i12 = 0;
                                            if (!Class.forName((String) objArr[0]).isInstance(th)) {
                                                if (i15 >= 130) {
                                                }
                                                throw th;
                                            }
                                            if (i15 >= 130) {
                                            }
                                            throw th;
                                            valuesVar.onContextItemSelected = th;
                                            valuesVar.openContextMenu(55);
                                            i14 = i3;
                                            i13 = i;
                                            i8 = i2;
                                            c = c2;
                                        }
                                    } catch (Throwable th17) {
                                        th = th17;
                                        Throwable cause9 = th.getCause();
                                        if (cause9 == null) {
                                            throw th;
                                        }
                                        throw cause9;
                                    }
                                } catch (Throwable th18) {
                                    th = th18;
                                }
                            } catch (Throwable th19) {
                                th = th19;
                                c3 = 491;
                                i = i13;
                                i2 = i8;
                                c2 = c3;
                                byte b16 = setContentView[1];
                                int i114 = unregisterForContextMenu;
                                objArr = new Object[1];
                                setContentView(b16, (short) (i114 | 1842), (short) (i114 | 283), objArr);
                                i12 = 0;
                                if (!Class.forName((String) objArr[0]).isInstance(th)) {
                                    if (i15 >= 130) {
                                    }
                                    throw th;
                                }
                                if (i15 >= 130) {
                                }
                                throw th;
                                valuesVar.onContextItemSelected = th;
                                valuesVar.openContextMenu(55);
                                i14 = i3;
                                i13 = i;
                                i8 = i2;
                                c = c2;
                            }
                            break;
                        case ShareConstants.ERROR_LOAD_PATCH_VERSION_RESOURCE_FILE_NOT_EXIST /* -22 */:
                            byte[] bArr9 = setContentView;
                            byte b17 = bArr9[1];
                            int i22 = unregisterForContextMenu;
                            Object[] objArr32 = new Object[1];
                            setContentView(b17, 387, (short) (i22 | 273), objArr32);
                            Class<?> cls12 = Class.forName((String) objArr32[0]);
                            Object[] objArr33 = new Object[1];
                            setContentView(bArr9[13], 2094, (short) (i22 | 290), objArr33);
                            valuesVar.onContextItemSelected = cls12.getField((String) objArr33[0]).get(null);
                            valuesVar.openContextMenu(2);
                            i2 = i8;
                            c2 = 491;
                            i14 = i15;
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case -21:
                            try {
                                valuesVar.openContextMenu = 1;
                                valuesVar.openContextMenu(7);
                                valuesVar.openContextMenu(8);
                                try {
                                    Object[] objArr34 = {valuesVar.width};
                                    byte[] bArr10 = setContentView;
                                    Object[] objArr35 = new Object[1];
                                    setContentView(bArr10[1], 2275, (short) (unregisterForContextMenu | 288), objArr35);
                                    Class<?> cls13 = Class.forName((String) objArr35[0]);
                                    Object[] objArr36 = new Object[1];
                                    setContentView(bArr10[6], bArr10[11], 489, objArr36);
                                    String str5 = (String) objArr36[0];
                                    Object[] objArr37 = new Object[1];
                                    try {
                                        setContentView(bArr10[1], 1030, i8, objArr37);
                                        valuesVar.registerForContextMenu = ((Long) cls13.getMethod(str5, Class.forName((String) objArr37[0])).invoke(null, objArr34)).longValue();
                                        valuesVar.openContextMenu(29);
                                        i2 = i8;
                                        c2 = 491;
                                        i14 = i15;
                                        i8 = i2;
                                        c = c2;
                                        i12 = 0;
                                    } catch (Throwable th20) {
                                        th = th20;
                                        Throwable cause10 = th.getCause();
                                        if (cause10 == null) {
                                            throw th;
                                        }
                                        throw cause10;
                                    }
                                } catch (Throwable th21) {
                                    th = th21;
                                }
                            } catch (Throwable th22) {
                                th = th22;
                                i = i13;
                                i2 = i8;
                                c2 = 491;
                                byte b18 = setContentView[1];
                                int i115 = unregisterForContextMenu;
                                objArr = new Object[1];
                                setContentView(b18, (short) (i115 | 1842), (short) (i115 | 283), objArr);
                                i12 = 0;
                                if (!Class.forName((String) objArr[0]).isInstance(th)) {
                                    if (i15 >= 130) {
                                    }
                                    throw th;
                                }
                                if (i15 >= 130) {
                                }
                                throw th;
                                valuesVar.onContextItemSelected = th;
                                valuesVar.openContextMenu(55);
                                i14 = i3;
                                i13 = i;
                                i8 = i2;
                                c = c2;
                            }
                            break;
                        case -20:
                            try {
                                valuesVar.openContextMenu = 3;
                                valuesVar.openContextMenu(7);
                                valuesVar.openContextMenu(8);
                                Object obj6 = valuesVar.width;
                                valuesVar.openContextMenu(8);
                                Object obj7 = valuesVar.width;
                                valuesVar.openContextMenu(8);
                                try {
                                    Object[] objArr38 = {obj7, valuesVar.width};
                                    byte[] bArr11 = setContentView;
                                    Object[] objArr39 = new Object[1];
                                    try {
                                        setContentView(bArr11[592], 2572, 481, objArr39);
                                        Class<?> cls14 = Class.forName((String) objArr39[0]);
                                        Object[] objArr40 = new Object[1];
                                        setContentView(bArr11[4], HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE_416, 489, objArr40);
                                        String str6 = (String) objArr40[0];
                                        Object[] objArr41 = new Object[1];
                                        setContentView(bArr11[1], 1030, i8, objArr41);
                                        Class<?> cls15 = Class.forName((String) objArr41[0]);
                                        Object[] objArr42 = new Object[1];
                                        setContentView(bArr11[1], 1030, i8, objArr42);
                                        valuesVar.onContextItemSelected = cls14.getMethod(str6, cls15, Class.forName((String) objArr42[0])).invoke(obj6, objArr38);
                                        valuesVar.openContextMenu(2);
                                        i2 = i8;
                                        c2 = 491;
                                        i14 = i15;
                                        i8 = i2;
                                        c = c2;
                                        i12 = 0;
                                    } catch (Throwable th23) {
                                        th = th23;
                                        Throwable cause11 = th.getCause();
                                        if (cause11 == null) {
                                            throw th;
                                        }
                                        throw cause11;
                                    }
                                } catch (Throwable th24) {
                                    th = th24;
                                }
                            } catch (Throwable th25) {
                                th = th25;
                                i = i13;
                                i2 = i8;
                                c2 = 491;
                                byte b19 = setContentView[1];
                                int i116 = unregisterForContextMenu;
                                objArr = new Object[1];
                                setContentView(b19, (short) (i116 | 1842), (short) (i116 | 283), objArr);
                                i12 = 0;
                                if (!Class.forName((String) objArr[0]).isInstance(th)) {
                                    if (i15 >= 130) {
                                    }
                                    throw th;
                                }
                                if (i15 >= 130) {
                                }
                                throw th;
                                valuesVar.onContextItemSelected = th;
                                valuesVar.openContextMenu(55);
                                i14 = i3;
                                i13 = i;
                                i8 = i2;
                                c = c2;
                            }
                            break;
                        case -19:
                            valuesVar.openContextMenu = 2;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            CharSequence charSequence = (CharSequence) valuesVar.width;
                            valuesVar.openContextMenu(9);
                            valuesVar.openContextMenu = TextUtils.getOffsetBefore(charSequence, valuesVar.setContentView);
                            i4 = 4;
                            valuesVar.openContextMenu(i4);
                            i2 = i8;
                            c2 = 491;
                            i14 = i15;
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case -18:
                            valuesVar.onContextItemSelected = "桩鱓Ǘ됣";
                            valuesVar.openContextMenu(2);
                            i2 = i8;
                            c2 = 491;
                            i14 = i15;
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case ShareConstants.ERROR_LOAD_PATCH_VERSION_LIB_DIRECTORY_NOT_EXIST /* -17 */:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            Object obj8 = valuesVar.width;
                            try {
                                byte[] bArr12 = setContentView;
                                Object[] objArr43 = new Object[1];
                                setContentView(bArr12[1], 1030, i8, objArr43);
                                Class<?> cls16 = Class.forName((String) objArr43[0]);
                                Object[] objArr44 = new Object[1];
                                setContentView(bArr12[67], 850, (short) (unregisterForContextMenu | 296), objArr44);
                                valuesVar.onContextItemSelected = cls16.getMethod((String) objArr44[0], null).invoke(obj8, null);
                                valuesVar.openContextMenu(2);
                                i2 = i8;
                                c2 = 491;
                                i14 = i15;
                                i8 = i2;
                                c = c2;
                                i12 = 0;
                            } catch (Throwable th26) {
                                Throwable cause12 = th26.getCause();
                                if (cause12 == null) {
                                    throw th26;
                                }
                                throw cause12;
                            }
                            break;
                        case -16:
                            valuesVar.openContextMenu = 2;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            String str7 = (String) valuesVar.width;
                            valuesVar.openContextMenu(9);
                            Object[] objArr45 = new Object[1];
                            registerForContextMenu(str7, valuesVar.setContentView, objArr45);
                            valuesVar.onContextItemSelected = (String) objArr45[0];
                            valuesVar.openContextMenu(2);
                            i2 = i8;
                            c2 = 491;
                            i14 = i15;
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case -15:
                            valuesVar.openContextMenu = 3;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            CharSequence charSequence2 = (CharSequence) valuesVar.width;
                            valuesVar.openContextMenu(9);
                            char c7 = (char) valuesVar.setContentView;
                            valuesVar.openContextMenu(9);
                            valuesVar.openContextMenu = TextUtils.lastIndexOf(charSequence2, c7, valuesVar.setContentView);
                            i4 = 4;
                            valuesVar.openContextMenu(i4);
                            i2 = i8;
                            c2 = 491;
                            i14 = i15;
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case -14:
                            valuesVar.onContextItemSelected = "";
                            valuesVar.openContextMenu(2);
                            i2 = i8;
                            c2 = 491;
                            i14 = i15;
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case -13:
                            valuesVar.onContextItemSelected = "繢\uf50f쮿\ue1cc覮\uf258";
                            valuesVar.openContextMenu(2);
                            i2 = i8;
                            c2 = 491;
                            i14 = i15;
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case -12:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            try {
                                valuesVar.onContextItemSelected = ((Class) unregisterForContextMenu.setContentView(51 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 51, (char) (50201 - TextUtils.indexOf((CharSequence) "", '0', i12)))).getMethod("unregisterForContextMenu", RemoteMessage.class).invoke(null, (RemoteMessage) valuesVar.width);
                                valuesVar.openContextMenu(2);
                                i2 = i8;
                                c2 = 491;
                                i14 = i15;
                                i8 = i2;
                                c = c2;
                                i12 = 0;
                            } catch (Throwable th27) {
                                Throwable cause13 = th27.getCause();
                                if (cause13 == null) {
                                    throw th27;
                                }
                                throw cause13;
                            }
                            break;
                        case -11:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            try {
                                Object[] objArr46 = {valuesVar.width};
                                byte[] bArr13 = setContentView;
                                Object[] objArr47 = new Object[1];
                                setContentView(bArr13[675], 2136, (short) (unregisterForContextMenu | 259), objArr47);
                                Class<?> cls17 = Class.forName((String) objArr47[i12]);
                                Object[] objArr48 = new Object[1];
                                setContentView(bArr13[592], 2572, 481, objArr48);
                                valuesVar.onContextItemSelected = cls17.getDeclaredConstructor(Class.forName((String) objArr48[i12])).newInstance(objArr46);
                                valuesVar.openContextMenu(2);
                                i2 = i8;
                                c2 = 491;
                                i14 = i15;
                                i8 = i2;
                                c = c2;
                                i12 = 0;
                            } catch (Throwable th28) {
                                Throwable cause14 = th28.getCause();
                                if (cause14 == null) {
                                    throw th28;
                                }
                                throw cause14;
                            }
                            break;
                        case -10:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            Object obj9 = valuesVar.width;
                            try {
                                byte[] bArr14 = setContentView;
                                Object[] objArr49 = new Object[1];
                                setContentView(bArr14[592], 1616, (short) (unregisterForContextMenu | 280), objArr49);
                                Class<?> cls18 = Class.forName((String) objArr49[i12]);
                                Object[] objArr50 = new Object[1];
                                setContentView(bArr14[4], 2144, 489, objArr50);
                                valuesVar.onContextItemSelected = cls18.getMethod((String) objArr50[i12], null).invoke(obj9, null);
                                valuesVar.openContextMenu(2);
                                i2 = i8;
                                c2 = 491;
                                i14 = i15;
                                i8 = i2;
                                c = c2;
                                i12 = 0;
                            } catch (Throwable th29) {
                                Throwable cause15 = th29.getCause();
                                if (cause15 == null) {
                                    throw th29;
                                }
                                throw cause15;
                            }
                            break;
                        case -9:
                            i14 = 96;
                            c = 491;
                            break;
                        case -8:
                            i14 = 13;
                            c = 491;
                            break;
                        case -7:
                            valuesVar.openContextMenu(56);
                            if (valuesVar.setContentView == 0) {
                                i14 = 11;
                            } else {
                                i14 = i15;
                            }
                            c = 491;
                            break;
                        case -6:
                            i14 = 12;
                            c = 491;
                            break;
                        case -5:
                            i14 = 118;
                            c = 491;
                            break;
                        case -4:
                            valuesVar.openContextMenu(40);
                            if (valuesVar.setContentView == 0) {
                                i14 = 7;
                            } else {
                                i14 = i15;
                            }
                            c = 491;
                            break;
                        case -3:
                            valuesVar.openContextMenu = 2;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            registerForContextMenu registerforcontextmenu5 = (registerForContextMenu) valuesVar.width;
                            valuesVar.openContextMenu(35);
                            registerforcontextmenu5.Movie = valuesVar.unregisterForContextMenu;
                            i2 = i8;
                            c2 = 491;
                            i14 = i15;
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                        case -2:
                            try {
                                byte[] bArr15 = setContentView;
                                Object[] objArr51 = new Object[1];
                                setContentView(bArr15[1], 2426, i8, objArr51);
                                Class<?> cls19 = Class.forName((String) objArr51[i12]);
                                byte b20 = bArr15[19];
                                Object[] objArr52 = new Object[1];
                                setContentView(b20, (short) (b20 | 1570), 490, objArr52);
                                try {
                                    valuesVar.registerForContextMenu = ((Long) cls19.getMethod((String) objArr52[i12], null).invoke(null, null)).longValue();
                                    valuesVar.openContextMenu(29);
                                    i2 = i8;
                                    c2 = 491;
                                    i14 = i15;
                                    i8 = i2;
                                    c = c2;
                                    i12 = 0;
                                } catch (Throwable th30) {
                                    th = th30;
                                    i = i13;
                                    i2 = i8;
                                    c2 = 491;
                                    byte b110 = setContentView[1];
                                    int i117 = unregisterForContextMenu;
                                    objArr = new Object[1];
                                    setContentView(b110, (short) (i117 | 1842), (short) (i117 | 283), objArr);
                                    i12 = 0;
                                    if (!Class.forName((String) objArr[0]).isInstance(th)) {
                                        if (i15 >= 130) {
                                        }
                                        throw th;
                                    }
                                    if (i15 >= 130) {
                                    }
                                    throw th;
                                    valuesVar.onContextItemSelected = th;
                                    valuesVar.openContextMenu(55);
                                    i14 = i3;
                                    i13 = i;
                                    i8 = i2;
                                    c = c2;
                                }
                            } catch (Throwable th31) {
                                Throwable cause16 = th31.getCause();
                                if (cause16 == null) {
                                    throw th31;
                                }
                                throw cause16;
                            }
                            break;
                        case -1:
                            i14 = 74;
                            c = 491;
                            break;
                        default:
                            i2 = i8;
                            c2 = 491;
                            i14 = i15;
                            i8 = i2;
                            c = c2;
                            i12 = 0;
                            break;
                    }
                } catch (Throwable th32) {
                    th = th32;
                    i = i13;
                    i2 = i8;
                    c2 = c;
                }
            }
        } catch (Throwable th33) {
            Throwable cause17 = th33.getCause();
            if (cause17 == null) {
                throw th33;
            }
            throw cause17;
        }
    }

    public static /* synthetic */ Future onOptionsItemSelected(registerForContextMenu registerforcontextmenu, Future future) throws Throwable {
        int i;
        int i2;
        values valuesVar = new values(registerforcontextmenu, future);
        byte[] bArr = setContentView;
        Object[] objArr = new Object[1];
        setContentView((byte) (bArr[713] - 1), 2712, 357, objArr);
        int i3 = 0;
        String str = (String) objArr[0];
        byte b = bArr[713];
        int i4 = unregisterForContextMenu;
        Object[] objArr2 = new Object[1];
        setContentView(b, (short) (i4 | 1842), 497, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            Object[] objArr4 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            byte b2 = bArr[31];
            Object[] objArr5 = new Object[1];
            setContentView(b2, (short) (b2 | 2276), (short) (i4 | 297), objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i5 = 0;
            while (i5 < objArr7.length) {
                try {
                    Object[] objArr8 = {objArr7[i5]};
                    byte[] bArr2 = setContentView;
                    Object[] objArr9 = new Object[1];
                    setContentView(bArr2[1], 2411, 481, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[i3]);
                    byte b3 = bArr2[22];
                    Object[] objArr10 = new Object[1];
                    int i6 = i3;
                    setContentView(b3, (short) (b3 | 845), 491, objArr10);
                    String str3 = (String) objArr10[i6];
                    Object[] objArr11 = new Object[1];
                    setContentView(bArr2[1], 1030, 482, objArr11);
                    Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr11[i6])).invoke(null, objArr8);
                    try {
                        Object[] objArr12 = new Object[1];
                        setContentView(bArr2[1], 2411, 481, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[i6]);
                        Object[] objArr13 = new Object[1];
                        setContentView(bArr2[67], 839, 490, objArr13);
                        iArr[i5] = ((Integer) cls3.getMethod((String) objArr13[i6], null).invoke(objInvoke, null)).intValue();
                        i5++;
                        i3 = i6;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            while (true) {
                int i7 = i3 + 1;
                try {
                    switch (valuesVar.openContextMenu(iArr[i3])) {
                        case -18:
                            i3 = 39;
                            break;
                        case ShareConstants.ERROR_LOAD_PATCH_VERSION_LIB_DIRECTORY_NOT_EXIST /* -17 */:
                            valuesVar.openContextMenu(22);
                            int i8 = valuesVar.setContentView;
                            i3 = 10;
                            if (i8 != 0 && i8 == 1) {
                                i = 35;
                                i3 = i;
                            }
                            break;
                        case -16:
                            valuesVar.openContextMenu(79);
                            throw ((Throwable) valuesVar.width);
                        case -15:
                            i3 = 40;
                            break;
                        case -14:
                            i3 = 42;
                            break;
                        case -13:
                            valuesVar.openContextMenu(41);
                            if (valuesVar.setContentView == 0) {
                                i = 33;
                                i3 = i;
                            }
                            break;
                        case -12:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(9);
                            sync = valuesVar.setContentView;
                            break;
                        case -11:
                            i2 = decodeByteArray;
                            valuesVar.openContextMenu = i2;
                            valuesVar.openContextMenu(4);
                            break;
                        case -10:
                            i3 = 1;
                            break;
                        case -9:
                            i3 = 23;
                            break;
                        case -8:
                            valuesVar.openContextMenu(18);
                            i3 = valuesVar.setContentView == 0 ? 22 : i7;
                            break;
                        case -7:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(9);
                            decodeByteArray = valuesVar.setContentView;
                            break;
                        case -6:
                            i2 = sync;
                            valuesVar.openContextMenu = i2;
                            valuesVar.openContextMenu(4);
                            break;
                        case -5:
                            valuesVar.openContextMenu(79);
                            return (Future) valuesVar.width;
                        case -4:
                            i3 = 12;
                            break;
                        case -3:
                            i3 = 24;
                            break;
                        case -2:
                            valuesVar.openContextMenu = 2;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            registerForContextMenu registerforcontextmenu2 = (registerForContextMenu) valuesVar.width;
                            valuesVar.openContextMenu(8);
                            registerforcontextmenu2.onOptionsItemSelected = (Future) valuesVar.width;
                            break;
                        case -1:
                            i3 = 5;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th3) {
                    if (i7 < 36 || i7 > 39) {
                        throw th3;
                    }
                    valuesVar.onContextItemSelected = th3;
                    valuesVar.openContextMenu(55);
                    i3 = 34;
                }
            }
        } catch (Throwable th4) {
            Throwable cause3 = th4.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0250 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0240  */
    /* JADX WARN: Code duplicated, block: B:87:0x0244 A[ADDED_TO_REGION] */
    public static /* synthetic */ ScheduledExecutorService registerForContextMenu(registerForContextMenu registerforcontextmenu) throws Throwable {
        char c;
        values valuesVar = new values(registerforcontextmenu);
        byte[] bArr = setContentView;
        byte b = (byte) (bArr[713] - 1);
        int i = unregisterForContextMenu;
        Object[] objArr = new Object[1];
        setContentView(b, (short) (i | 819), 332, objArr);
        int i2 = 0;
        String str = (String) objArr[0];
        Object[] objArr2 = new Object[1];
        setContentView(bArr[713], (short) (i | 1842), 497, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            Object[] objArr4 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            byte b2 = bArr[31];
            Object[] objArr5 = new Object[1];
            setContentView(b2, (short) (b2 | 2276), (short) (i | 297), objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i3 = 0;
            while (i3 < objArr7.length) {
                try {
                    Object[] objArr8 = {objArr7[i3]};
                    byte[] bArr2 = setContentView;
                    Object[] objArr9 = new Object[1];
                    int i4 = i2;
                    setContentView(bArr2[1], 2411, 481, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[i4]);
                    byte b3 = bArr2[22];
                    Object[] objArr10 = new Object[1];
                    setContentView(b3, (short) (b3 | 845), 491, objArr10);
                    String str3 = (String) objArr10[i4];
                    Object[] objArr11 = new Object[1];
                    setContentView(bArr2[1], 1030, 482, objArr11);
                    Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr11[i4])).invoke(null, objArr8);
                    try {
                        Object[] objArr12 = new Object[1];
                        setContentView(bArr2[1], 2411, 481, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[i4]);
                        Object[] objArr13 = new Object[1];
                        setContentView(bArr2[67], 839, 490, objArr13);
                        iArr[i3] = ((Integer) cls3.getMethod((String) objArr13[i4], null).invoke(objInvoke, null)).intValue();
                        i3++;
                        i2 = i4;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            int i5 = i2;
            int i6 = i5;
            while (true) {
                int i7 = i6 + 1;
                try {
                    switch (valuesVar.openContextMenu(iArr[i6])) {
                        case -19:
                            i6 = 47;
                            break;
                        case -18:
                            try {
                                valuesVar.openContextMenu(22);
                                int i8 = valuesVar.setContentView;
                                i6 = (i8 == 0 || i8 != 1) ? 7 : 20;
                            } catch (Throwable th3) {
                                th = th3;
                                if (i7 < 21) {
                                    if (i7 >= 38) {
                                    }
                                    throw th;
                                }
                                if (i7 >= 38) {
                                }
                                throw th;
                                valuesVar.onContextItemSelected = th;
                                valuesVar.openContextMenu(55);
                            }
                            break;
                        case ShareConstants.ERROR_LOAD_PATCH_VERSION_LIB_DIRECTORY_NOT_EXIST /* -17 */:
                            i6 = 42;
                            break;
                        case -16:
                            valuesVar.openContextMenu(22);
                            i6 = valuesVar.setContentView != 11 ? 1 : 36;
                            break;
                        case -15:
                            i6 = 43;
                            break;
                        case -14:
                            i6 = 45;
                            break;
                        case -13:
                            valuesVar.openContextMenu(41);
                            i6 = valuesVar.setContentView == 0 ? 34 : i7;
                            break;
                        case -12:
                            try {
                                valuesVar.openContextMenu = 1;
                                valuesVar.openContextMenu(7);
                                valuesVar.openContextMenu(8);
                                Object obj = valuesVar.width;
                                try {
                                    byte[] bArr3 = setContentView;
                                    Object[] objArr14 = new Object[1];
                                    setContentView(bArr3[1], bArr3[9], 482, objArr14);
                                    Class<?> cls4 = Class.forName((String) objArr14[i5]);
                                    Object[] objArr15 = new Object[1];
                                    c = 490;
                                    try {
                                        setContentView(bArr3[76], 1585, 490, objArr15);
                                        try {
                                            valuesVar.openContextMenu = ((Integer) cls4.getMethod((String) objArr15[i5], null).invoke(obj, null)).intValue();
                                            valuesVar.openContextMenu(4);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            if (i7 < 21 && i7 <= 25) {
                                                i7 = 19;
                                            } else {
                                                if (i7 >= 38 || i7 > 42) {
                                                    throw th;
                                                }
                                                i7 = 35;
                                            }
                                            valuesVar.onContextItemSelected = th;
                                            valuesVar.openContextMenu(55);
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        Throwable cause3 = th.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                c = 490;
                            }
                            break;
                        case -11:
                            valuesVar.openContextMenu(79);
                            throw ((Throwable) valuesVar.width);
                        case -10:
                            i6 = 48;
                            break;
                        case -9:
                            i6 = 50;
                            break;
                        case -8:
                            valuesVar.openContextMenu(41);
                            if (valuesVar.setContentView == 0) {
                                i6 = 18;
                            }
                            break;
                        case -7:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(9);
                            sync = valuesVar.setContentView;
                            break;
                        case -6:
                            valuesVar.openContextMenu = decodeByteArray;
                            valuesVar.openContextMenu(4);
                            break;
                        case -5:
                            valuesVar.openContextMenu(79);
                            return (ScheduledExecutorService) valuesVar.width;
                        case -4:
                            i6 = 25;
                            break;
                        case -3:
                            i6 = 9;
                            break;
                        case -2:
                            valuesVar.openContextMenu = 1;
                            valuesVar.openContextMenu(7);
                            valuesVar.openContextMenu(8);
                            valuesVar.onContextItemSelected = ((registerForContextMenu) valuesVar.width).onContextItemSelected;
                            valuesVar.openContextMenu(2);
                            break;
                        case -1:
                            i6 = 4;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            }
        } catch (Throwable th9) {
            Throwable cause4 = th9.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void setContentView(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.clevertap.android.pushsdk.registerForContextMenu.setContentView
            int r1 = 498 - r8
            int r6 = 118 - r6
            int r7 = 2729 - r7
            byte[] r1 = new byte[r1]
            int r8 = 497 - r8
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r0
            r4 = r2
            r0 = r7
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L2b:
            int r7 = r7 + r6
            int r6 = r0 + 1
            int r7 = r7 + (-3)
            r0 = r7
            r7 = r6
            r6 = r0
            r0 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.pushsdk.registerForContextMenu.setContentView(short, int, int, java.lang.Object[]):void");
    }

    public static void onOptionsItemSelected() {
        byte[] bArr = new byte[2734];
        System.arraycopy("t\f\u0080l\u000f\u0001\u0006ÿü\u0016ß\u001eÚ)\u0006õ\u0016\u0007þ\bþ\u0010\u0000ù\u0004\bý\u0004\tü\b\u0003þ\b\u0003þ\b\tø\u000b\u0003û\u0004\nû\b\u0005ü\u0004\u000bú\u0004\fù\u0010\u0001ø\u000b\u0007÷\b\bù\b\tø\u0004\rø\b\u0003þ\b\tø\u0004\u000e÷\u0004\u000fö\u0004\u0007\u0002ÿ\u0004\u0007\u0002ÿ\u0004\u0007\u0003þ\u000fûÿ\u0010üý\b\tø\u0004\u0007\u0004ý\b\u0003þ\b\tø\u0004\u0007\u0005ü\u0004\u0007\u0006û\u0004\u0007\u0007ú\u0004\u0007\bù\b\u0005ü\u0010\u0002÷\u000b\u0003û\u0004\u000bú\u0004\u0007\tø\t\bø\u0004\u0007\n÷\u000b\u0001ý\u0004\u0007\n\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176üù\u000bü\u0007þ\bþ\u0004\bý\u0004\tü\u000b\u0002ü\b\tø\u000b\u0003û\u0004\nû\b\u0005ü\u0004\u000bú\u0004\fù\b\u0002\tù\b\bù\b\tø\u0004\rø\b\u0003þ\b\tø\u0004\u000e÷\u0004\u000fö\u0004\u0007\u0002ÿ\u0004\u0007\u0003þ\b\u0005ü\b\u0002\nø\u0004\u000bú\u0004\u0007\u0004ý\b\u0002\u000b÷\u000b\u0005ù\u0004\u0007\u0005ü\b\u0003þ\b\tø\u0004\u0007\u0006û\u0004\u0007\u0007ú\u0004\u0007\bù\u0004\u0007\bù\u0004\u0007\tø\b\u0002\fö\u0004\u0007\n÷\b\u0003\u0002ÿ\u0004\u0007\nú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000bú\u0018îÐAø\u0010üÊ\u001e(\tô\u0005\u0001\u0010ú\u0018îÐAø\u0010üÊ'&ü\u0003ö\u0004\rü\u0007þ\bþ\n\tö\u0004\bý\u0004\tü\b\u0003þ\b\u0003þ\fþÿ\u0004\nû\b\u0005ü\u0004\u000bú\u0004\fù\u000f\u0000ú\u000e\u0000û\u0004\rø\b\u0003þ\b\tø\u0004\u000e÷\u0004\u000fö\u0004\u0007\u0002ÿ\u0004\u0007\u0002ÿ\u0004\fù\u000f\u0001ù\u000f\u0002ø\b\tø\u0004\rø\b\u0003þ\b\tø\u0004\u0007\u0003þ\u0004\u0007\u0004ý\u0004\u0007\u0005ü\u0004\u0007\u0005\u0000ÿ\u0000\u000eú\u0018îÐAø\u0010üÊ!&\u0002üú\u0018îÐAø\u0010üÊ)\u0017\röÿ\u0006\u0007þ\bþ\u0004\bý\u0004\tü\b\u0003þ\b\u0004ý\u0004\nû\b\u0005ü\u0004\u000bú\u0004\fù\b\u0003\u0003þ\b\bù\b\tø\u0004\rø\b\u0003þ\b\tø\u0004\u000e÷\u0004\u000fö\u0004\u0007\u0002ÿ\u0004\u0007\u0002ÿ\u0004\fù\b\u0003\u0004ý\t\t÷\b\u0007ú\u000e\u0000û\u0004\rø\b\u000bö\u0004\u0007\u0003þ\u0004\u0007\u0004ý\u0004\u0007\u0005ü\u0004\u0007\u0005\u0006\bþ\rø\u0001\u0012Ô6ÿ\u0001ò\u0015\u000f\u0001Ä<\u000b\u0003û\büÌ;\u0006\fö\u0000\u0002\u0015õÌBû\u0011\u0003ñ\t\u0005\büÊ'\u0016\u000b\u0005\bôë\u001b\u0011\u0003ñ\t\u0001ÿ\u0006\u0003\u0000\rõ\u0001\u000f\u0002ù\u0012\u0005ú\b\tâ$ð\u0005\u000bì!ò\u0005\u0005ú\u0015ß\u0019\bü\büò\u0017\röÿ\u0006ò\u0013\b\u0000\u0002\u0014úü\u0002ä6ð\u0001\u0015\u0002þ\u0006ú\u0018îÐAø\u0010üÊ\u001a6î\u0005\u000e\u0007ø\t\u0002ú\u0018îÐJ\u0002ø\u0006Å8\u000f\u0002ø\u0015\u0000\u0003ö\f\t½\u001a6ð\u0001\u0015\u0002þ\u0006\u0004þâ\u0016\u0010\u0004\u0007\u0010ù\u0011\u0000ýþÍ8\u000f\u0002\tô\f\t½\u00173\u0000õ\u0006\u0002\u0001\u0015\u0004á\u0016\u0001\u0005\u0007\u0010ò\u0010µ/\u0018\fù\b\büî\u0016\u0011\u0005ú\u000bú\u0018îÐAø\u0010üÊ($\u0001ú\büÞ6÷\u0006û\u0004\u0010\u000f\u0001Ä8\fü\u0014ò\u0010\u0005ð\u0012Á6\u0010ù\u0011\u0000ýþÍHô\nÆ!&û\u0003\u0001\u0010ú\u0018îÐAø\u0010üÊ)\u0017\r\u0000\u000bí\u0004\rü\u0007þ\bþ\u0004\bý\u0004\tü\b\u0003þ\b\u0004ý\u0004\nû\b\u0005ü\u0004\u000bú\u0004\fù\b\u0003\u0005ü\u000b\u0005ù\u0004\rø\b\u0003þ\b\tø\u0004\u000e÷\u0004\u000fö\u0004\u0007\u0002ÿ\u0004\u0007\u0002ÿ\u0004\u0007\u0003þ\b\u0003\u0006û\t\t÷\b\u0007ú\b\bù\b\tø\u0004\u0007\u0004ý\b\u000bö\u0004\u0007\u0005ü\u0004\u0007\u0006û\u0004\u0007\u0007ú\u0004\u0007\u0007\u0007þ\bþ\u0004\bý\u0004\tü\b\u0003þ\b\u0003þ\b\tø\u000b\u0003û\u0004\nû\b\u0005ü\u0004\u000bú\u0004\fù\b\u0003\u0007ú\b\u0007ú\u000e\u0000û\u0004\rø\b\u0003þ\b\tø\u0004\u000e÷\u0004\u000fö\u0004\u0007\u0002ÿ\u0004\u0007\u0003þ\b\u0005ü\u0010úÿ\b\u0003\bù\u0004\u000bú\u0004\u0007\u0004ý\b\u0003\tø\t\t÷\b\u0007ú\b\bù\b\tø\u0004\u0007\u0005ü\b\u000bö\u0004\u0007\u0006û\u0004\u0007\u0007ú\u0004\u0007\bù\u0004\u0007\bù\u0004\u0007\tø\b\u0003\n÷\u0004\u0007\n÷\b\u0003\u000bö\u0004\u0007\nö\u0010\u0004\u0007õ\u0001\u000f\u0002ù\u0012\u0010ù\u0011\u0000ýþÍ8\u000f\u0002\tô\f\t½\u001e(\tô\f\tøþþç\u0015\u0001\u000f\u0002ù\u0012ü\u0015øÞ/ø\u0004ö\u0010\u0004è\u0018\u0007ûú\u0018îÐJ\u0002ø\u0006Å8\u000f\u0002ø\u0015\u0000\u0003ö\f\t½(\u0013\b\u0000\u0002\u0014úü\u0002ä6ð\u0001\u0015\u0002þ\u0006ä\u0015\u0010\u0007öý\u0005\u0007þ\bþ\u0004\bý\u0004\tü\n\tö\u0004\nû\u0004\u000bú\u0004\fù\f\u0005ø\u0004\rø\u0004\fù\u0004\u000e÷\u0004\u000fö\f\u0005ø\u0004\u0007\u0002ÿ\u0004\u0007\u0003þ\f\u0006÷\f\u0007ö\u0004\u0007\u0004ý\rýÿ\u0004\u0007\u0005ü\rþþ\u0004\u0007\u0006û\rÿý\u0004\u0007\u0007ú\t\t÷\u0004\u0007\bù\u0004\u0007\tø\u0004\u0007\n÷\r\u0000ü\u0004\u0007\u0006û\t\bø\u0004\u0007\u000bö\t\t÷\u0004\u0007\bù\u0004\u0007\tø\u0004\b\u0001ÿ\u0004\b\u0002þ\r\u0001û\u0004\b\u0003ý\r\u0002ú\u0004\b\u0004ü\r\u0003ù\bþ\u0004\b\u0005û\u0004\b\u0006ú\bþ\u0004\b\u0007ù\bþ\u0004\b\bø\r\u0002ú\u0004\b\u0003ý\u0004\b\t÷\u000b\u0003û\u0004\b\nö\u0004\t\u0000ÿ\u0004\t\u0001þ\bþ\f\u0006÷\u0004\t\u0002ý\u0004\t\u0003ü\r\u0004ø\r\u0005÷\r\u0006ö\n\tö\u0004\t\u0004û\u000eüÿ\bþ\u000eýþ\u0004\t\u0005ú\u000eþý\u0004\t\u0006ù\u0004\t\u0007ø\u0004\t\b÷\u000b\u0002ü\b\tø\u000b\u0003û\u0004\t\tö\b\u0003þ\b\u000bö\u000b\u0003û\u0004\t\u0001þ\b\u0005ü\u0004\t\b÷\u0004\nÿÿ\u000eÿü\u000e\u0000û\u0004\n\u0000þ\b\u000bö\u0004\n\u0001ý\u0004\n\u0002ü\u0004\n\u0003û\r\u0000ü\u000e\u0001ú\u000b\u0003û\u0004\t\u0001þ\u0004\nÿÿ\u000e\u0002ù\u000e\u0000û\u0004\n\u0000þ\b\u000bö\u0004\n\u0004ú\u0004\n\u0005ù\u0004\n\u0006ø\u0004\n\u0006ø\u0004\nÿÿ\u000e\u0003ø\t\t÷\b\u0007ú\b\bù\b\tø\u0004\n\u0000þ\b\u0003þ\b\tø\u0004\n\u0007÷\u0004\n\bö\u0004\u000bþÿ\u0004\u000bþÿ\u0004\nÿÿ\u000e\u0004÷\b\u0007ú\u000e\u0000û\u0004\n\u0000þ\b\u0003þ\b\tø\u0004\u000bÿþ\u0004\u000b\u0000ý\u0004\u000b\u0001ü\u0004\u000b\u0002û\f\u0005ø\u000fûÿ\u000füþ\u000fýý\u0004\u000b\u0003ú\u0004\fù\u0004\u000e÷\u0004\u000b\u0004ù\u000fþü\u0004\u000b\u0005ø\u000fÿû\u0004\u000b\u0005ø\u0004\u000b\u0006÷\u000b\u0001ý\u0004\u000b\u0007ö\t\bø\u0004\u000b\u0007ú\u0018îÐAø\u0010üÊ($\u0001ú\bü\u0007þ\bþ\u0004\bý\u0004\tü\u000f\u0003÷\u000b\u0003û\u0004\nû\b\u0005ü\u0004\u000bú\u0004\fù\u000f\u0004ö\t\t÷\u000b\u0005ù\u0004\rø\b\u0003þ\b\tø\u0004\u000e÷\u0004\u000fö\u0004\u0007\u0002ÿ\u0004\u0007\u0003þ\b\u0005ü\u0010úÿ\u0004\u0007\u0004ý\u000b\u0003û\u0004\u000bú\u0004\fù\u0010ûþ\u0010üý\b\tø\u0004\rø\b\u0003þ\b\tø\u0004\u0007\u0005ü\u0004\u0007\u0006û\u0004\u0007\u0007ú\u0004\u0007\u0003þ\bþ\u0004\bý\u0010ýü\u000füþ\u000fýý\u0004\tü\u0004\u0007\bù\u0010þû\u0004\u0007\tø\u0010ÿú\u0004\u0007\tø\u0004\u0007\n÷\t\bø\u0004\u0007\u000bö\u000b\u0001ý\u0004\u0007\u000b\b\tô\u0010ÿî\u000e\fóí\u001a\b\tå\u000e\u000e\fó\u0007þ\u0004\bý\t\u0006ú\u0004\tü\u0004\nû\b\u0002ÿ\u0004\u000bú\u0004\fù\u0004\rø\t\u0007ù\t\bø\t\bø\u0004\u000e÷\t\t÷\u0004\u000bú\u0004\fù\u0004\u000fö\u0004\u0007\u0002ÿ\n\u0000ÿ\u0004\bý\u0004\u0007\u0003þ\n\u0001þ\t\bø\u0004\u0007\u0004ý\b\u0002ÿ\u0004\u000bú\u0004\fù\u0004\u0007\u0005ü\u0004\u0007\u0006û\n\u0002ý\u0004\u0007\u0007ú\t\t÷\u0004\u000bú\u0004\fù\u0004\u0007\bù\u0004\u0007\tø\n\u0003ü\u0004\u0007\n÷\n\u0004û\u0004\u0007\u000bö\u0004\b\u0001ÿ\u0004\b\u0002þ\n\u0006ù\t\bø\u0004\b\u0003ý\n\b÷\b\u0002ÿ\u0004\u000bú\u0004\fù\u0004\u0007\bù\n\tö\u0004\u0007\bù\u0004\b\u0004ü\u0004\u000fö\bþ\u0004\b\u0005û\u0004\b\u0006ú\u0004\b\u0007ù\u0004\b\bø\bþ\u0004\b\t÷\u0004\b\nö\u0004\t\u0000ÿ\u0004\t\u0001þ\bþ\u0004\b\u0005û\u0004\t\u0002ý\bþ\u000b\u0001ý\u0004\t\u0003ü\u0004\t\u0004û\u0004\t\u0005ú\u0004\t\u0006ù\u0004\t\u0007ø\u000b\u0002ü\b\tø\u000b\u0003û\u0004\t\b÷\b\u0003þ\b\u0004ý\u0004\t\tö\b\u0005ü\u0004\t\u0007ø\u0004\nÿÿ\u000b\u0004ú\u000b\u0005ù\u0004\n\u0000þ\b\u000bö\u0004\n\u0001ý\u0004\n\u0002ü\u0004\n\u0003û\u0004\n\u0003û\u0004\nÿÿ\u000b\u0006ø\u000b\u0007÷\b\bù\b\tø\u0004\n\u0000þ\b\u0003þ\b\tø\u0004\n\u0004ú\u0004\n\u0005ù\u0004\n\u0006ø\u000b\bö\fþÿ\u0004\t\tö\u0004\n\u0007÷\fÿþ\u0004\n\bö\f\u0000ý\u0004\n\bö\u0004\u000bþÿ\u000b\u0001ý\u0004\u000bÿþ\t\bø\u0004\u000bÿþ\u0004\u000b\u0000ý\f\u0001ü\u0004\u000b\u0001ü\f\u0002û\u0004\u000b\u0001\u0004ð\u0014\u0005\u0001\u0012â$\u0001ú\bü\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾\u0018/\u0000\u0006\u0006ú\u0018îÐJ\u0002ø\u0006Å8\u000f\u0002ø\u0015\u0000\u0003ö\f\t½)\u0018\u0007ûó\u001cþ\u000eó\b\u0000\u0002\u0014úü\u0007þ\u0010\u0003ö\b\u0002\u0003ÿ\u0004\bý\u0004\tü\u000b\u0002ü\b\tø\u000b\u0003û\u0004\nû\b\u0005ü\u0004\u000bú\u0004\fù\b\u0002\u0005ý\u0010üý\b\tø\u0004\rø\b\u0003þ\b\tø\u0004\u000e÷\u0004\u000fö\u0004\u0007\u0002ÿ\u0004\u0007\u0003þ\b\u0005ü\b\u0002\u0006ü\u000füþ\u000fýý\u0004\u000bú\u0004\u0007\u0004ý\b\u0002\u0007û\u000b\u0005ù\u0004\u0007\u0005ü\b\u000bö\u0004\u0007\u0006û\u0004\u0007\u0007ú\u0004\u0007\bù\u0004\u0007\u0003þ\bþ\b\u0002\bú\u0004\bý\u0010úÿ\u0004\u0007\tø\u000b\u0003û\u0004\tü\u0004\u0007\n÷\u000b\u0001ý\u0004\u0007\u000bö\t\bø\u0004\u0007\u000bö\u0004\b\u0001ÿ\t\bø\u0004\b\u0002þ\u000b\u0001ý\u0004\b\u0002\u0010ù\u0011\u0000ýþÍJ\u0002ø\u0006Å)(úø\u0002õ\u000e\u000e\fó\u0007þ\bþ\u0004\bý\nü\u0004\tü\fú\rù\b\u0002ÿ\u0004\nû\u0004\u000bú\u0004\fù\u0004\rø\b\u0003þ\b\u0004ý\u0004\u000e÷\b\u0005ü\u0004\u000fö\u0004\u0007\u0002ÿ\b\u0006û\b\u0007ú\b\bù\b\tø\u0004\u0007\u0003þ\b\u000bö\u0004\u0007\u0004ý\u0004\u0007\u0005ü\u0004\u0007\u0006û\bþ\u0004\bý\t\u0001ÿ\u0004\tü\t\u0002þ\u0004\nû\u0004\u000bú\u0004\fù\u0004\rø\u0004\u0007\u0007ú\t\u0004ü\u0004\u0007\bù\t\u0005û\u0004\u0007\bô\u0014\u0004õê&\u0002üú\u0018îÐAø\u0010üÊ$\u0016\u000bþ\u0001\u0014þç$\u0001ú\bü\u0012\u0003ø\fù".getBytes("ISO-8859-1"), 0, bArr, 0, 2734);
        setContentView = bArr;
        unregisterForContextMenu = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256;
    }

    public static void registerForContextMenu() {
        isOpaque = (char) 7243;
        height = (char) 34340;
        setTime = (char) 42026;
        duration = '5';
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x012c. Please report as an issue. */
    public static /* synthetic */ long onOptionsItemSelected(registerForContextMenu registerforcontextmenu) throws Throwable {
        int i;
        values valuesVar = new values(registerforcontextmenu);
        byte[] bArr = setContentView;
        Object[] objArr = new Object[1];
        setContentView((byte) (bArr[713] - 1), 1868, 397, objArr);
        int i2 = 0;
        String str = (String) objArr[0];
        byte b = bArr[713];
        int i3 = unregisterForContextMenu;
        Object[] objArr2 = new Object[1];
        setContentView(b, (short) (i3 | 1842), 497, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            Object[] objArr4 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            byte b2 = bArr[31];
            Object[] objArr5 = new Object[1];
            setContentView(b2, (short) (b2 | 2276), (short) (i3 | 297), objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i4 = 0;
            while (i4 < objArr7.length) {
                try {
                    Object[] objArr8 = {objArr7[i4]};
                    byte[] bArr2 = setContentView;
                    Object[] objArr9 = new Object[1];
                    setContentView(bArr2[1], 2411, 481, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[i2]);
                    byte b3 = bArr2[22];
                    Object[] objArr10 = new Object[1];
                    int i5 = i2;
                    setContentView(b3, (short) (b3 | 845), 491, objArr10);
                    String str3 = (String) objArr10[i5];
                    Object[] objArr11 = new Object[1];
                    setContentView(bArr2[1], 1030, 482, objArr11);
                    Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr11[i5])).invoke(null, objArr8);
                    try {
                        Object[] objArr12 = new Object[1];
                        setContentView(bArr2[1], 2411, 481, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[i5]);
                        Object[] objArr13 = new Object[1];
                        setContentView(bArr2[67], 839, 490, objArr13);
                        iArr[i4] = ((Integer) cls3.getMethod((String) objArr13[i5], null).invoke(objInvoke, null)).intValue();
                        i4++;
                        i2 = i5;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            while (true) {
                int i6 = i2 + 1;
                switch (valuesVar.openContextMenu(iArr[i2])) {
                    case -15:
                        i2 = 7;
                        break;
                    case -14:
                        i2 = 30;
                        break;
                    case -13:
                        valuesVar.openContextMenu(18);
                        i2 = valuesVar.setContentView == 0 ? 29 : i6;
                        break;
                    case -12:
                        valuesVar.openContextMenu = 1;
                        valuesVar.openContextMenu(7);
                        valuesVar.openContextMenu(9);
                        decodeByteArray = valuesVar.setContentView;
                        break;
                    case -11:
                        i = sync;
                        valuesVar.openContextMenu = i;
                        valuesVar.openContextMenu(4);
                        break;
                    case -10:
                        i2 = 1;
                        break;
                    case -9:
                        i2 = 18;
                        break;
                    case -8:
                        valuesVar.openContextMenu(41);
                        if (valuesVar.setContentView == 0) {
                            i6 = 17;
                        }
                        break;
                    case -7:
                        valuesVar.openContextMenu = 1;
                        valuesVar.openContextMenu(7);
                        valuesVar.openContextMenu(9);
                        sync = valuesVar.setContentView;
                        break;
                    case -6:
                        i = decodeByteArray;
                        valuesVar.openContextMenu = i;
                        valuesVar.openContextMenu(4);
                        break;
                    case -5:
                        break;
                    case -4:
                        i2 = 9;
                        break;
                    case -3:
                        i2 = 19;
                        break;
                    case -2:
                        valuesVar.openContextMenu = 1;
                        valuesVar.openContextMenu(7);
                        valuesVar.openContextMenu(8);
                        valuesVar.registerForContextMenu = ((registerForContextMenu) valuesVar.width).Movie;
                        valuesVar.openContextMenu(29);
                        break;
                    case -1:
                        i2 = 4;
                        break;
                    default:
                        break;
                }
                valuesVar.openContextMenu(101);
                return valuesVar.unregisterForContextMenu;
            }
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }

    public static /* synthetic */ void registerForContextMenu(registerForContextMenu registerforcontextmenu, String str) throws Throwable {
        values valuesVar = new values(registerforcontextmenu, str);
        byte[] bArr = setContentView;
        Object[] objArr = new Object[1];
        setContentView((byte) (bArr[713] - 1), 2378, 398, objArr);
        int i = 0;
        String str2 = (String) objArr[0];
        byte b = bArr[713];
        int i2 = unregisterForContextMenu;
        Object[] objArr2 = new Object[1];
        setContentView(b, (short) (i2 | 1842), 497, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            Object[] objArr4 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            byte b2 = bArr[31];
            Object[] objArr5 = new Object[1];
            setContentView(b2, (short) (b2 | 2276), (short) (i2 | 297), objArr5);
            String str3 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            setContentView(bArr[1], 1030, 482, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str3, Class.forName((String) objArr6[0])).invoke(str2, objArr3);
            int[] iArr = new int[objArr7.length];
            int i3 = 0;
            while (i3 < objArr7.length) {
                try {
                    Object[] objArr8 = {objArr7[i3]};
                    byte[] bArr2 = setContentView;
                    Object[] objArr9 = new Object[1];
                    setContentView(bArr2[1], 2411, 481, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[i]);
                    byte b3 = bArr2[22];
                    int i4 = i;
                    Object[] objArr10 = new Object[1];
                    setContentView(b3, (short) (b3 | 845), 491, objArr10);
                    String str4 = (String) objArr10[i4];
                    Object[] objArr11 = new Object[1];
                    setContentView(bArr2[1], 1030, 482, objArr11);
                    Object objInvoke = cls2.getMethod(str4, Class.forName((String) objArr11[i4])).invoke(null, objArr8);
                    try {
                        Object[] objArr12 = new Object[1];
                        setContentView(bArr2[1], 2411, 481, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[i4]);
                        Object[] objArr13 = new Object[1];
                        setContentView(bArr2[67], 839, 490, objArr13);
                        iArr[i3] = ((Integer) cls3.getMethod((String) objArr13[i4], null).invoke(objInvoke, null)).intValue();
                        i3++;
                        i = i4;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            while (true) {
                int i5 = i + 1;
                switch (valuesVar.openContextMenu(iArr[i])) {
                    case -13:
                        i = 1;
                        continue;
                    case -12:
                        i = 31;
                        continue;
                    case -11:
                        valuesVar.openContextMenu(41);
                        if (valuesVar.setContentView == 0) {
                            i5 = 30;
                        }
                        break;
                    case -10:
                        i = 9;
                        continue;
                    case -9:
                        i = 20;
                        continue;
                    case -8:
                        valuesVar.openContextMenu(41);
                        if (valuesVar.setContentView == 0) {
                            i5 = 19;
                        }
                        break;
                    case -7:
                        valuesVar.openContextMenu = 1;
                        valuesVar.openContextMenu(7);
                        valuesVar.openContextMenu(9);
                        sync = valuesVar.setContentView;
                        break;
                    case -6:
                        valuesVar.openContextMenu = decodeByteArray;
                        valuesVar.openContextMenu(4);
                        break;
                    case -5:
                        return;
                    case -4:
                        i = 21;
                        continue;
                    case -3:
                        i = 11;
                        continue;
                    case -2:
                        valuesVar.openContextMenu = 2;
                        valuesVar.openContextMenu(7);
                        valuesVar.openContextMenu(8);
                        registerForContextMenu registerforcontextmenu2 = (registerForContextMenu) valuesVar.width;
                        valuesVar.openContextMenu(8);
                        registerforcontextmenu2.onOptionsItemSelected((String) valuesVar.width);
                        break;
                    case -1:
                        i = 5;
                        continue;
                }
                i = i5;
            }
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    private static void registerForContextMenu(String str, int i, Object[] objArr) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (decodeByteArray.setContentView) {
            try {
                char[] cArr2 = new char[cArr.length];
                decodeByteArray.registerForContextMenu = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i2 = decodeByteArray.registerForContextMenu;
                    if (i2 < cArr.length) {
                        cArr3[0] = cArr[i2];
                        cArr3[1] = cArr[i2 + 1];
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c = cArr3[1];
                            char c2 = cArr3[0];
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + height)) ^ ((c2 >>> 5) + setTime)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + isOpaque) ^ ((c3 + i3) ^ ((c3 << 4) + duration))));
                            i3 -= 40503;
                        }
                        int i5 = decodeByteArray.registerForContextMenu;
                        cArr2[i5] = cArr3[0];
                        cArr2[i5 + 1] = cArr3[1];
                        decodeByteArray.registerForContextMenu = i5 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str2;
    }
}
