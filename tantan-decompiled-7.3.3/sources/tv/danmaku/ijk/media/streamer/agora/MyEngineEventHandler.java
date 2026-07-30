package tv.danmaku.ijk.media.streamer.agora;

import android.content.Context;
import android.util.Log;
import com.immomo.mediacore.audio.AudioVolumeWeight;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.immomo.mediacore.coninf.MRtcAudioHandlerEx;
import com.immomo.mediacore.coninf.MRtcChannelHandler;
import com.immomo.mediacore.coninf.MRtcEventHandler;
import com.meituan.robust.Constants;
import io.agora.rtc2.IRtcEngineEventHandler;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p153l.iny;
import tv.danmaku.ijk.media.sink.AgoraWriter;
import tv.danmaku.ijk.media.streamer.StreamProducer;

/* JADX INFO: loaded from: classes3.dex */
public class MyEngineEventHandler {

    /* JADX INFO: renamed from: a */
    private StreamProducer f209761a;

    /* JADX INFO: renamed from: b */
    private IRtcEngineEventHandler.RtcStats f209762b;

    /* JADX INFO: renamed from: c */
    private IRtcEngineEventHandler.LocalVideoStats f209763c;

    /* JADX INFO: renamed from: d */
    private IRtcEngineEventHandler.RemoteVideoStats f209764d;

    /* JADX INFO: renamed from: e */
    private MRtcAudioHandler f209765e;

    /* JADX INFO: renamed from: f */
    private MRtcAudioHandlerEx f209766f;

    /* JADX INFO: renamed from: g */
    private MRtcChannelHandler f209767g;

    /* JADX INFO: renamed from: j */
    private boolean f209770j;

    /* JADX INFO: renamed from: k */
    private boolean f209771k;

    /* JADX INFO: renamed from: p */
    private AgoraWriter f209776p;

    /* JADX INFO: renamed from: s */
    private EngineConfig f209779s;

    /* JADX INFO: renamed from: t */
    private Context f209780t;

    /* JADX INFO: renamed from: h */
    private int f209768h = 0;

    /* JADX INFO: renamed from: i */
    private int f209769i = 0;

    /* JADX INFO: renamed from: l */
    private boolean f209772l = false;

    /* JADX INFO: renamed from: m */
    private boolean f209773m = false;

    /* JADX INFO: renamed from: n */
    private long f209774n = 0;

    /* JADX INFO: renamed from: o */
    private long f209775o = 0;

    /* JADX INFO: renamed from: q */
    private IRtcEngineEventHandler.AudioVolumeInfo[] f209777q = null;

