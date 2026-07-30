package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.google.android.exoplayer2.C1894k;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ha1 {

    /* JADX INFO: renamed from: c */
    public static final ha1 f108456c = new ha1(new int[]{2}, 10);

    /* JADX INFO: renamed from: d */
    public static final ImmutableList<Integer> f108457d = ImmutableList.m15742of(2, 5, 6);

    /* JADX INFO: renamed from: e */
    public static final ImmutableMap<Integer, Integer> f108458e = new ImmutableMap.C2809b().mo15715g(5, 6).mo15715g(17, 6).mo15715g(7, 6).mo15715g(30, 10).mo15715g(18, 6).mo15715g(6, 8).mo15715g(8, 8).mo15715g(14, 8).mo15714d();

    /* JADX INFO: renamed from: a */
    public final int[] f108459a;

    /* JADX INFO: renamed from: b */
    public final int f108460b;

    /* JADX INFO: renamed from: l.ha1$a */
    @RequiresApi(23)
    public static final class C17429a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static final ImmutableSet<Integer> m134114a() {
            ImmutableSet.C2825a c2825aMo15830j = new ImmutableSet.C2825a().mo15830j(8, 7);
            int i = bmk0.f77313a;
            if (i >= 31) {
                c2825aMo15830j.mo15830j(26, 27);
            }
            if (i >= 33) {
                c2825aMo15830j.mo15737a(30);
            }
            return c2825aMo15830j.mo15834n();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static final boolean m134115b(Context context) {
            AudioDeviceInfo[] devices = ((AudioManager) w11.m204369e((AudioManager) context.getSystemService("audio"))).getDevices(2);
            ImmutableSet<Integer> immutableSetM134114a = m134114a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (immutableSetM134114a.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.ha1$b */
    @RequiresApi(29)
    public static final class C17430b {

        /* JADX INFO: renamed from: a */
        public static final AudioAttributes f108461a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        /* JADX WARN: Multi-variable type inference failed */
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static ImmutableList<Integer> m134116a() {
            ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
            gyj0 it = ha1.f108458e.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (bmk0.f77313a >= 34 || iIntValue != 30) {
                    if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), f108461a)) {
                        c2804aBuilder.mo15737a(num);
                    }
                }
            }
            c2804aBuilder.mo15737a(2);
            return c2804aBuilder.m15756m();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static int m134117b(int i, int i2) {
            for (int i3 = 10; i3 > 0; i3--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(bmk0.m105079H(i3)).build(), f108461a)) {
                    return i3;
                }
            }
            return 0;
        }
    }

    public ha1(@Nullable int[] iArr, int i) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f108459a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f108459a = new int[0];
        }
        this.f108460b = i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m134105b() {
        if (bmk0.f77313a < 17) {
            return false;
        }
        String str = bmk0.f77315c;
        return "Amazon".equals(str) || ThirdPushManager.VENDOR_TYPE_XIAOMI.equals(str);
    }

    /* JADX INFO: renamed from: c */
    public static ha1 m134106c(Context context) {
        return m134107d(context, jj5.m145018l(context, null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: d */
    public static ha1 m134107d(Context context, @Nullable Intent intent) {
        int i = bmk0.f77313a;
        if (i >= 23 && C17429a.m134115b(context)) {
            return f108456c;
        }
        ImmutableSet.C2825a c2825a = new ImmutableSet.C2825a();
        if (m134105b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            c2825a.mo15831k(f108457d);
        }
        if (i >= 29 && (bmk0.m105076F0(context) || bmk0.m105066A0(context))) {
            c2825a.mo15831k(C17430b.m134116a());
            return new ha1(Ints.m16524n(c2825a.mo15834n()), 10);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            ImmutableSet immutableSetMo15834n = c2825a.mo15834n();
            return !immutableSetMo15834n.isEmpty() ? new ha1(Ints.m16524n(immutableSetMo15834n), 10) : f108456c;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            c2825a.mo15831k(Ints.m16513c(intArrayExtra));
        }
        return new ha1(Ints.m16524n(c2825a.mo15834n()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
    }

    /* JADX INFO: renamed from: e */
    public static int m134108e(int i) {
        int i2 = bmk0.f77313a;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(bmk0.f77314b) && i == 1) {
            i = 2;
        }
        return bmk0.m105079H(i);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static Uri m134109g() {
        if (m134105b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static int m134110h(int i, int i2) {
        return bmk0.f77313a >= 29 ? C17430b.m134117b(i, i2) : ((Integer) w11.m204369e(f108458e.getOrDefault(Integer.valueOf(i), 0))).intValue();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha1)) {
            return false;
        }
        ha1 ha1Var = (ha1) obj;
        return Arrays.equals(this.f108459a, ha1Var.f108459a) && this.f108460b == ha1Var.f108460b;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public Pair<Integer, Integer> m134111f(C1894k c1894k) {
        int iM149005f = kb00.m149005f((String) w11.m204369e(c1894k.f7785l), c1894k.f7782i);
        if (!f108458e.containsKey(Integer.valueOf(iM149005f))) {
            return null;
        }
        if (iM149005f == 18 && !m134113j(18)) {
            iM149005f = 6;
        } else if ((iM149005f == 8 && !m134113j(8)) || (iM149005f == 30 && !m134113j(30))) {
            iM149005f = 7;
        }
        if (!m134113j(iM149005f)) {
            return null;
        }
        int iM134110h = c1894k.f7798y;
        if (iM134110h == -1 || iM149005f == 18) {
            int i = c1894k.f7799z;
            if (i == -1) {
                i = 48000;
            }
            iM134110h = m134110h(iM149005f, i);
        } else if (c1894k.f7785l.equals("audio/vnd.dts.uhd;profile=p2")) {
            if (iM134110h > 10) {
                return null;
            }
        } else if (iM134110h > this.f108460b) {
            return null;
        }
        int iM134108e = m134108e(iM134110h);
        if (iM134108e == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iM149005f), Integer.valueOf(iM134108e));
    }

    public int hashCode() {
        return this.f108460b + (Arrays.hashCode(this.f108459a) * 31);
    }

    /* JADX INFO: renamed from: i */
    public boolean m134112i(C1894k c1894k) {
        return m134111f(c1894k) != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m134113j(int i) {
        return Arrays.binarySearch(this.f108459a, i) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f108460b + ", supportedEncodings=" + Arrays.toString(this.f108459a) + Constants.AES_SUFFIX;
    }
}
