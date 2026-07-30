package com.clevertap.android.pushsdk;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.guardsquare.dexguard.height;

/* JADX INFO: loaded from: classes.dex */
public final class setContentView {
    private static char[] Movie = null;
    public static final String onContextItemSelected;
    public static final int onOptionsItemSelected = 10003;
    public static final String openContextMenu;
    public static final String registerForContextMenu;
    public static final boolean setContentView = false;
    public static final String unregisterForContextMenu;
    private static int valueOf = 0;
    private static char values = 0;
    private static int width = 1;

    static {
        unregisterForContextMenu();
        Object[] objArr = new Object[1];
        setContentView(5 - KeyEvent.getDeadChar(0, 0), (byte) (ExpandableListView.getPackedPositionType(0L) + 123), "\u0018\u0005\u0018\u0004㘤", objArr);
        onContextItemSelected = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        setContentView((-16777142) - Color.rgb(0, 0, 0), (byte) (54 - TextUtils.getOffsetBefore("", 0)), "\u0001\u001c\b!\f\u001b\b\f\u001b\u0001\r\u0011\r\u001b\b\r\u0004\u000f\"\u0000\u0017\t\u0014\u001d\u0005\u0006\u0016\u0006\u001c\t\u0013\u0019\u0013\u0002\u0002\u0012\u000b\u0017\u0011\u0013#\u000f\u0017\t\u0016\u0006\u001c\t\u0013\u0019\u0013\u0002\u0010\u000e\u000b\u0004\u0010\u000b\u000e\u0019\u0017 \u0010\u0015\r#\u0017\u001b\u0004\u0018\u0001\u0003\u0004\u0018", objArr2);
        unregisterForContextMenu = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        setContentView(Color.rgb(0, 0, 0) + 16777223, (byte) (11 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0010\u0007\u0016\u0006\u0015\u0017㘊", objArr3);
        registerForContextMenu = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        setContentView(KeyEvent.getDeadChar(0, 0) + 29, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 72), "\u0011\u001d\u0018\u0002\u0006\u0017\t\u001c\u0007\u0010\u0014\u0015\u0002\u0001\u0017\u0002\f\u000e\u0015#\f\u0005\u0004\u001f\u0014\n\u0017\u0010㘺", objArr4);
        openContextMenu = ((String) objArr4[0]).intern();
        int i = width + 113;
        valueOf = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void setContentView(int i, byte b, String str, Object[] objArr) {
        int i2;
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (height.Movie) {
            try {
                char[] cArr2 = Movie;
                char c = values;
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr3[i2] = (char) (cArr[i2] - b);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    height.onOptionsItemSelected = 0;
                    while (true) {
                        int i3 = height.onOptionsItemSelected;
                        if (i3 >= i2) {
                            break;
                        }
                        height.unregisterForContextMenu = cArr[i3];
                        height.registerForContextMenu = cArr[height.onOptionsItemSelected + 1];
                        if (height.unregisterForContextMenu == height.registerForContextMenu) {
                            cArr3[height.onOptionsItemSelected] = (char) (height.unregisterForContextMenu - b);
                            cArr3[height.onOptionsItemSelected + 1] = (char) (height.registerForContextMenu - b);
                        } else {
                            height.setContentView = height.unregisterForContextMenu / c;
                            height.onContextItemSelected = height.unregisterForContextMenu % c;
                            height.openContextMenu = height.registerForContextMenu / c;
                            height.valueOf = height.registerForContextMenu % c;
                            if (height.onContextItemSelected == height.valueOf) {
                                height.setContentView = ((height.setContentView + c) - 1) % c;
                                height.openContextMenu = ((height.openContextMenu + c) - 1) % c;
                                int i4 = (height.setContentView * c) + height.onContextItemSelected;
                                int i5 = (height.openContextMenu * c) + height.valueOf;
                                int i6 = height.onOptionsItemSelected;
                                cArr3[i6] = cArr2[i4];
                                cArr3[i6 + 1] = cArr2[i5];
                            } else if (height.setContentView == height.openContextMenu) {
                                height.onContextItemSelected = ((height.onContextItemSelected + c) - 1) % c;
                                height.valueOf = ((height.valueOf + c) - 1) % c;
                                int i7 = (height.setContentView * c) + height.onContextItemSelected;
                                int i8 = (height.openContextMenu * c) + height.valueOf;
                                int i9 = height.onOptionsItemSelected;
                                cArr3[i9] = cArr2[i7];
                                cArr3[i9 + 1] = cArr2[i8];
                            } else {
                                int i10 = (height.setContentView * c) + height.valueOf;
                                int i11 = (height.openContextMenu * c) + height.onContextItemSelected;
                                int i12 = height.onOptionsItemSelected;
                                cArr3[i12] = cArr2[i10];
                                cArr3[i12 + 1] = cArr2[i11];
                            }
                        }
                        height.onOptionsItemSelected += 2;
                    }
                }
                for (int i13 = 0; i13 < i; i13++) {
                    cArr3[i13] = (char) (cArr3[i13] ^ 13722);
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str2;
    }

    public static void unregisterForContextMenu() {
        Movie = new char[]{13748, 13802, 13737, 13779, 13755, 13812, 13791, 13774, 13810, 13790, 13823, 13817, 13781, 13800, 13768, 13751, 13780, 13822, 13814, 13806, 13819, 13728, 13801, 13813, 13772, 13769, 13815, 13804, 13738, 13739, 13789, 13809, 13777, 13811, 13807, 13794};
        values = (char) 6;
    }
}