    /* JADX INFO: renamed from: r */
    private ConcurrentHashMap<Long, iny> f209778r = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: u */
    private final ConcurrentHashMap<MRtcEventHandler, Integer> f209781u = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: v */
    public IRtcEngineEventHandler f209782v = new IRtcEngineEventHandler() { // from class: tv.danmaku.ijk.media.streamer.agora.MyEngineEventHandler.1
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onAudioMixingFinished() {
            Iterator it = MyEngineEventHandler.this.f209781u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onAudioMixingFinished();
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onAudioQuality(int i, int i2, short s, short s2) {
            iny inyVar = (iny) MyEngineEventHandler.this.f209778r.get(Long.valueOf(i));
            if (inyVar != null) {
                inyVar.m141183j(s, s2);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onAudioVolumeIndication(IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i) {
            StringBuilder sb = new StringBuilder("onAudioVolumeIndication:speakers.length=");
            sb.append(audioVolumeInfoArr.length);
            sb.append(";totalVolume=");
            sb.append(i);
            sb.append(",getMuteStatus=");
            sb.append(MyEngineEventHandler.this.f209776p.getMuteStatus());
            sb.append(";getUserID=");
            sb.append(MyEngineEventHandler.this.f209776p.getUserID());
            sb.append(Constants.PACKNAME_END);
            int i2 = 0;
            sb.append(audioVolumeInfoArr[0].uid);
            sb.append(":");
            sb.append(audioVolumeInfoArr[0].volume);
            Log.e("test", sb.toString());
            int i3 = audioVolumeInfoArr[0].uid;
            if (i3 != 0 && i3 != MyEngineEventHandler.this.f209776p.getUserID() && audioVolumeInfoArr.length > 0) {
                MyEngineEventHandler.this.f209777q = audioVolumeInfoArr;
                if (MyEngineEventHandler.this.f209766f != null) {
                    AudioVolumeWeight[] audioVolumeWeightArr = new AudioVolumeWeight[audioVolumeInfoArr.length];
                    for (int i4 = 0; i4 < audioVolumeInfoArr.length; i4++) {
                        AudioVolumeWeight audioVolumeWeight = new AudioVolumeWeight();
                        audioVolumeWeight.uid = MyEngineEventHandler.this.f209777q[i4].uid;
                        audioVolumeWeight.volume = (MyEngineEventHandler.this.f209777q[i4].volume * 1.0f) / 255.0f;
                        audioVolumeWeightArr[i4] = audioVolumeWeight;
                    }
                    MyEngineEventHandler.this.f209766f.onAudioVolumeIndication(audioVolumeWeightArr, i);
                }
                if (!MyEngineEventHandler.this.f209776p.getMuteStatus()) {
                    return;
                }
            } else if (MyEngineEventHandler.this.f209766f != null) {
                AudioVolumeWeight audioVolumeWeight2 = new AudioVolumeWeight();
                audioVolumeWeight2.uid = (int) MyEngineEventHandler.this.f209776p.getUserID();
                if (MyEngineEventHandler.this.f209776p.getMuteStatus()) {
                    audioVolumeWeight2.volume = 0.0f;
                } else {
                    audioVolumeWeight2.volume = (audioVolumeInfoArr[0].volume * 1.0f) / 255.0f;
                }
                MyEngineEventHandler.this.f209766f.onAudioVolumeIndication(new AudioVolumeWeight[]{audioVolumeWeight2}, i);
            }
            int length = MyEngineEventHandler.this.f209777q != null ? MyEngineEventHandler.this.f209777q.length + 1 : 1;
            AudioVolumeWeight[] audioVolumeWeightArr2 = new AudioVolumeWeight[length];
            AudioVolumeWeight audioVolumeWeight3 = new AudioVolumeWeight();
            audioVolumeWeight3.uid = (int) MyEngineEventHandler.this.f209776p.getUserID();
            if (MyEngineEventHandler.this.f209776p.getMuteStatus()) {
                audioVolumeWeight3.volume = 0.0f;
            } else {
                audioVolumeWeight3.volume = (audioVolumeInfoArr[0].volume * 1.0f) / 255.0f;
            }
            audioVolumeWeightArr2[0] = audioVolumeWeight3;
            while (i2 < length - 1) {
                AudioVolumeWeight audioVolumeWeight4 = new AudioVolumeWeight();
                audioVolumeWeight4.uid = MyEngineEventHandler.this.f209777q[i2].uid;
                audioVolumeWeight4.volume = (MyEngineEventHandler.this.f209777q[i2].volume * 1.0f) / 255.0f;
                i2++;
                audioVolumeWeightArr2[i2] = audioVolumeWeight4;
            }
            if (MyEngineEventHandler.this.f209765e != null) {
                MyEngineEventHandler.this.f209765e.onAudioVolumeIndication(audioVolumeWeightArr2, i);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onConnectionInterrupted() {
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onConnectionLost() {
            Iterator it = MyEngineEventHandler.this.f209781u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onConnectionLost();
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onError(int i) {
            Log.e("RtcEventHander", "onError" + i);
            if (i == 17 || i == 18 || i == 1603 || i == 1 || i == 109 || i == 110) {
                return;
            }
            Iterator it = MyEngineEventHandler.this.f209781u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onError(i);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onFirstRemoteVideoDecoded(int i, int i2, int i3, int i4) {
            Iterator it = MyEngineEventHandler.this.f209781u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onFirstRemoteVideoDecoded(i, i2, i3, i4);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onJoinChannelSuccess(String str, int i, int i2) {
            Iterator it = MyEngineEventHandler.this.f209781u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onJoinChannelSuccess(str, i, i2);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onLastmileQuality(int i) {
            MyEngineEventHandler.this.f209761a.notify(108, i, 0, null);
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onLeaveChannel(IRtcEngineEventHandler.RtcStats rtcStats) {
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onMediaEngineLoadSuccess() {
            Log.e("myEngineEventHandler", "onMediaEngineLoadSuccess");
            MyEngineEventHandler.this.f209776p.m223427D();
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRejoinChannelSuccess(String str, int i, int i2) {
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRemoteVideoStats(IRtcEngineEventHandler.RemoteVideoStats remoteVideoStats) {
            MyEngineEventHandler.this.f209764d = remoteVideoStats;
            iny inyVar = (iny) MyEngineEventHandler.this.f209778r.get(Long.valueOf(remoteVideoStats.uid));
            if (inyVar != null) {
                inyVar.m141184k(remoteVideoStats.receivedBitrate, remoteVideoStats.rendererOutputFrameRate, remoteVideoStats.width, remoteVideoStats.height);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRequestToken() {
            if (MyEngineEventHandler.this.f209767g != null) {
                MyEngineEventHandler.this.f209767g.onRequestChannelKey();
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRtcStats(IRtcEngineEventHandler.RtcStats rtcStats) {
            MyEngineEventHandler.this.f209762b = rtcStats;
            MyEngineEventHandler.this.f209774n += (long) ((MyEngineEventHandler.this.f209762b.txVideoKBitRate * 2) / 8);
            MyEngineEventHandler.this.f209775o += (long) ((MyEngineEventHandler.this.f209762b.txAudioKBitRate * 2) / 8);
            MyEngineEventHandler.this.f209761a.notify(109, 0, 0, rtcStats);
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onUserJoined(int i, int i2) {
            long j = i;
            MyEngineEventHandler.this.f209778r.put(Long.valueOf(j), new iny(j));
            Iterator it = MyEngineEventHandler.this.f209781u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onJoinChannelSuccess("", j, i2);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onUserMuteAudio(int i, boolean z) {
            Iterator it = MyEngineEventHandler.this.f209781u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onUserMuteAudio(i, z);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onUserMuteVideo(int i, boolean z) {
            iny inyVar = (iny) MyEngineEventHandler.this.f209778r.get(Long.valueOf(i));
            if (inyVar != null) {
                inyVar.m141181h(z);
            }
            Iterator it = MyEngineEventHandler.this.f209781u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onUserMuteVideo(i, z);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onUserOffline(int i, int i2) {
            if (MyEngineEventHandler.this.f209778r != null) {
                long j = i;
                if (MyEngineEventHandler.this.f209778r.containsKey(Long.valueOf(j))) {
                    MyEngineEventHandler.this.f209778r.remove(Long.valueOf(j));
                }
            }
            Iterator it = MyEngineEventHandler.this.f209781u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onUserOffline(i, i2);
            }
        }
    };

    public MyEngineEventHandler(Context context, EngineConfig engineConfig, AgoraWriter agoraWriter, StreamProducer streamProducer) {
        this.f209770j = false;
        this.f209771k = true;
        this.f209779s = null;
        this.f209780t = null;
        this.f209780t = context;
        this.f209779s = engineConfig;
        this.f209776p = agoraWriter;
        this.f209761a = streamProducer;
        this.f209770j = false;
        this.f209771k = true;
    }

    /* JADX INFO: renamed from: A */
    public void m224062A() {
        this.f209780t = null;
        this.f209779s = null;
        this.f209776p = null;
        this.f209761a = null;
        this.f209782v = null;
        ConcurrentHashMap<MRtcEventHandler, Integer> concurrentHashMap = this.f209781u;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m224063B(MRtcEventHandler mRtcEventHandler) {
        ConcurrentHashMap<MRtcEventHandler, Integer> concurrentHashMap = this.f209781u;
        if (concurrentHashMap == null || mRtcEventHandler == null || !concurrentHashMap.contains(mRtcEventHandler)) {
            return;
        }
        this.f209781u.remove(mRtcEventHandler);
    }

    /* JADX INFO: renamed from: q */
    public void m224064q(MRtcEventHandler mRtcEventHandler) {
        ConcurrentHashMap<MRtcEventHandler, Integer> concurrentHashMap = this.f209781u;
        if (concurrentHashMap == null || concurrentHashMap.contains(mRtcEventHandler)) {
            return;
        }
        this.f209781u.put(mRtcEventHandler, 0);
    }

    /* JADX INFO: renamed from: r */
    public void m224065r(MRtcAudioHandler mRtcAudioHandler) {
        this.f209765e = mRtcAudioHandler;
    }

    /* JADX INFO: renamed from: s */
    public void m224066s(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        this.f209766f = mRtcAudioHandlerEx;
    }

    /* JADX INFO: renamed from: t */
    public void m224067t(MRtcChannelHandler mRtcChannelHandler) {
        this.f209767g = mRtcChannelHandler;
    }

    /* JADX INFO: renamed from: u */
    public String m224068u() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<Long, iny>> it = this.f209778r.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iny value = it.next().getValue();
            if (i != 0) {
                sb.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
            }
            sb.append(value.m141176b());
            i++;
        }
        if (i == 0) {
            sb.append("(0)");
        }
        sb.append(com.clevertap.android.sdk.Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: v */
    public IRtcEngineEventHandler.LocalVideoStats m224069v() {
        return this.f209763c;
    }

    /* JADX INFO: renamed from: w */
    public int m224070w() {
        return this.f209768h;
    }

    /* JADX INFO: renamed from: x */
    public IRtcEngineEventHandler.RemoteVideoStats m224071x() {
        return this.f209764d;
    }

    /* JADX INFO: renamed from: y */
    public int m224072y() {
        return this.f209769i;
    }

    /* JADX INFO: renamed from: z */
    public IRtcEngineEventHandler.RtcStats m224073z() {
        return this.f209762b;
    }
}
