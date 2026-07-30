package p149l;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.gms.internal.ads.C2260u3;
import com.google.android.gms.internal.ads.zzaae;
import com.google.android.gms.internal.ads.zzaak;
import com.google.android.gms.internal.ads.zzabn;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zziz;
import com.google.android.gms.internal.ads.zzst;
import com.google.android.gms.internal.ads.zzth;
import com.immomo.momomediaext.sei.BaseSei;
import com.momo.momortc.MMConstants;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import com.tencent.liteav.audio.TXEAudioDef;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class b2r0 extends eny0 implements g2r0 {

    /* JADX INFO: renamed from: B1 */
    public static final int[] f72714B1 = {WBConstants.SDK_NEW_PAY_VERSION, MMConstants.ERR_VCM_UNKNOWN_ERROR, 1440, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 854, 640, 540, 480};

    /* JADX INFO: renamed from: C1 */
    public static boolean f72715C1;

    /* JADX INFO: renamed from: D1 */
    public static boolean f72716D1;

    /* JADX INFO: renamed from: A1 */
    @Nullable
    public s3r0 f72717A1;

    /* JADX INFO: renamed from: a1 */
    public final Context f72718a1;

    /* JADX INFO: renamed from: b1 */
    public final t3r0 f72719b1;

    /* JADX INFO: renamed from: c1 */
    public final o3r0 f72720c1;

    /* JADX INFO: renamed from: d1 */
    public final boolean f72721d1;

    /* JADX INFO: renamed from: e1 */
    public final h2r0 f72722e1;

    /* JADX INFO: renamed from: f1 */
    public final f2r0 f72723f1;

    /* JADX INFO: renamed from: g1 */
    public a2r0 f72724g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f72725h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f72726i1;

    /* JADX INFO: renamed from: j1 */
    @Nullable
    public Surface f72727j1;

    /* JADX INFO: renamed from: k1 */
    @Nullable
    public zzaak f72728k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f72729l1;

    /* JADX INFO: renamed from: m1 */
    public int f72730m1;

    /* JADX INFO: renamed from: n1 */
    public long f72731n1;

    /* JADX INFO: renamed from: o1 */
    public int f72732o1;

    /* JADX INFO: renamed from: p1 */
    public int f72733p1;

    /* JADX INFO: renamed from: q1 */
    public int f72734q1;

    /* JADX INFO: renamed from: r1 */
    public long f72735r1;

    /* JADX INFO: renamed from: s1 */
    public int f72736s1;

    /* JADX INFO: renamed from: t1 */
    public long f72737t1;

    /* JADX INFO: renamed from: u1 */
    public ueu0 f72738u1;

    /* JADX INFO: renamed from: v1 */
    @Nullable
    public ueu0 f72739v1;

    /* JADX INFO: renamed from: w1 */
    public boolean f72740w1;

    /* JADX INFO: renamed from: x1 */
    public boolean f72741x1;

    /* JADX INFO: renamed from: y1 */
    public int f72742y1;

    /* JADX INFO: renamed from: z1 */
    @Nullable
    public e2r0 f72743z1;

    public b2r0(Context context, tmy0 tmy0Var, xny0 xny0Var, long j, boolean z, @Nullable Handler handler, @Nullable p3r0 p3r0Var, int i, float f) {
        super(2, tmy0Var, xny0Var, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f72718a1 = applicationContext;
        this.f72720c1 = new o3r0(handler, p3r0Var);
        cyy0 cyy0Var = new cyy0(applicationContext);
        cyy0Var.m109397c(new h2r0(applicationContext, this, 0L));
        w1r0 w1r0VarM109398d = cyy0Var.m109398d();
        this.f72719b1 = w1r0VarM109398d;
        this.f72722e1 = w1r0VarM109398d.zza();
        this.f72723f1 = new f2r0();
        this.f72721d1 = "NVIDIA".equals(ggw0.f102570c);
        this.f72730m1 = 1;
        this.f72738u1 = ueu0.f176200e;
        this.f72742y1 = 0;
        this.f72739v1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x012e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0138  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:110:0x014c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x0160  */
    /* JADX WARN: Code duplicated, block: B:119:0x016a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0174  */
    /* JADX WARN: Code duplicated, block: B:125:0x017e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0188  */
    /* JADX WARN: Code duplicated, block: B:131:0x0192  */
    /* JADX WARN: Code duplicated, block: B:134:0x019c  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:164:0x0200  */
    /* JADX WARN: Code duplicated, block: B:167:0x020a  */
    /* JADX WARN: Code duplicated, block: B:170:0x0214  */
    /* JADX WARN: Code duplicated, block: B:173:0x021e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0228  */
    /* JADX WARN: Code duplicated, block: B:179:0x0232  */
    /* JADX WARN: Code duplicated, block: B:182:0x023c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0246  */
    /* JADX WARN: Code duplicated, block: B:188:0x0250  */
    /* JADX WARN: Code duplicated, block: B:191:0x025a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0264  */
    /* JADX WARN: Code duplicated, block: B:197:0x026e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0278  */
    /* JADX WARN: Code duplicated, block: B:203:0x0282  */
    /* JADX WARN: Code duplicated, block: B:206:0x028c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0296  */
    /* JADX WARN: Code duplicated, block: B:212:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:215:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:221:0x02be  */
    /* JADX WARN: Code duplicated, block: B:224:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:227:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:230:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:236:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:239:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:242:0x0304  */
    /* JADX WARN: Code duplicated, block: B:245:0x030e  */
    /* JADX WARN: Code duplicated, block: B:248:0x0318  */
    /* JADX WARN: Code duplicated, block: B:251:0x0322  */
    /* JADX WARN: Code duplicated, block: B:254:0x032c  */
    /* JADX WARN: Code duplicated, block: B:257:0x0336  */
    /* JADX WARN: Code duplicated, block: B:260:0x0340  */
    /* JADX WARN: Code duplicated, block: B:263:0x034a  */
    /* JADX WARN: Code duplicated, block: B:266:0x0354  */
    /* JADX WARN: Code duplicated, block: B:269:0x035e  */
    /* JADX WARN: Code duplicated, block: B:272:0x0368  */
    /* JADX WARN: Code duplicated, block: B:275:0x0372  */
    /* JADX WARN: Code duplicated, block: B:278:0x037c  */
    /* JADX WARN: Code duplicated, block: B:281:0x0386  */
    /* JADX WARN: Code duplicated, block: B:284:0x0390  */
    /* JADX WARN: Code duplicated, block: B:287:0x039a  */
    /* JADX WARN: Code duplicated, block: B:290:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:293:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:296:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:299:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:302:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:305:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:308:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:311:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:314:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:317:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:320:0x0408  */
    /* JADX WARN: Code duplicated, block: B:323:0x0412  */
    /* JADX WARN: Code duplicated, block: B:326:0x041c  */
    /* JADX WARN: Code duplicated, block: B:329:0x0426  */
    /* JADX WARN: Code duplicated, block: B:332:0x0430  */
    /* JADX WARN: Code duplicated, block: B:335:0x043a  */
    /* JADX WARN: Code duplicated, block: B:338:0x0444  */
    /* JADX WARN: Code duplicated, block: B:341:0x044e  */
    /* JADX WARN: Code duplicated, block: B:344:0x0458  */
    /* JADX WARN: Code duplicated, block: B:347:0x0462  */
    /* JADX WARN: Code duplicated, block: B:350:0x046c  */
    /* JADX WARN: Code duplicated, block: B:353:0x0476  */
    /* JADX WARN: Code duplicated, block: B:356:0x0480  */
    /* JADX WARN: Code duplicated, block: B:359:0x048a  */
    /* JADX WARN: Code duplicated, block: B:362:0x0494  */
    /* JADX WARN: Code duplicated, block: B:365:0x049e  */
    /* JADX WARN: Code duplicated, block: B:368:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:371:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:374:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:377:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:380:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:383:0x04da  */
    /* JADX WARN: Code duplicated, block: B:386:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:389:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:392:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:395:0x0502  */
    /* JADX WARN: Code duplicated, block: B:398:0x050c  */
    /* JADX WARN: Code duplicated, block: B:401:0x0516  */
    /* JADX WARN: Code duplicated, block: B:404:0x0520  */
    /* JADX WARN: Code duplicated, block: B:407:0x052a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:410:0x0534  */
    /* JADX WARN: Code duplicated, block: B:413:0x053e  */
    /* JADX WARN: Code duplicated, block: B:416:0x0548  */
    /* JADX WARN: Code duplicated, block: B:419:0x0552  */
    /* JADX WARN: Code duplicated, block: B:422:0x055c  */
    /* JADX WARN: Code duplicated, block: B:425:0x0566  */
    /* JADX WARN: Code duplicated, block: B:428:0x0570  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073 A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:507:0x066a, B:42:0x0073, B:45:0x007e, B:77:0x00dd, B:500:0x0656, B:508:0x066e), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:431:0x057a  */
    /* JADX WARN: Code duplicated, block: B:434:0x0584  */
    /* JADX WARN: Code duplicated, block: B:437:0x058e  */
    /* JADX WARN: Code duplicated, block: B:440:0x0598  */
    /* JADX WARN: Code duplicated, block: B:443:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:446:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:449:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:452:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:455:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:458:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:507:0x066a, B:42:0x0073, B:45:0x007e, B:77:0x00dd, B:500:0x0656, B:508:0x066e), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:461:0x05de  */
    /* JADX WARN: Code duplicated, block: B:464:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:467:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:470:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:473:0x0604  */
    /* JADX WARN: Code duplicated, block: B:476:0x060d  */
    /* JADX WARN: Code duplicated, block: B:479:0x0616  */
    /* JADX WARN: Code duplicated, block: B:482:0x061f  */
    /* JADX WARN: Code duplicated, block: B:485:0x0628  */
    /* JADX WARN: Code duplicated, block: B:488:0x0631  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:491:0x063a  */
    /* JADX WARN: Code duplicated, block: B:494:0x0643  */
    /* JADX WARN: Code duplicated, block: B:497:0x064c  */
    /* JADX WARN: Code duplicated, block: B:500:0x0656 A[Catch: all -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:507:0x066a, B:42:0x0073, B:45:0x007e, B:77:0x00dd, B:500:0x0656, B:508:0x066e), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:504:0x0660  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd A[Catch: all -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:507:0x066a, B:42:0x0073, B:45:0x007e, B:77:0x00dd, B:500:0x0656, B:508:0x066e), top: B:513:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0124  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:504:0x0660
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: T0 */
    public static final boolean m99974T0(java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 2286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.b2r0.m99974T0(java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: U0 */
    public static List m99975U0(Context context, xny0 xny0Var, mhr0 mhr0Var, boolean z, boolean z2) throws zzth {
        String str = mhr0Var.f133892l;
        if (str == null) {
            return zzgaa.zzl();
        }
        if (ggw0.f102568a >= 26 && "video/dolby-vision".equals(str) && !z1r0.m216802a(context)) {
            List listM137403d = ioy0.m137403d(xny0Var, mhr0Var, z, z2);
            if (!listM137403d.isEmpty()) {
                return listM137403d;
            }
        }
        return ioy0.m137405f(xny0Var, mhr0Var, z, z2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r3.equals("video/x-vnd.on2.vp8") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
    
        if (r3.equals("video/av01") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
    
        if (r3.equals(org.fourthline.cling.support.model.dlna.DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_3GP) != false) goto L53;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: X0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m99976X0(p149l.bny0 r7, p149l.mhr0 r8) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.b2r0.m99976X0(l.bny0, l.mhr0):int");
    }

    /* JADX INFO: renamed from: Y0 */
    public static int m99977Y0(bny0 bny0Var, mhr0 mhr0Var) {
        if (mhr0Var.f133893m == -1) {
            return m99976X0(bny0Var, mhr0Var);
        }
        int size = mhr0Var.f133894n.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) mhr0Var.f133894n.get(i)).length;
        }
        return mhr0Var.f133893m + length;
    }

    @Override // p149l.eny0, p149l.knx0
    @TargetApi(17)
    /* JADX INFO: renamed from: A */
    public final void mo99978A() {
        try {
            super.mo99978A();
            this.f72741x1 = false;
            if (this.f72728k1 != null) {
            }
        } finally {
            this.f72741x1 = false;
            if (this.f72728k1 != null) {
                m99999V0();
            }
        }
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: A0 */
    public final void mo99979A0(String str, rmy0 rmy0Var, long j, long j2) {
        this.f72720c1.m162468a(str, j, j2);
        this.f72725h1 = m99974T0(str);
        bny0 bny0VarM117310N0 = m117310N0();
        bny0VarM117310N0.getClass();
        boolean z = false;
        if (ggw0.f102568a >= 29 && "video/x-vnd.on2.vp9".equals(bny0VarM117310N0.f76461b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : bny0VarM117310N0.m102884h()) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.f72726i1 = z;
    }

    @Override // p149l.knx0
    /* JADX INFO: renamed from: B */
    public final void mo99980B() {
        this.f72732o1 = 0;
        m146600L();
        this.f72731n1 = SystemClock.elapsedRealtime();
        this.f72735r1 = 0L;
        this.f72736s1 = 0;
        this.f72722e1.m129132g();
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: B0 */
    public final void mo99981B0(String str) {
        this.f72720c1.m162469b(str);
    }

    @Override // p149l.knx0
    /* JADX INFO: renamed from: C */
    public final void mo99982C() {
        if (this.f72732o1 > 0) {
            m146600L();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f72720c1.m162471d(this.f72732o1, jElapsedRealtime - this.f72731n1);
            this.f72732o1 = 0;
            this.f72731n1 = jElapsedRealtime;
        }
        int i = this.f72736s1;
        if (i != 0) {
            this.f72720c1.m162485r(this.f72735r1, i);
            this.f72735r1 = 0L;
            this.f72736s1 = 0;
        }
        this.f72722e1.m129133h();
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: C0 */
    public final void mo99983C0(mhr0 mhr0Var, @Nullable MediaFormat mediaFormat) {
        vmy0 vmy0VarM117309L0 = m117309L0();
        if (vmy0VarM117309L0 != null) {
            vmy0VarM117309L0.mo107726d(this.f72730m1);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = mhr0Var.f133901u;
        int i = ggw0.f102568a;
        int i2 = mhr0Var.f133900t;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer2;
            integer2 = integer;
            integer = i3;
        }
        this.f72738u1 = new ueu0(integer, integer2, 0, f);
        this.f72722e1.m129137l(mhr0Var.f133899s);
        if (this.f72717A1 == null) {
            return;
        }
        ter0 ter0VarM154634b = mhr0Var.m154634b();
        ter0VarM154634b.m188590C(integer);
        ter0VarM154634b.m188600i(integer2);
        ter0VarM154634b.m188617v(0);
        ter0VarM154634b.m188614s(f);
        ter0VarM154634b.m188591D();
        throw null;
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: E0 */
    public final void mo99984E0() {
        this.f72722e1.m129131f();
        int i = ggw0.f102568a;
        if (this.f72719b1.zzk()) {
            this.f72719b1.mo187119d(m117307J0());
        }
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: G0 */
    public final boolean mo99985G0(long j, long j2, @Nullable vmy0 vmy0Var, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, mhr0 mhr0Var) throws zziz {
        long j4;
        vmy0Var.getClass();
        long jM117307J0 = j3 - m117307J0();
        int iM129126a = this.f72722e1.m129126a(j3, j, j2, m117308K0(), z2, this.f72723f1);
        if (z && !z2) {
            m100003a1(vmy0Var, i, jM117307J0);
            return true;
        }
        if (this.f72727j1 == this.f72728k1) {
            if (this.f72723f1.m119236c() < HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
                m100003a1(vmy0Var, i, jM117307J0);
                m99995S0(this.f72723f1.m119236c());
                return true;
            }
        } else {
            if (this.f72717A1 != null) {
                try {
                    throw null;
                } catch (zzabn e) {
                    throw m146601M(e, e.zza, false, 7001);
                }
            }
            if (iM129126a == 0) {
                m146600L();
                long jNanoTime = System.nanoTime();
                int i4 = ggw0.f102568a;
                m100002Z0(vmy0Var, i, jM117307J0, jNanoTime);
                m99995S0(this.f72723f1.m119236c());
                return true;
            }
            if (iM129126a == 1) {
                f2r0 f2r0Var = this.f72723f1;
                long jM119237d = f2r0Var.m119237d();
                long jM119236c = f2r0Var.m119236c();
                int i5 = ggw0.f102568a;
                if (jM119237d == this.f72737t1) {
                    m100003a1(vmy0Var, i, jM117307J0);
                    j4 = jM119237d;
                } else {
                    m100002Z0(vmy0Var, i, jM117307J0, jM119237d);
                    j4 = jM119237d;
                }
                m99995S0(jM119236c);
                this.f72737t1 = j4;
                return true;
            }
            if (iM129126a == 2) {
                int i6 = ggw0.f102568a;
                Trace.beginSection("dropVideoBuffer");
                vmy0Var.mo107727e(i, false);
                Trace.endSection();
                m99993R0(0, 1);
                m99995S0(this.f72723f1.m119236c());
                return true;
            }
            if (iM129126a == 3) {
                m100003a1(vmy0Var, i, jM117307J0);
                m99995S0(this.f72723f1.m119236c());
                return true;
            }
        }
        return false;
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: I0 */
    public final int mo99986I0(ylx0 ylx0Var) {
        int i = ggw0.f102568a;
        return 0;
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: M0 */
    public final zzst mo99987M0(Throwable th, @Nullable bny0 bny0Var) {
        return new zzaae(th, bny0Var, this.f72727j1);
    }

    @Override // p149l.eny0, p149l.knx0
    /* JADX INFO: renamed from: P */
    public final void mo99988P() {
        this.f72739v1 = null;
        this.f72722e1.m129129d();
        int i = ggw0.f102568a;
        this.f72729l1 = false;
        try {
            super.mo99988P();
        } finally {
            this.f72720c1.m162470c(this.f92379T0);
            this.f72720c1.m162487t(ueu0.f176200e);
        }
    }

    @Override // p149l.eny0
    @CallSuper
    /* JADX INFO: renamed from: P0 */
    public final void mo99989P0(long j) {
        super.mo99989P0(j);
        this.f72734q1--;
    }

    @Override // p149l.eny0, p149l.knx0
    /* JADX INFO: renamed from: Q */
    public final void mo99990Q(boolean z, boolean z2) throws zziz {
        super.mo99990Q(z, z2);
        m146602N();
        this.f72720c1.m162472e(this.f92379T0);
        this.f72722e1.m129130e(z2);
    }

    @Override // p149l.eny0
    @CallSuper
    /* JADX INFO: renamed from: Q0 */
    public final void mo99991Q0(ylx0 ylx0Var) throws zziz {
        this.f72734q1++;
        int i = ggw0.f102568a;
    }

    @Override // p149l.knx0
    /* JADX INFO: renamed from: R */
    public final void mo99992R() {
        h2r0 h2r0Var = this.f72722e1;
        g6v0 g6v0VarM146600L = m146600L();
        h2r0Var.m129136k(g6v0VarM146600L);
        this.f72719b1.mo187120e(g6v0VarM146600L);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m99993R0(int i, int i2) {
        pnx0 pnx0Var = this.f92379T0;
        pnx0Var.f150424h += i;
        int i3 = i + i2;
        pnx0Var.f150423g += i3;
        this.f72732o1 += i3;
        int i4 = this.f72733p1 + i3;
        this.f72733p1 = i4;
        pnx0Var.f150425i = Math.max(i4, pnx0Var.f150425i);
    }

    @Override // p149l.eny0, p149l.knx0
    /* JADX INFO: renamed from: S */
    public final void mo99994S(long j, boolean z) throws zziz {
        if (this.f72717A1 != null) {
            throw null;
        }
        super.mo99994S(j, z);
        if (this.f72719b1.zzk()) {
            this.f72719b1.mo187119d(m117307J0());
        }
        this.f72722e1.m129134i();
        if (z) {
            this.f72722e1.m129128c();
        }
        int i = ggw0.f102568a;
        this.f72733p1 = 0;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m99995S0(long j) {
        pnx0 pnx0Var = this.f92379T0;
        pnx0Var.f150427k += j;
        pnx0Var.f150428l++;
        this.f72735r1 += j;
        this.f72736s1++;
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: T */
    public final float mo99996T(float f, mhr0 mhr0Var, mhr0[] mhr0VarArr) {
        float fMax = -1.0f;
        for (mhr0 mhr0Var2 : mhr0VarArr) {
            float f2 = mhr0Var2.f133899s;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: U */
    public final int mo99997U(xny0 xny0Var, mhr0 mhr0Var) throws zzth {
        boolean z;
        if (!uys0.m196371h(mhr0Var.f133892l)) {
            return 128;
        }
        int i = 1;
        int i2 = 0;
        boolean z2 = mhr0Var.f133895o != null;
        List listM99975U0 = m99975U0(this.f72718a1, xny0Var, mhr0Var, z2, false);
        if (z2 && listM99975U0.isEmpty()) {
            listM99975U0 = m99975U0(this.f72718a1, xny0Var, mhr0Var, false, false);
        }
        if (!listM99975U0.isEmpty()) {
            if (eny0.m117300e0(mhr0Var)) {
                bny0 bny0Var = (bny0) listM99975U0.get(0);
                boolean zM102881e = bny0Var.m102881e(mhr0Var);
                if (!zM102881e) {
                    int i3 = 1;
                    while (true) {
                        if (i3 >= listM99975U0.size()) {
                            z = true;
                            break;
                        }
                        bny0 bny0Var2 = (bny0) listM99975U0.get(i3);
                        if (bny0Var2.m102881e(mhr0Var)) {
                            zM102881e = true;
                            z = false;
                            bny0Var = bny0Var2;
                            break;
                        }
                        i3++;
                    }
                } else {
                    z = true;
                    break;
                }
                int i4 = true != zM102881e ? 3 : 4;
                int i5 = true != bny0Var.m102882f(mhr0Var) ? 8 : 16;
                int i6 = true != bny0Var.f76466g ? 0 : 64;
                int i7 = true != z ? 0 : 128;
                if (ggw0.f102568a >= 26 && "video/dolby-vision".equals(mhr0Var.f133892l) && !z1r0.m216802a(this.f72718a1)) {
                    i7 = 256;
                }
                if (zM102881e) {
                    List listM99975U1 = m99975U0(this.f72718a1, xny0Var, mhr0Var, z2, true);
                    if (!listM99975U1.isEmpty()) {
                        bny0 bny0Var3 = (bny0) ioy0.m137406g(listM99975U1, mhr0Var).get(0);
                        if (bny0Var3.m102881e(mhr0Var) && bny0Var3.m102882f(mhr0Var)) {
                            i2 = 32;
                        }
                    }
                }
                return i4 | i5 | i2 | i6 | i7;
            }
            i = 2;
        }
        return i | 128;
    }

    @Override // p149l.eny0
    @CallSuper
    /* JADX INFO: renamed from: V */
    public final void mo99998V(mhr0 mhr0Var) throws zziz {
        if (this.f72740w1 && !this.f72741x1 && !this.f72719b1.zzk()) {
            try {
                this.f72719b1.mo187117b(mhr0Var);
                this.f72719b1.mo187119d(m117307J0());
                e2r0 e2r0Var = this.f72743z1;
                if (e2r0Var != null) {
                    this.f72719b1.mo187121f(e2r0Var);
                }
            } catch (zzabn e) {
                throw m146601M(e, mhr0Var, false, PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED);
            }
        }
        if (this.f72717A1 != null || !this.f72719b1.zzk()) {
            this.f72741x1 = true;
        } else {
            this.f72717A1 = this.f72719b1.zzb();
            C2260u3.m13341b();
            throw null;
        }
    }

    @RequiresApi(17)
    /* JADX INFO: renamed from: V0 */
    public final void m99999V0() {
        Surface surface = this.f72727j1;
        zzaak zzaakVar = this.f72728k1;
        if (surface == zzaakVar) {
            this.f72727j1 = null;
        }
        if (zzaakVar != null) {
            zzaakVar.release();
            this.f72728k1 = null;
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m100000W0(bny0 bny0Var) {
        if (ggw0.f102568a < 23 || m99974T0(bny0Var.f76460a)) {
            return false;
        }
        return !bny0Var.f76465f || zzaak.m13535b(this.f72718a1);
    }

    @Override // p149l.eny0
    @CallSuper
    /* JADX INFO: renamed from: X */
    public final void mo100001X() {
        super.mo100001X();
        this.f72734q1 = 0;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: Z0 */
    public final void m100002Z0(vmy0 vmy0Var, int i, long j, long j2) {
        Surface surface;
        int i2 = ggw0.f102568a;
        Trace.beginSection("releaseOutputBuffer");
        vmy0Var.mo107729h(i, j2);
        Trace.endSection();
        this.f92379T0.f150421e++;
        this.f72733p1 = 0;
        if (this.f72717A1 == null) {
            ueu0 ueu0Var = this.f72738u1;
            if (!ueu0Var.equals(ueu0.f176200e) && !ueu0Var.equals(this.f72739v1)) {
                this.f72739v1 = ueu0Var;
                this.f72720c1.m162487t(ueu0Var);
            }
            if (!this.f72722e1.m129141p() || (surface = this.f72727j1) == null) {
                return;
            }
            this.f72720c1.m162484q(surface);
            this.f72729l1 = true;
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m100003a1(vmy0 vmy0Var, int i, long j) {
        int i2 = ggw0.f102568a;
        Trace.beginSection("skipVideoBuffer");
        vmy0Var.mo107727e(i, false);
        Trace.endSection();
        this.f92379T0.f150422f++;
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: d0 */
    public final boolean mo100004d0(bny0 bny0Var) {
        return this.f72727j1 != null || m100000W0(bny0Var);
    }

    @Override // p149l.p5y0, p149l.u5y0
    /* JADX INFO: renamed from: e */
    public final String mo100005e() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p149l.g2r0
    /* JADX INFO: renamed from: i */
    public final boolean mo100006i(long j, long j2) {
        return j < -30000 && j2 > 100000;
    }

    @Override // p149l.g2r0
    /* JADX INFO: renamed from: j */
    public final boolean mo100007j(long j, long j2, long j3, boolean z, boolean z2) throws zziz {
        int iM146598J;
        if (j >= -500000 || z || (iM146598J = m146598J(j2)) == 0) {
            return false;
        }
        pnx0 pnx0Var = this.f92379T0;
        if (z2) {
            pnx0Var.f150420d += iM146598J;
            pnx0Var.f150422f += this.f72734q1;
        } else {
            pnx0Var.f150426j++;
            m99993R0(iM146598J, this.f72734q1);
        }
        m117314Z();
        if (this.f72717A1 == null) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m100008j0() {
        ueu0 ueu0Var = this.f72739v1;
        if (ueu0Var != null) {
            this.f72720c1.m162487t(ueu0Var);
        }
    }

    @Override // p149l.eny0, p149l.knx0, p149l.p5y0
    /* JADX INFO: renamed from: p */
    public final void mo100009p(float f, float f2) throws zziz {
        super.mo100009p(f, f2);
        this.f72722e1.m129139n(f);
        if (this.f72717A1 != null) {
            throw null;
        }
    }

    @Override // p149l.eny0, p149l.p5y0
    /* JADX INFO: renamed from: r */
    public final boolean mo100010r() {
        boolean z;
        zzaak zzaakVar;
        if (!super.mo100010r()) {
            z = false;
        } else {
            if (this.f72717A1 != null) {
                throw null;
            }
            z = true;
        }
        if (!z || (((zzaakVar = this.f72728k1) == null || this.f72727j1 != zzaakVar) && m117309L0() != null)) {
            return this.f72722e1.m129140o(z);
        }
        return true;
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: r0 */
    public final tnx0 mo100011r0(bny0 bny0Var, mhr0 mhr0Var, mhr0 mhr0Var2) {
        int i;
        int i2;
        tnx0 tnx0VarM102879b = bny0Var.m102879b(mhr0Var, mhr0Var2);
        int i3 = tnx0VarM102879b.f171297e;
        a2r0 a2r0Var = this.f72724g1;
        a2r0Var.getClass();
        if (mhr0Var2.f133897q > a2r0Var.f67284a || mhr0Var2.f133898r > a2r0Var.f67285b) {
            i3 |= 256;
        }
        if (m99977Y0(bny0Var, mhr0Var2) > a2r0Var.f67286c) {
            i3 |= 64;
        }
        String str = bny0Var.f76460a;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = tnx0VarM102879b.f171296d;
        }
        return new tnx0(str, mhr0Var, mhr0Var2, i2, i);
    }

    @Override // p149l.eny0
    @Nullable
    /* JADX INFO: renamed from: s0 */
    public final tnx0 mo100012s0(f0y0 f0y0Var) throws zziz {
        tnx0 tnx0VarMo100012s0 = super.mo100012s0(f0y0Var);
        mhr0 mhr0Var = f0y0Var.f94022a;
        mhr0Var.getClass();
        this.f72720c1.m162473f(mhr0Var, tnx0VarMo100012s0);
        return tnx0VarMo100012s0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.vmy0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [l.t3r0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [l.h2r0] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.google.android.gms.internal.ads.zzaak] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p149l.knx0, p149l.a5y0
    /* JADX INFO: renamed from: u */
    public final void mo95065u(int i, @Nullable Object obj) throws zziz {
        ?? M13534a;
        ?? r6;
        ?? r7;
        Surface surface;
        Surface surface2;
        if (i != 1) {
            if (i == 7) {
                obj.getClass();
                e2r0 e2r0Var = (e2r0) obj;
                this.f72743z1 = e2r0Var;
                this.f72719b1.mo187121f(e2r0Var);
                return;
            }
            if (i == 10) {
                obj.getClass();
                int iIntValue = ((Integer) obj).intValue();
                if (this.f72742y1 != iIntValue) {
                    this.f72742y1 = iIntValue;
                    return;
                }
                return;
            }
            if (i == 4) {
                obj.getClass();
                int iIntValue2 = ((Integer) obj).intValue();
                this.f72730m1 = iIntValue2;
                vmy0 vmy0VarM117309L0 = m117309L0();
                if (vmy0VarM117309L0 != null) {
                    vmy0VarM117309L0.mo107726d(iIntValue2);
                    return;
                }
                return;
            }
            if (i == 5) {
                h2r0 h2r0Var = this.f72722e1;
                obj.getClass();
                h2r0Var.m129135j(((Integer) obj).intValue());
                return;
            } else if (i == 13) {
                obj.getClass();
                this.f72719b1.mo187118c((List) obj);
                this.f72740w1 = true;
                return;
            } else {
                if (i != 14) {
                    return;
                }
                obj.getClass();
                w7w0 w7w0Var = (w7w0) obj;
                if (w7w0Var.m202083b() == 0 || w7w0Var.m202082a() == 0 || (surface2 = this.f72727j1) == null) {
                    return;
                }
                this.f72719b1.mo187122g(surface2, w7w0Var);
                return;
            }
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            M13534a = 0;
        }
        if (M13534a == 0) {
            zzaak zzaakVar = this.f72728k1;
            if (zzaakVar != null) {
                M13534a = surface;
                M13534a = zzaakVar;
            } else {
                bny0 bny0VarM117310N0 = m117310N0();
                if (bny0VarM117310N0 != null && m100000W0(bny0VarM117310N0)) {
                    M13534a = surface;
                    M13534a = zzaak.m13534a(this.f72718a1, bny0VarM117310N0.f76465f);
                    this.f72728k1 = M13534a;
                }
            }
        }
        M13534a = surface;
        M13534a = surface;
        M13534a = surface;
        if (this.f72727j1 == M13534a) {
            if (M13534a == 0 || M13534a == this.f72728k1) {
                return;
            }
            m100008j0();
            Surface surface3 = this.f72727j1;
            if (surface3 == null || !this.f72729l1) {
                return;
            }
            this.f72720c1.m162484q(surface3);
            return;
        }
        this.f72727j1 = M13534a;
        this.f72722e1.m129138m(M13534a);
        this.f72729l1 = false;
        int iMo146615s = mo146615s();
        ?? M117309L0 = m117309L0();
        if (M117309L0 != 0 && !this.f72719b1.zzk()) {
            if (ggw0.f102568a < 23) {
                r6 = M13534a;
                r6 = M13534a;
                r7 = M13534a;
                m117312W();
                m117311O0();
                r6 = r7;
            } else {
                if (M13534a != 0) {
                    r7 = M13534a;
                    if (!this.f72725h1) {
                        M117309L0.mo107724b(M13534a);
                        r6 = M13534a;
                    }
                } else {
                    r7 = 0;
                }
                r6 = M13534a;
                r6 = M13534a;
                r7 = M13534a;
                m117312W();
                m117311O0();
                r6 = r7;
            }
        }
        if (r6 == 0 || r6 == this.f72728k1) {
            this.f72739v1 = null;
            if (this.f72719b1.zzk()) {
                this.f72719b1.zzc();
            }
        } else {
            m100008j0();
            if (iMo146615s == 2) {
                this.f72722e1.m129128c();
            }
            if (this.f72719b1.zzk()) {
                this.f72719b1.mo187122g(r6, w7w0.f185113c);
            }
        }
        int i2 = ggw0.f102568a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.media.MediaCrypto] */
    @Override // p149l.eny0
    @TargetApi(17)
    /* JADX INFO: renamed from: v0 */
    public final rmy0 mo100013v0(bny0 bny0Var, mhr0 mhr0Var, @Nullable MediaCrypto mediaCrypto, float f) {
        rmy0 rmy0Var;
        Point pointM102878a;
        int i;
        Pair pairM137400a;
        int iM99976X0;
        zzaak zzaakVar = this.f72728k1;
        if (zzaakVar != null) {
            if (zzaakVar.zza != bny0Var.f76465f) {
                m99999V0();
            }
        }
        String str = bny0Var.f76462c;
        mhr0[] mhr0VarArrM146594F = m146594F();
        int iMax = mhr0Var.f133897q;
        int iMax2 = mhr0Var.f133898r;
        int iM99977Y0 = m99977Y0(bny0Var, mhr0Var);
        int length = mhr0VarArrM146594F.length;
        if (length == 1) {
            if (iM99977Y0 != -1 && (iM99976X0 = m99976X0(bny0Var, mhr0Var)) != -1) {
                iM99977Y0 = Math.min((int) (iM99977Y0 * 1.5f), iM99976X0);
            }
            rmy0Var = null;
        } else {
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                mhr0 mhr0VarM188591D = mhr0VarArrM146594F[i2];
                if (mhr0Var.f133904x != null && mhr0VarM188591D.f133904x == null) {
                    ter0 ter0VarM154634b = mhr0VarM188591D.m154634b();
                    ter0VarM154634b.m188592a(mhr0Var.f133904x);
                    mhr0VarM188591D = ter0VarM154634b.m188591D();
                }
                if (bny0Var.m102879b(mhr0Var, mhr0VarM188591D).f171296d != 0) {
                    int i3 = mhr0VarM188591D.f133897q;
                    z |= i3 == -1 || mhr0VarM188591D.f133898r == -1;
                    iMax = Math.max(iMax, i3);
                    iMax2 = Math.max(iMax2, mhr0VarM188591D.f133898r);
                    iM99977Y0 = Math.max(iM99977Y0, m99977Y0(bny0Var, mhr0VarM188591D));
                }
            }
            rmy0Var = null;
            if (z) {
                svv0.m186111f("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + BaseSei.f13930X + iMax2);
                int i4 = mhr0Var.f133898r;
                int i5 = mhr0Var.f133897q;
                boolean z2 = i4 > i5;
                int i6 = z2 ? i4 : i5;
                if (true == z2) {
                    i4 = i5;
                }
                int[] iArr = f72714B1;
                int i7 = 0;
                while (true) {
                    if (i7 < 9) {
                        float f2 = i4;
                        int[] iArr2 = iArr;
                        float f3 = i6;
                        int i8 = iArr2[i7];
                        int i9 = i7;
                        float f4 = i8;
                        if (i8 > i6 && (i = (int) (f4 * (f2 / f3))) > i4) {
                            int i10 = ggw0.f102568a;
                            int i11 = true != z2 ? i8 : i;
                            if (true != z2) {
                                i8 = i;
                            }
                            pointM102878a = bny0Var.m102878a(i11, i8);
                            float f5 = mhr0Var.f133899s;
                            if (pointM102878a != null) {
                                if (bny0Var.m102883g(pointM102878a.x, pointM102878a.y, f5)) {
                                    break;
                                }
                            }
                            i7 = i9 + 1;
                            iArr = iArr2;
                            i4 = i4;
                            z2 = z2;
                        }
                    }
                    pointM102878a = null;
                    break;
                }
                if (pointM102878a != null) {
                    iMax = Math.max(iMax, pointM102878a.x);
                    iMax2 = Math.max(iMax2, pointM102878a.y);
                    ter0 ter0VarM154634b2 = mhr0Var.m154634b();
                    ter0VarM154634b2.m188590C(iMax);
                    ter0VarM154634b2.m188600i(iMax2);
                    iM99977Y0 = Math.max(iM99977Y0, m99976X0(bny0Var, ter0VarM154634b2.m188591D()));
                    svv0.m186111f("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + BaseSei.f13930X + iMax2);
                }
            }
        }
        a2r0 a2r0Var = new a2r0(iMax, iMax2, iM99977Y0);
        this.f72724g1 = a2r0Var;
        boolean z3 = this.f72721d1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str);
        mediaFormat.setInteger("width", mhr0Var.f133897q);
        mediaFormat.setInteger("height", mhr0Var.f133898r);
        azv0.m99731b(mediaFormat, mhr0Var.f133894n);
        float f6 = mhr0Var.f133899s;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        azv0.m99730a(mediaFormat, "rotation-degrees", mhr0Var.f133900t);
        qny0 qny0Var = mhr0Var.f133904x;
        if (qny0Var != null) {
            azv0.m99730a(mediaFormat, "color-transfer", qny0Var.f155510c);
            azv0.m99730a(mediaFormat, "color-standard", qny0Var.f155508a);
            azv0.m99730a(mediaFormat, "color-range", qny0Var.f155509b);
            byte[] bArr = qny0Var.f155511d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(mhr0Var.f133892l) && (pairM137400a = ioy0.m137400a(mhr0Var)) != null) {
            azv0.m99730a(mediaFormat, "profile", ((Integer) pairM137400a.first).intValue());
        }
        mediaFormat.setInteger("max-width", a2r0Var.f67284a);
        mediaFormat.setInteger("max-height", a2r0Var.f67285b);
        azv0.m99730a(mediaFormat, "max-input-size", a2r0Var.f67286c);
        if (ggw0.f102568a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z3) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.f72727j1 == null) {
            if (!m100000W0(bny0Var)) {
                ohg0.m164364a();
                return rmy0Var;
            }
            if (this.f72728k1 == null) {
                this.f72728k1 = zzaak.m13534a(this.f72718a1, bny0Var.f76465f);
            }
            this.f72727j1 = this.f72728k1;
        }
        if (this.f72717A1 == null) {
            return rmy0.m180052b(bny0Var, mediaFormat, mhr0Var, this.f72727j1, rmy0Var);
        }
        throw rmy0Var;
    }

    @Override // p149l.eny0, p149l.p5y0
    @CallSuper
    /* JADX INFO: renamed from: w */
    public final void mo100014w(long j, long j2) throws Throwable {
        super.mo100014w(j, j2);
        if (this.f72717A1 == null) {
            return;
        }
        try {
            throw null;
        } catch (zzabn e) {
            throw m146601M(e, e.zza, false, 7001);
        }
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: w0 */
    public final List mo100015w0(xny0 xny0Var, mhr0 mhr0Var, boolean z) throws zzth {
        return ioy0.m137406g(m99975U0(this.f72718a1, xny0Var, mhr0Var, false, false), mhr0Var);
    }

    @Override // p149l.g2r0
    /* JADX INFO: renamed from: x */
    public final boolean mo100016x(long j, long j2, boolean z) {
        return j < -30000 && !z;
    }

    @Override // p149l.eny0
    @TargetApi(29)
    /* JADX INFO: renamed from: y0 */
    public final void mo100017y0(ylx0 ylx0Var) throws zziz {
        if (this.f72726i1) {
            ByteBuffer byteBuffer = ylx0Var.f198948g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        vmy0 vmy0VarM117309L0 = m117309L0();
                        vmy0VarM117309L0.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        vmy0VarM117309L0.mo107722F(bundle);
                    }
                }
            }
        }
    }

    @Override // p149l.knx0
    /* JADX INFO: renamed from: z */
    public final void mo100018z() {
        if (this.f72719b1.zzk()) {
            this.f72719b1.zze();
        }
    }

    @Override // p149l.eny0
    /* JADX INFO: renamed from: z0 */
    public final void mo100019z0(Exception exc) {
        svv0.m186109d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f72720c1.m162486s(exc);
    }

    @Override // p149l.eny0, p149l.p5y0
    public final boolean zzV() {
        if (!super.zzV()) {
            return false;
        }
        if (this.f72717A1 == null) {
            return true;
        }
        throw null;
    }

    @Override // p149l.knx0, p149l.p5y0
    public final void zzs() {
        this.f72722e1.m129127b();
    }
}
