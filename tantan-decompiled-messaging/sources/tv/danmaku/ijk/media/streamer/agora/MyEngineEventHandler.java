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
import p149l.ley;
import tv.danmaku.ijk.media.sink.AgoraWriter;
import tv.danmaku.ijk.media.streamer.StreamProducer;

/* JADX INFO: loaded from: classes3.dex */
public class MyEngineEventHandler {

    /* JADX INFO: renamed from: a */
    private StreamProducer f208839a;

    /* JADX INFO: renamed from: b */
    private IRtcEngineEventHandler.RtcStats f208840b;

    /* JADX INFO: renamed from: c */
    private IRtcEngineEventHandler.LocalVideoStats f208841c;

    /* JADX INFO: renamed from: d */
    private IRtcEngineEventHandler.RemoteVideoStats f208842d;

    /* JADX INFO: renamed from: e */
    private MRtcAudioHandler f208843e;

    /* JADX INFO: renamed from: f */
    private MRtcAudioHandlerEx f208844f;

    /* JADX INFO: renamed from: g */
    private MRtcChannelHandler f208845g;

    /* JADX INFO: renamed from: j */
    private boolean f208848j;

    /* JADX INFO: renamed from: k */
    private boolean f208849k;

    /* JADX INFO: renamed from: p */
    private AgoraWriter f208854p;

    /* JADX INFO: renamed from: s */
    private EngineConfig f208857s;

    /* JADX INFO: renamed from: t */
    private Context f208858t;

    /* JADX INFO: renamed from: h */
    private int f208846h = 0;

    /* JADX INFO: renamed from: i */
    private int f208847i = 0;

    /* JADX INFO: renamed from: l */
    private boolean f208850l = false;

    /* JADX INFO: renamed from: m */
    private boolean f208851m = false;

    /* JADX INFO: renamed from: n */
    private long f208852n = 0;

    /* JADX INFO: renamed from: o */
    private long f208853o = 0;

    /* JADX INFO: renamed from: q */
    private IRtcEngineEventHandler.AudioVolumeInfo[] f208855q = null;

