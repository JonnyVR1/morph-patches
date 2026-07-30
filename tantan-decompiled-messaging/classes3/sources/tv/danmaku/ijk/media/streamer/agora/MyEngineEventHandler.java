package tv.danmaku.ijk.media.streamer.agora;

import android.content.Context;
import android.util.Log;
import com.immomo.mediacore.audio.AudioVolumeWeight;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.immomo.mediacore.coninf.MRtcAudioHandlerEx;
import com.immomo.mediacore.coninf.MRtcChannelHandler;
import com.immomo.mediacore.coninf.MRtcEventHandler;
import io.agora.rtc2.IRtcEngineEventHandler;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l.ley;
import tv.danmaku.ijk.media.sink.AgoraWriter;
import tv.danmaku.ijk.media.streamer.StreamProducer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MyEngineEventHandler {

    /* JADX INFO: renamed from: a */
    private StreamProducer f12464a;

    /* JADX INFO: renamed from: b */
    private IRtcEngineEventHandler.RtcStats f12465b;

    /* JADX INFO: renamed from: c */
    private IRtcEngineEventHandler.LocalVideoStats f12466c;

    /* JADX INFO: renamed from: d */
    private IRtcEngineEventHandler.RemoteVideoStats f12467d;

    /* JADX INFO: renamed from: e */
    private MRtcAudioHandler f12468e;

    /* JADX INFO: renamed from: f */
    private MRtcAudioHandlerEx f12469f;

    /* JADX INFO: renamed from: g */
    private MRtcChannelHandler f12470g;

    /* JADX INFO: renamed from: j */
    private boolean f12473j;

    /* JADX INFO: renamed from: k */
    private boolean f12474k;

    /* JADX INFO: renamed from: p */
    private AgoraWriter f12479p;

    /* JADX INFO: renamed from: s */
    private EngineConfig f12482s;

    /* JADX INFO: renamed from: t */
    private Context f12483t;

    /* JADX INFO: renamed from: h */
    private int f12471h = 0;

    /* JADX INFO: renamed from: i */
    private int f12472i = 0;

    /* JADX INFO: renamed from: l */
    private boolean f12475l = false;

    /* JADX INFO: renamed from: m */
    private boolean f12476m = false;

    /* JADX INFO: renamed from: n */
    private long f12477n = 0;

    /* JADX INFO: renamed from: o */
    private long f12478o = 0;

    /* JADX INFO: renamed from: q */
    private IRtcEngineEventHandler.AudioVolumeInfo[] f12480q = null;

    /* JADX INFO: renamed from: r */
    private ConcurrentHashMap<Long, ley> f12481r = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: u */
    private final ConcurrentHashMap<MRtcEventHandler, Integer> f12484u = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: v */
    public IRtcEngineEventHandler f12485v = new IRtcEngineEventHandler() { // from class: tv.danmaku.ijk.media.streamer.agora.MyEngineEventHandler.1
        public void onAudioMixingFinished() {
            Iterator it = MyEngineEventHandler.this.f12484u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onAudioMixingFinished();
            }
        }

        public void onAudioQuality(int i, int i2, short s, short s2) {
            ley leyVar = (ley) MyEngineEventHandler.this.f12481r.get(Long.valueOf(i));
            if (leyVar != null) {
                leyVar.j(s, s2);
            }
        }

        public void onAudioVolumeIndication(IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i) {
            StringBuilder sb = new StringBuilder("onAudioVolumeIndication:speakers.length=");
            sb.append(audioVolumeInfoArr.length);
            sb.append(";totalVolume=");
            sb.append(i);
            sb.append(",getMuteStatus=");
            sb.append(MyEngineEventHandler.this.f12479p.getMuteStatus());
            sb.append(";getUserID=");
            sb.append(MyEngineEventHandler.this.f12479p.getUserID());
            sb.append(";");
            int i2 = 0;
            sb.append(audioVolumeInfoArr[0].uid);
            sb.append(":");
            sb.append(audioVolumeInfoArr[0].volume);
            Log.e("test", sb.toString());
            int i3 = audioVolumeInfoArr[0].uid;
            if (i3 != 0 && i3 != MyEngineEventHandler.this.f12479p.getUserID() && audioVolumeInfoArr.length > 0) {
                MyEngineEventHandler.this.f12480q = audioVolumeInfoArr;
                if (MyEngineEventHandler.this.f12469f != null) {
                    AudioVolumeWeight[] audioVolumeWeightArr = new AudioVolumeWeight[audioVolumeInfoArr.length];
                    for (int i4 = 0; i4 < audioVolumeInfoArr.length; i4++) {
                        AudioVolumeWeight audioVolumeWeight = new AudioVolumeWeight();
                        audioVolumeWeight.uid = MyEngineEventHandler.this.f12480q[i4].uid;
                        audioVolumeWeight.volume = (MyEngineEventHandler.this.f12480q[i4].volume * 1.0f) / 255.0f;
                        audioVolumeWeightArr[i4] = audioVolumeWeight;
                    }
                    MyEngineEventHandler.this.f12469f.onAudioVolumeIndication(audioVolumeWeightArr, i);
                }
                if (!MyEngineEventHandler.this.f12479p.getMuteStatus()) {
                    return;
                }
            } else if (MyEngineEventHandler.this.f12469f != null) {
                AudioVolumeWeight audioVolumeWeight2 = new AudioVolumeWeight();
                audioVolumeWeight2.uid = (int) MyEngineEventHandler.this.f12479p.getUserID();
                if (MyEngineEventHandler.this.f12479p.getMuteStatus()) {
                    audioVolumeWeight2.volume = 0.0f;
                } else {
                    audioVolumeWeight2.volume = (audioVolumeInfoArr[0].volume * 1.0f) / 255.0f;
                }
                MyEngineEventHandler.this.f12469f.onAudioVolumeIndication(new AudioVolumeWeight[]{audioVolumeWeight2}, i);
            }
            int length = MyEngineEventHandler.this.f12480q != null ? MyEngineEventHandler.this.f12480q.length + 1 : 1;
            AudioVolumeWeight[] audioVolumeWeightArr2 = new AudioVolumeWeight[length];
            AudioVolumeWeight audioVolumeWeight3 = new AudioVolumeWeight();
            audioVolumeWeight3.uid = (int) MyEngineEventHandler.this.f12479p.getUserID();
            if (MyEngineEventHandler.this.f12479p.getMuteStatus()) {
                audioVolumeWeight3.volume = 0.0f;
            } else {
                audioVolumeWeight3.volume = (audioVolumeInfoArr[0].volume * 1.0f) / 255.0f;
            }
            audioVolumeWeightArr2[0] = audioVolumeWeight3;
            while (i2 < length - 1) {
                AudioVolumeWeight audioVolumeWeight4 = new AudioVolumeWeight();
                audioVolumeWeight4.uid = MyEngineEventHandler.this.f12480q[i2].uid;
                audioVolumeWeight4.volume = (MyEngineEventHandler.this.f12480q[i2].volume * 1.0f) / 255.0f;
                i2++;
                audioVolumeWeightArr2[i2] = audioVolumeWeight4;
            }
            if (MyEngineEventHandler.this.f12468e != null) {
                MyEngineEventHandler.this.f12468e.onAudioVolumeIndication(audioVolumeWeightArr2, i);
            }
        }

        public void onConnectionInterrupted() {
        }

        public void onConnectionLost() {
            Iterator it = MyEngineEventHandler.this.f12484u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onConnectionLost();
            }
        }

        public void onError(int i) {
            Log.e("RtcEventHander", "onError" + i);
            if (i == 17 || i == 18 || i == 1603 || i == 1 || i == 109 || i == 110) {
                return;
            }
            Iterator it = MyEngineEventHandler.this.f12484u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onError(i);
            }
        }

        public void onFirstRemoteVideoDecoded(int i, int i2, int i3, int i4) {
            Iterator it = MyEngineEventHandler.this.f12484u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onFirstRemoteVideoDecoded(i, i2, i3, i4);
            }
        }

        public void onJoinChannelSuccess(String str, int i, int i2) {
            Iterator it = MyEngineEventHandler.this.f12484u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onJoinChannelSuccess(str, i, i2);
            }
        }

        public void onLastmileQuality(int i) {
            MyEngineEventHandler.this.f12464a.notify(108, i, 0, null);
        }

        public void onLeaveChannel(IRtcEngineEventHandler.RtcStats rtcStats) {
        }

        public void onMediaEngineLoadSuccess() {
            Log.e("myEngineEventHandler", "onMediaEngineLoadSuccess");
            MyEngineEventHandler.this.f12479p.m10652D();
        }

        public void onRejoinChannelSuccess(String str, int i, int i2) {
        }

        public void onRemoteVideoStats(IRtcEngineEventHandler.RemoteVideoStats remoteVideoStats) {
            MyEngineEventHandler.this.f12467d = remoteVideoStats;
            ley leyVar = (ley) MyEngineEventHandler.this.f12481r.get(Long.valueOf(remoteVideoStats.uid));
            if (leyVar != null) {
                leyVar.k(remoteVideoStats.receivedBitrate, remoteVideoStats.rendererOutputFrameRate, remoteVideoStats.width, remoteVideoStats.height);
            }
        }

        public void onRequestToken() {
            if (MyEngineEventHandler.this.f12470g != null) {
                MyEngineEventHandler.this.f12470g.onRequestChannelKey();
            }
        }

        public void onRtcStats(IRtcEngineEventHandler.RtcStats rtcStats) {
            MyEngineEventHandler.this.f12465b = rtcStats;
            MyEngineEventHandler.this.f12477n += (long) ((MyEngineEventHandler.this.f12465b.txVideoKBitRate * 2) / 8);
            MyEngineEventHandler.this.f12478o += (long) ((MyEngineEventHandler.this.f12465b.txAudioKBitRate * 2) / 8);
            MyEngineEventHandler.this.f12464a.notify(109, 0, 0, rtcStats);
        }

        public void onUserJoined(int i, int i2) {
            long j = i;
            MyEngineEventHandler.this.f12481r.put(Long.valueOf(j), new ley(j));
            Iterator it = MyEngineEventHandler.this.f12484u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onJoinChannelSuccess("", j, i2);
            }
        }

        public void onUserMuteAudio(int i, boolean z) {
            Iterator it = MyEngineEventHandler.this.f12484u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onUserMuteAudio(i, z);
            }
        }

        public void onUserMuteVideo(int i, boolean z) {
            ley leyVar = (ley) MyEngineEventHandler.this.f12481r.get(Long.valueOf(i));
            if (leyVar != null) {
                leyVar.h(z);
            }
            Iterator it = MyEngineEventHandler.this.f12484u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onUserMuteVideo(i, z);
            }
        }

        public void onUserOffline(int i, int i2) {
            if (MyEngineEventHandler.this.f12481r != null) {
                long j = i;
                if (MyEngineEventHandler.this.f12481r.containsKey(Long.valueOf(j))) {
                    MyEngineEventHandler.this.f12481r.remove(Long.valueOf(j));
                }
            }
            Iterator it = MyEngineEventHandler.this.f12484u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onUserOffline(i, i2);
            }
        }
    };

    public MyEngineEventHandler(Context context, EngineConfig engineConfig, AgoraWriter agoraWriter, StreamProducer streamProducer) {
        this.f12473j = false;
        this.f12474k = true;
        this.f12482s = null;
        this.f12483t = null;
        this.f12483t = context;
        this.f12482s = engineConfig;
        this.f12479p = agoraWriter;
        this.f12464a = streamProducer;
        this.f12473j = false;
        this.f12474k = true;
    }

    /* JADX INFO: renamed from: A */
    public void m11287A() {
        this.f12483t = null;
        this.f12482s = null;
        this.f12479p = null;
        this.f12464a = null;
        this.f12485v = null;
        ConcurrentHashMap<MRtcEventHandler, Integer> concurrentHashMap = this.f12484u;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m11288B(MRtcEventHandler mRtcEventHandler) {
        ConcurrentHashMap<MRtcEventHandler, Integer> concurrentHashMap = this.f12484u;
        if (concurrentHashMap == null || mRtcEventHandler == null || !concurrentHashMap.contains(mRtcEventHandler)) {
            return;
        }
        this.f12484u.remove(mRtcEventHandler);
    }

    /* JADX INFO: renamed from: q */
    public void m11289q(MRtcEventHandler mRtcEventHandler) {
        ConcurrentHashMap<MRtcEventHandler, Integer> concurrentHashMap = this.f12484u;
        if (concurrentHashMap == null || concurrentHashMap.contains(mRtcEventHandler)) {
            return;
        }
        this.f12484u.put(mRtcEventHandler, 0);
    }

    /* JADX INFO: renamed from: r */
    public void m11290r(MRtcAudioHandler mRtcAudioHandler) {
        this.f12468e = mRtcAudioHandler;
    }

    /* JADX INFO: renamed from: s */
    public void m11291s(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        this.f12469f = mRtcAudioHandlerEx;
    }

    /* JADX INFO: renamed from: t */
    public void m11292t(MRtcChannelHandler mRtcChannelHandler) {
        this.f12470g = mRtcChannelHandler;
    }

    /* JADX INFO: renamed from: u */
    public String m11293u() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<Long, ley>> it = this.f12481r.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            ley value = it.next().getValue();
            if (i != 0) {
                sb.append(",");
            }
            sb.append(value.b());
            i++;
        }
        if (i == 0) {
            sb.append("(0)");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: v */
    public IRtcEngineEventHandler.LocalVideoStats m11294v() {
        return this.f12466c;
    }

    /* JADX INFO: renamed from: w */
    public int m11295w() {
        return this.f12471h;
    }

    /* JADX INFO: renamed from: x */
    public IRtcEngineEventHandler.RemoteVideoStats m11296x() {
        return this.f12467d;
    }

    /* JADX INFO: renamed from: y */
    public int m11297y() {
        return this.f12472i;
    }

    /* JADX INFO: renamed from: z */
    public IRtcEngineEventHandler.RtcStats m11298z() {
        return this.f12465b;
    }
}
