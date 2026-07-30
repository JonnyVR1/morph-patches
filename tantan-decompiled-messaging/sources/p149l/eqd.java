package p149l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.InterfaceC2066x;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.C1825h;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.InterfaceC1820c;
import com.google.android.exoplayer2.mediacodec.C1883b;
import com.google.android.exoplayer2.mediacodec.InterfaceC1884c;
import com.google.android.exoplayer2.mediacodec.InterfaceC1886e;
import com.google.android.exoplayer2.metadata.C1889a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class eqd implements grc0 {

    /* JADX INFO: renamed from: a */
    public final Context f92768a;

    /* JADX INFO: renamed from: e */
    public boolean f92772e;

    /* JADX INFO: renamed from: g */
    public boolean f92774g;

    /* JADX INFO: renamed from: h */
    public boolean f92775h;

    /* JADX INFO: renamed from: i */
    public boolean f92776i;

    /* JADX INFO: renamed from: b */
    public final C1883b f92769b = new C1883b();

    /* JADX INFO: renamed from: c */
    public int f92770c = 0;

    /* JADX INFO: renamed from: d */
    public long f92771d = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;

    /* JADX INFO: renamed from: f */
    public InterfaceC1886e f92773f = InterfaceC1886e.f7910a;

    public eqd(Context context) {
        this.f92768a = context;
    }

    @Override // p149l.grc0
    /* JADX INFO: renamed from: a */
    public InterfaceC2066x[] mo117709a(Handler handler, sal0 sal0Var, InterfaceC1820c interfaceC1820c, aji0 aji0Var, j100 j100Var) {
        Handler handler2;
        ArrayList<InterfaceC2066x> arrayList = new ArrayList<>();
        m117716h(this.f92768a, this.f92770c, this.f92773f, this.f92772e, handler, sal0Var, this.f92771d, arrayList);
        AudioSink audioSinkM117711c = m117711c(this.f92768a, this.f92774g, this.f92775h, this.f92776i);
        if (audioSinkM117711c != null) {
            handler2 = handler;
            m117710b(this.f92768a, this.f92770c, this.f92773f, this.f92772e, audioSinkM117711c, handler2, interfaceC1820c, arrayList);
        } else {
            handler2 = handler;
        }
        m117715g(this.f92768a, aji0Var, handler2.getLooper(), this.f92770c, arrayList);
        m117713e(this.f92768a, j100Var, handler2.getLooper(), this.f92770c, arrayList);
        m117712d(this.f92768a, this.f92770c, arrayList);
        m117714f(this.f92768a, handler2, this.f92770c, arrayList);
        return (InterfaceC2066x[]) arrayList.toArray(new InterfaceC2066x[0]);
    }

    /* JADX INFO: renamed from: b */
    public void m117710b(Context context, int i, InterfaceC1886e interfaceC1886e, boolean z, AudioSink audioSink, Handler handler, InterfaceC1820c interfaceC1820c, ArrayList<InterfaceC2066x> arrayList) {
        int i2;
        int i3;
        int i4;
        arrayList.add(new C1825h(context, m117717i(), interfaceC1886e, z, handler, interfaceC1820c, audioSink));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (InterfaceC2066x) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
                    jwv.m143686f("DefaultRenderersFactory", "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                try {
                    i3 = i2 + 1;
                    try {
                        arrayList.add(i2, (InterfaceC2066x) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC1820c.class, AudioSink.class).newInstance(handler, interfaceC1820c, audioSink));
                        jwv.m143686f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i2 = i3;
                        i3 = i2;
                    }
                } catch (Exception e) {
                    pkq0.m170054a("Error instantiating Opus extension", e);
                    return;
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                try {
                    i4 = i3 + 1;
                    try {
                        arrayList.add(i3, (InterfaceC2066x) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC1820c.class, AudioSink.class).newInstance(handler, interfaceC1820c, audioSink));
                        jwv.m143686f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused5) {
                        i3 = i4;
                        i4 = i3;
                    }
                } catch (ClassNotFoundException unused6) {
                }
                try {
                    arrayList.add(i4, (InterfaceC2066x) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC1820c.class, AudioSink.class).newInstance(handler, interfaceC1820c, audioSink));
                    jwv.m143686f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused7) {
                } catch (Exception e2) {
                    pkq0.m170054a("Error instantiating FFmpeg extension", e2);
                }
            } catch (Exception e3) {
                pkq0.m170054a("Error instantiating FLAC extension", e3);
            }
        } catch (Exception e4) {
            pkq0.m170054a("Error instantiating MIDI extension", e4);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public AudioSink m117711c(Context context, boolean z, boolean z2, boolean z3) {
        return new DefaultAudioSink.C1811f(context).m9503i(z).m9502h(z2).m9504j(z3 ? 1 : 0).m9501g();
    }

    /* JADX INFO: renamed from: d */
    public void m117712d(Context context, int i, ArrayList<InterfaceC2066x> arrayList) {
        arrayList.add(new ia4());
    }

    /* JADX INFO: renamed from: e */
    public void m117713e(Context context, j100 j100Var, Looper looper, int i, ArrayList<InterfaceC2066x> arrayList) {
        arrayList.add(new C1889a(j100Var, looper));
    }

    /* JADX INFO: renamed from: g */
    public void m117715g(Context context, aji0 aji0Var, Looper looper, int i, ArrayList<InterfaceC2066x> arrayList) {
        arrayList.add(new eji0(aji0Var, looper));
    }

    /* JADX INFO: renamed from: h */
    public void m117716h(Context context, int i, InterfaceC1886e interfaceC1886e, boolean z, Handler handler, sal0 sal0Var, long j, ArrayList<InterfaceC2066x> arrayList) {
        String str;
        Integer num;
        int i2;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        arrayList.add(new ajx(context, m117717i(), interfaceC1886e, j, z, handler, sal0Var, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                Constructor<?> constructor = Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, sal0.class, cls);
                num = 50;
                try {
                    i2 = size + 1;
                    try {
                        arrayList.add(size, (InterfaceC2066x) constructor.newInstance(Long.valueOf(j), handler, sal0Var, 50));
                        str = "DefaultRenderersFactory";
                        try {
                            jwv.m143686f(str, "Loaded LibvpxVideoRenderer.");
                        } catch (ClassNotFoundException unused) {
                            size = i2;
                            i2 = size;
                        }
                    } catch (ClassNotFoundException unused2) {
                        str = "DefaultRenderersFactory";
                    }
                } catch (ClassNotFoundException unused3) {
                    str = "DefaultRenderersFactory";
                }
            } catch (ClassNotFoundException unused4) {
                str = "DefaultRenderersFactory";
                num = 50;
            }
            try {
                arrayList.add(i2, (InterfaceC2066x) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, sal0.class, cls).newInstance(Long.valueOf(j), handler, sal0Var, num));
                jwv.m143686f(str, "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e) {
                pkq0.m170054a("Error instantiating AV1 extension", e);
            }
        } catch (Exception e2) {
            pkq0.m170054a("Error instantiating VP9 extension", e2);
        }
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC1884c.b m117717i() {
        return this.f92769b;
    }

    /* JADX INFO: renamed from: f */
    public void m117714f(Context context, Handler handler, int i, ArrayList<InterfaceC2066x> arrayList) {
    }
}
