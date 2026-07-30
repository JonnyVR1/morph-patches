package p153l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.InterfaceC2089x;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.C1848h;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.InterfaceC1843c;
import com.google.android.exoplayer2.mediacodec.C1906b;
import com.google.android.exoplayer2.mediacodec.InterfaceC1907c;
import com.google.android.exoplayer2.mediacodec.InterfaceC1909e;
import com.google.android.exoplayer2.metadata.C1912a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class vrd implements lzc0 {

    /* JADX INFO: renamed from: a */
    public final Context f185446a;

    /* JADX INFO: renamed from: e */
    public boolean f185450e;

    /* JADX INFO: renamed from: g */
    public boolean f185452g;

    /* JADX INFO: renamed from: h */
    public boolean f185453h;

    /* JADX INFO: renamed from: i */
    public boolean f185454i;

    /* JADX INFO: renamed from: b */
    public final C1906b f185447b = new C1906b();

    /* JADX INFO: renamed from: c */
    public int f185448c = 0;

    /* JADX INFO: renamed from: d */
    public long f185449d = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;

    /* JADX INFO: renamed from: f */
    public InterfaceC1909e f185451f = InterfaceC1909e.f7947a;

    public vrd(Context context) {
        this.f185446a = context;
    }

    @Override // p153l.lzc0
    /* JADX INFO: renamed from: a */
    public InterfaceC2089x[] mo156429a(Handler handler, wjl0 wjl0Var, InterfaceC1843c interfaceC1843c, asi0 asi0Var, ga00 ga00Var) {
        Handler handler2;
        ArrayList<InterfaceC2089x> arrayList = new ArrayList<>();
        m202488h(this.f185446a, this.f185448c, this.f185451f, this.f185450e, handler, wjl0Var, this.f185449d, arrayList);
        AudioSink audioSinkM202483c = m202483c(this.f185446a, this.f185452g, this.f185453h, this.f185454i);
        if (audioSinkM202483c != null) {
            handler2 = handler;
            m202482b(this.f185446a, this.f185448c, this.f185451f, this.f185450e, audioSinkM202483c, handler2, interfaceC1843c, arrayList);
        } else {
            handler2 = handler;
        }
        m202487g(this.f185446a, asi0Var, handler2.getLooper(), this.f185448c, arrayList);
        m202485e(this.f185446a, ga00Var, handler2.getLooper(), this.f185448c, arrayList);
        m202484d(this.f185446a, this.f185448c, arrayList);
        m202486f(this.f185446a, handler2, this.f185448c, arrayList);
        return (InterfaceC2089x[]) arrayList.toArray(new InterfaceC2089x[0]);
    }

    /* JADX INFO: renamed from: b */
    public void m202482b(Context context, int i, InterfaceC1909e interfaceC1909e, boolean z, AudioSink audioSink, Handler handler, InterfaceC1843c interfaceC1843c, ArrayList<InterfaceC2089x> arrayList) {
        int i2;
        int i3;
        int i4;
        arrayList.add(new C1848h(context, m202489i(), interfaceC1909e, z, handler, interfaceC1843c, audioSink));
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
                    arrayList.add(size, (InterfaceC2089x) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
                    kyv.m152148f("DefaultRenderersFactory", "Loaded MidiRenderer.");
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
                        arrayList.add(i2, (InterfaceC2089x) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, InterfaceC1843c.class, AudioSink.class).newInstance(handler, interfaceC1843c, audioSink));
                        kyv.m152148f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i2 = i3;
                        i3 = i2;
                    }
                } catch (Exception e) {
                    vtq0.m202761a("Error instantiating Opus extension", e);
                    return;
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                try {
                    i4 = i3 + 1;
                    try {
                        arrayList.add(i3, (InterfaceC2089x) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, InterfaceC1843c.class, AudioSink.class).newInstance(handler, interfaceC1843c, audioSink));
                        kyv.m152148f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused5) {
                        i3 = i4;
                        i4 = i3;
                    }
                } catch (ClassNotFoundException unused6) {
                }
                try {
                    arrayList.add(i4, (InterfaceC2089x) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, InterfaceC1843c.class, AudioSink.class).newInstance(handler, interfaceC1843c, audioSink));
                    kyv.m152148f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused7) {
                } catch (Exception e2) {
                    vtq0.m202761a("Error instantiating FFmpeg extension", e2);
                }
            } catch (Exception e3) {
                vtq0.m202761a("Error instantiating FLAC extension", e3);
            }
        } catch (Exception e4) {
            vtq0.m202761a("Error instantiating MIDI extension", e4);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public AudioSink m202483c(Context context, boolean z, boolean z2, boolean z3) {
        return new DefaultAudioSink.C1834f(context).m9557i(z).m9556h(z2).m9558j(z3 ? 1 : 0).m9555g();
    }

    /* JADX INFO: renamed from: d */
    public void m202484d(Context context, int i, ArrayList<InterfaceC2089x> arrayList) {
        arrayList.add(new hb4());
    }

    /* JADX INFO: renamed from: e */
    public void m202485e(Context context, ga00 ga00Var, Looper looper, int i, ArrayList<InterfaceC2089x> arrayList) {
        arrayList.add(new C1912a(ga00Var, looper));
    }

    /* JADX INFO: renamed from: g */
    public void m202487g(Context context, asi0 asi0Var, Looper looper, int i, ArrayList<InterfaceC2089x> arrayList) {
        arrayList.add(new esi0(asi0Var, looper));
    }

    /* JADX INFO: renamed from: h */
    public void m202488h(Context context, int i, InterfaceC1909e interfaceC1909e, boolean z, Handler handler, wjl0 wjl0Var, long j, ArrayList<InterfaceC2089x> arrayList) {
        String str;
        Integer num;
        int i2;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        arrayList.add(new xrx(context, m202489i(), interfaceC1909e, j, z, handler, wjl0Var, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                Constructor<?> constructor = Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, wjl0.class, cls);
                num = 50;
                try {
                    i2 = size + 1;
                    try {
                        arrayList.add(size, (InterfaceC2089x) constructor.newInstance(Long.valueOf(j), handler, wjl0Var, 50));
                        str = "DefaultRenderersFactory";
                        try {
                            kyv.m152148f(str, "Loaded LibvpxVideoRenderer.");
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
                arrayList.add(i2, (InterfaceC2089x) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, wjl0.class, cls).newInstance(Long.valueOf(j), handler, wjl0Var, num));
                kyv.m152148f(str, "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e) {
                vtq0.m202761a("Error instantiating AV1 extension", e);
            }
        } catch (Exception e2) {
            vtq0.m202761a("Error instantiating VP9 extension", e2);
        }
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC1907c.b m202489i() {
        return this.f185447b;
    }

    /* JADX INFO: renamed from: f */
    public void m202486f(Context context, Handler handler, int i, ArrayList<InterfaceC2089x> arrayList) {
    }
}