    /* JADX INFO: renamed from: r */
    private ConcurrentHashMap<Long, ley> f208856r = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: u */
    private final ConcurrentHashMap<MRtcEventHandler, Integer> f208859u = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: v */
    public IRtcEngineEventHandler f208860v = new IRtcEngineEventHandler() { // from class: tv.danmaku.ijk.media.streamer.agora.MyEngineEventHandler.1
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onAudioMixingFinished() {
            Iterator it = MyEngineEventHandler.this.f208859u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onAudioMixingFinished();
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onAudioQuality(int i, int i2, short s, short s2) {
            ley leyVar = (ley) MyEngineEventHandler.this.f208856r.get(Long.valueOf(i));
            if (leyVar != null) {
                leyVar.m149627j(s, s2);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onAudioVolumeIndication(IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i) {
            StringBuilder sb = new StringBuilder("onAudioVolumeIndication:speakers.length=");
            sb.append(audioVolumeInfoArr.length);
            sb.append(";totalVolume=");
            sb.append(i);
            sb.append(",getMuteStatus=");
            sb.append(MyEngineEventHandler.this.f208854p.getMuteStatus());
            sb.append(";getUserID=");
            sb.append(MyEngineEventHandler.this.f208854p.getUserID());
            sb.append(Constants.PACKNAME_END);
            int i2 = 0;
            sb.append(audioVolumeInfoArr[0].uid);
            sb.append(":");
            sb.append(audioVolumeInfoArr[0].volume);
            Log.e("test", sb.toString());
            int i3 = audioVolumeInfoArr[0].uid;
            if (i3 != 0 && i3 != MyEngineEventHandler.this.f208854p.getUserID() && audioVolumeInfoArr.length > 0) {
                MyEngineEventHandler.this.f208855q = audioVolumeInfoArr;
                if (MyEngineEventHandler.this.f208844f != null) {
                    AudioVolumeWeight[] audioVolumeWeightArr = new AudioVolumeWeight[audioVolumeInfoArr.length];
                    for (int i4 = 0; i4 < audioVolumeInfoArr.length; i4++) {
                        AudioVolumeWeight audioVolumeWeight = new AudioVolumeWeight();
                        audioVolumeWeight.uid = MyEngineEventHandler.this.f208855q[i4].uid;
                        audioVolumeWeight.volume = (MyEngineEventHandler.this.f208855q[i4].volume * 1.0f) / 255.0f;
                        audioVolumeWeightArr[i4] = audioVolumeWeight;
                    }
                    MyEngineEventHandler.this.f208844f.onAudioVolumeIndication(audioVolumeWeightArr, i);
                }
                if (!MyEngineEventHandler.this.f208854p.getMuteStatus()) {
                    return;
                }
            } else if (MyEngineEventHandler.this.f208844f != null) {
                AudioVolumeWeight audioVolumeWeight2 = new AudioVolumeWeight();
                audioVolumeWeight2.uid = (int) MyEngineEventHandler.this.f208854p.getUserID();
                if (MyEngineEventHandler.this.f208854p.getMuteStatus()) {
                    audioVolumeWeight2.volume = 0.0f;
                } else {
                    audioVolumeWeight2.volume = (audioVolumeInfoArr[0].volume * 1.0f) / 255.0f;
                }
                MyEngineEventHandler.this.f208844f.onAudioVolumeIndication(new AudioVolumeWeight[]{audioVolumeWeight2}, i);
            }
            int length = MyEngineEventHandler.this.f208855q != null ? MyEngineEventHandler.this.f208855q.length + 1 : 1;
            AudioVolumeWeight[] audioVolumeWeightArr2 = new AudioVolumeWeight[length];
            AudioVolumeWeight audioVolumeWeight3 = new AudioVolumeWeight();
            audioVolumeWeight3.uid = (int) MyEngineEventHandler.this.f208854p.getUserID();
            if (MyEngineEventHandler.this.f208854p.getMuteStatus()) {
                audioVolumeWeight3.volume = 0.0f;
            } else {
                audioVolumeWeight3.volume = (audioVolumeInfoArr[0].volume * 1.0f) / 255.0f;
            }
            audioVolumeWeightArr2[0] = audioVolumeWeight3;
            while (i2 < length - 1) {
                AudioVolumeWeight audioVolumeWeight4 = new AudioVolumeWeight();
                audioVolumeWeight4.uid = MyEngineEventHandler.this.f208855q[i2].uid;
                audioVolumeWeight4.volume = (MyEngineEventHandler.this.f208855q[i2].volume * 1.0f) / 255.0f;
                i2++;
                audioVolumeWeightArr2[i2] = audioVolumeWeight4;
            }
            if (MyEngineEventHandler.this.f208843e != null) {
                MyEngineEventHandler.this.f208843e.onAudioVolumeIndication(audioVolumeWeightArr2, i);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onConnectionInterrupted() {
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onConnectionLost() {
            Iterator it = MyEngineEventHandler.this.f208859u.keySet().iterator();
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
            Iterator it = MyEngineEventHandler.this.f208859u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onError(i);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onFirstRemoteVideoDecoded(int i, int i2, int i3, int i4) {
            Iterator it = MyEngineEventHandler.this.f208859u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onFirstRemoteVideoDecoded(i, i2, i3, i4);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onJoinChannelSuccess(String str, int i, int i2) {
            Iterator it = MyEngineEventHandler.this.f208859u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onJoinChannelSuccess(str, i, i2);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onLastmileQuality(int i) {
            MyEngineEventHandler.this.f208839a.notify(108, i, 0, null);
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onLeaveChannel(IRtcEngineEventHandler.RtcStats rtcStats) {
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onMediaEngineLoadSuccess() {
            Log.e("myEngineEventHandler", "onMediaEngineLoadSuccess");
            MyEngineEventHandler.this.f208854p.m222181D();
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRejoinChannelSuccess(String str, int i, int i2) {
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRemoteVideoStats(IRtcEngineEventHandler.RemoteVideoStats remoteVideoStats) {
            MyEngineEventHandler.this.f208842d = remoteVideoStats;
            ley leyVar = (ley) MyEngineEventHandler.this.f208856r.get(Long.valueOf(remoteVideoStats.uid));
            if (leyVar != null) {
                leyVar.m149628k(remoteVideoStats.receivedBitrate, remoteVideoStats.rendererOutputFrameRate, remoteVideoStats.width, remoteVideoStats.height);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRequestToken() {
            if (MyEngineEventHandler.this.f208845g != null) {
                MyEngineEventHandler.this.f208845g.onRequestChannelKey();
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRtcStats(IRtcEngineEventHandler.RtcStats rtcStats) {
            MyEngineEventHandler.this.f208840b = rtcStats;
            MyEngineEventHandler.this.f208852n += (long) ((MyEngineEventHandler.this.f208840b.txVideoKBitRate * 2) / 8);
            MyEngineEventHandler.this.f208853o += (long) ((MyEngineEventHandler.this.f208840b.txAudioKBitRate * 2) / 8);
            MyEngineEventHandler.this.f208839a.notify(109, 0, 0, rtcStats);
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onUserJoined(int i, int i2) {
            long j = i;
            MyEngineEventHandler.this.f208856r.put(Long.valueOf(j), new ley(j));
            Iterator it = MyEngineEventHandler.this.f208859u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onJoinChannelSuccess("", j, i2);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onUserMuteAudio(int i, boolean z) {
            Iterator it = MyEngineEventHandler.this.f208859u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onUserMuteAudio(i, z);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onUserMuteVideo(int i, boolean z) {
            ley leyVar = (ley) MyEngineEventHandler.this.f208856r.get(Long.valueOf(i));
            if (leyVar != null) {
                leyVar.m149625h(z);
            }
            Iterator it = MyEngineEventHandler.this.f208859u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onUserMuteVideo(i, z);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onUserOffline(int i, int i2) {
            if (MyEngineEventHandler.this.f208856r != null) {
                long j = i;
                if (MyEngineEventHandler.this.f208856r.containsKey(Long.valueOf(j))) {
                    MyEngineEventHandler.this.f208856r.remove(Long.valueOf(j));
                }
            }
            Iterator it = MyEngineEventHandler.this.f208859u.keySet().iterator();
            while (it.hasNext()) {
                ((MRtcEventHandler) it.next()).onUserOffline(i, i2);
            }
        }
    };

    public MyEngineEventHandler(Context context, EngineConfig engineConfig, AgoraWriter agoraWriter, StreamProducer streamProducer) {
        this.f208848j = false;
        this.f208849k = true;
        this.f208857s = null;
        this.f208858t = null;
        this.f208858t = context;
        this.f208857s = engineConfig;
        this.f208854p = agoraWriter;
        this.f208839a = streamProducer;
        this.f208848j = false;
        this.f208849k = true;
    }

    /* JADX INFO: renamed from: A */
    public void m222816A() {
        this.f208858t = null;
        this.f208857s = null;
        this.f208854p = null;
        this.f208839a = null;
        this.f208860v = null;
        ConcurrentHashMap<MRtcEventHandler, Integer> concurrentHashMap = this.f208859u;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m222817B(MRtcEventHandler mRtcEventHandler) {
        ConcurrentHashMap<MRtcEventHandler, Integer> concurrentHashMap = this.f208859u;
        if (concurrentHashMap == null || mRtcEventHandler == null || !concurrentHashMap.contains(mRtcEventHandler)) {
            return;
        }
        this.f208859u.remove(mRtcEventHandler);
    }

    /* JADX INFO: renamed from: q */
    public void m222818q(MRtcEventHandler mRtcEventHandler) {
        ConcurrentHashMap<MRtcEventHandler, Integer> concurrentHashMap = this.f208859u;
        if (concurrentHashMap == null || concurrentHashMap.contains(mRtcEventHandler)) {
            return;
        }
        this.f208859u.put(mRtcEventHandler, 0);
    }

    /* JADX INFO: renamed from: r */
    public void m222819r(MRtcAudioHandler mRtcAudioHandler) {
        this.f208843e = mRtcAudioHandler;
    }

    /* JADX INFO: renamed from: s */
    public void m222820s(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        this.f208844f = mRtcAudioHandlerEx;
    }

    /* JADX INFO: renamed from: t */
    public void m222821t(MRtcChannelHandler mRtcChannelHandler) {
        this.f208845g = mRtcChannelHandler;
    }

    /* JADX INFO: renamed from: u */
    public String m222822u() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<Long, ley>> it = this.f208856r.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            ley value = it.next().getValue();
            if (i != 0) {
                sb.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
            }
            sb.append(value.m149620b());
            i++;
        }
        if (i == 0) {
            sb.append("(0)");
        }
        sb.append(com.clevertap.android.sdk.Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: v */
    public IRtcEngineEventHandler.LocalVideoStats m222823v() {
        return this.f208841c;
    }

    /* JADX INFO: renamed from: w */
    public int m222824w() {
        return this.f208846h;
    }

    /* JADX INFO: renamed from: x */
    public IRtcEngineEventHandler.RemoteVideoStats m222825x() {
        return this.f208842d;
    }

    /* JADX INFO: renamed from: y */
    public int m222826y() {
        return this.f208847i;
    }

    /* JADX INFO: renamed from: z */
    public IRtcEngineEventHandler.RtcStats m222827z() {
        return this.f208840b;
    }
}
