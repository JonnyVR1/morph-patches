package p149l;

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
import com.google.android.exoplayer2.C1871k;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class aa1 {

    /* JADX INFO: renamed from: c */
    public static final aa1 f68258c = new aa1(new int[]{2}, 10);

    /* JADX INFO: renamed from: d */
    public static final ImmutableList<Integer> f68259d = ImmutableList.m15688of(2, 5, 6);

    /* JADX INFO: renamed from: e */
    public static final ImmutableMap<Integer, Integer> f68260e = new ImmutableMap.C2786b().mo15661g(5, 6).mo15661g(17, 6).mo15661g(7, 6).mo15661g(30, 10).mo15661g(18, 6).mo15661g(6, 8).mo15661g(8, 8).mo15661g(14, 8).mo15660d();

    /* JADX INFO: renamed from: a */
    public final int[] f68261a;

    /* JADX INFO: renamed from: b */
    public final int f68262b;

    /* JADX INFO: renamed from: l.aa1$a */
    @RequiresApi(23)
    public static final class C15552a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static final ImmutableSet<Integer> m95511a() {
            ImmutableSet.C2802a c2802aMo15776j = new ImmutableSet.C2802a().mo15776j(8, 7);
            int i = vck0.f180948a;
            if (i >= 31) {
                c2802aMo15776j.mo15776j(26, 27);
            }
            if (i >= 33) {
                c2802aMo15776j.mo15683a(30);
            }
            return c2802aMo15776j.mo15780n();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static final boolean m95512b(Context context) {
            AudioDeviceInfo[] devices = ((AudioManager) p11.m167011e((AudioManager) context.getSystemService("audio"))).getDevices(2);
            ImmutableSet<Integer> immutableSetM95511a = m95511a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (immutableSetM95511a.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.aa1$b */
    @RequiresApi(29)
    public static final class C15553b {

        /* JADX INFO: renamed from: a */
        public static final AudioAttributes f68263a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        /* JADX WARN: Multi-variable type inference failed */
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static ImmutableList<Integer> m95513a() {
            ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
            dpj0 it = aa1.f68260e.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (vck0.f180948a >= 34 || iIntValue != 30) {
                    if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), f68263a)) {
                        c2781aBuilder.mo15683a(num);
                    }
                }
            }
            c2781aBuilder.mo15683a(2);
            return c2781aBuilder.m15702m();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static int m95514b(int i, int i2) {
            for (int i3 = 10; i3 > 0; i3--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(vck0.m197801H(i3)).build(), f68263a)) {
                    return i3;
                }
            }
            return 0;
        }
    }

    public aa1(@Nullable int[] iArr, int i) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f68261a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f68261a = new int[0];
        }
        this.f68262b = i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m95502b() {
        if (vck0.f180948a < 17) {
            return false;
        }
        String str = vck0.f180950c;
        return "Amazon".equals(str) || ThirdPushManager.VENDOR_TYPE_XIAOMI.equals(str);
    }

    /* JADX INFO: renamed from: c */
    public static aa1 m95503c(Context context) {
        return m95504d(context, ii5.m136342l(context, null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: d */
    public static aa1 m95504d(Context context, @Nullable Intent intent) {
        int i = vck0.f180948a;
        if (i >= 23 && C15552a.m95512b(context)) {
            return f68258c;
        }
        ImmutableSet.C2802a c2802a = new ImmutableSet.C2802a();
        if (m95502b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            c2802a.mo15777k(f68259d);
        }
        if (i >= 29 && (vck0.m197798F0(context) || vck0.m197788A0(context))) {
            c2802a.mo15777k(C15553b.m95513a());
            return new aa1(Ints.m16469n(c2802a.mo15780n()), 10);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            ImmutableSet immutableSetMo15780n = c2802a.mo15780n();
            return !immutableSetMo15780n.isEmpty() ? new aa1(Ints.m16469n(immutableSetMo15780n), 10) : f68258c;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            c2802a.mo15777k(Ints.m16458c(intArrayExtra));
        }
        return new aa1(Ints.m16469n(c2802a.mo15780n()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
    }

    /* JADX INFO: renamed from: e */
    public static int m95505e(int i) {
        int i2 = vck0.f180948a;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(vck0.f180949b) && i == 1) {
            i = 2;
        }
        return vck0.m197801H(i);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static Uri m95506g() {
        if (m95502b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static int m95507h(int i, int i2) {
        return vck0.f180948a >= 29 ? C15553b.m95514b(i, i2) : ((Integer) p11.m167011e(f68260e.getOrDefault(Integer.valueOf(i), 0))).intValue();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa1)) {
            return false;
        }
        aa1 aa1Var = (aa1) obj;
        return Arrays.equals(this.f68261a, aa1Var.f68261a) && this.f68262b == aa1Var.f68262b;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public Pair<Integer, Integer> m95508f(C1871k c1871k) {
        int iM157524f = n200.m157524f((String) p11.m167011e(c1871k.f7748l), c1871k.f7745i);
        if (!f68260e.containsKey(Integer.valueOf(iM157524f))) {
            return null;
        }
        if (iM157524f == 18 && !m95510j(18)) {
            iM157524f = 6;
        } else if ((iM157524f == 8 && !m95510j(8)) || (iM157524f == 30 && !m95510j(30))) {
            iM157524f = 7;
        }
        if (!m95510j(iM157524f)) {
            return null;
        }
        int iM95507h = c1871k.f7761y;
        if (iM95507h == -1 || iM157524f == 18) {
            int i = c1871k.f7762z;
            if (i == -1) {
                i = 48000;
            }
            iM95507h = m95507h(iM157524f, i);
        } else if (c1871k.f7748l.equals("audio/vnd.dts.uhd;profile=p2")) {
            if (iM95507h > 10) {
                return null;
            }
        } else if (iM95507h > this.f68262b) {
            return null;
        }
        int iM95505e = m95505e(iM95507h);
        if (iM95505e == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iM157524f), Integer.valueOf(iM95505e));
    }

    public int hashCode() {
        return this.f68262b + (Arrays.hashCode(this.f68261a) * 31);
    }

    /* JADX INFO: renamed from: i */
    public boolean m95509i(C1871k c1871k) {
        return m95508f(c1871k) != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m95510j(int i) {
        return Arrays.binarySearch(this.f68261a, i) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f68262b + ", supportedEncodings=" + Arrays.toString(this.f68261a) + Constants.AES_SUFFIX;
    }
}
