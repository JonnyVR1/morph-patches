package p153l;

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
import com.google.android.gms.internal.ads.C2283u3;
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
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class hbr0 extends kwy0 implements mbr0 {

    /* JADX INFO: renamed from: B1 */
    public static final int[] f108613B1 = {WBConstants.SDK_NEW_PAY_VERSION, MMConstants.ERR_VCM_UNKNOWN_ERROR, 1440, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK, TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 854, 640, 540, 480};

    /* JADX INFO: renamed from: C1 */
    public static boolean f108614C1;

    /* JADX INFO: renamed from: D1 */
    public static boolean f108615D1;

    /* JADX INFO: renamed from: A1 */
    @Nullable
    public ycr0 f108616A1;

    /* JADX INFO: renamed from: a1 */
    public final Context f108617a1;

    /* JADX INFO: renamed from: b1 */
    public final zcr0 f108618b1;

    /* JADX INFO: renamed from: c1 */
    public final ucr0 f108619c1;

    /* JADX INFO: renamed from: d1 */
    public final boolean f108620d1;

    /* JADX INFO: renamed from: e1 */
    public final nbr0 f108621e1;

    /* JADX INFO: renamed from: f1 */
    public final lbr0 f108622f1;

    /* JADX INFO: renamed from: g1 */
    public gbr0 f108623g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f108624h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f108625i1;

    /* JADX INFO: renamed from: j1 */
    @Nullable
    public Surface f108626j1;

    /* JADX INFO: renamed from: k1 */
    @Nullable
    public zzaak f108627k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f108628l1;

    /* JADX INFO: renamed from: m1 */
    public int f108629m1;

    /* JADX INFO: renamed from: n1 */
    public long f108630n1;

    /* JADX INFO: renamed from: o1 */
    public int f108631o1;

    /* JADX INFO: renamed from: p1 */
    public int f108632p1;

    /* JADX INFO: renamed from: q1 */
    public int f108633q1;

    /* JADX INFO: renamed from: r1 */
    public long f108634r1;

    /* JADX INFO: renamed from: s1 */
    public int f108635s1;

    /* JADX INFO: renamed from: t1 */
    public long f108636t1;

    /* JADX INFO: renamed from: u1 */
    public aou0 f108637u1;

    /* JADX INFO: renamed from: v1 */
    @Nullable
    public aou0 f108638v1;

    /* JADX INFO: renamed from: w1 */
    public boolean f108639w1;

    /* JADX INFO: renamed from: x1 */
    public boolean f108640x1;

    /* JADX INFO: renamed from: y1 */
    public int f108641y1;

    /* JADX INFO: renamed from: z1 */
    @Nullable
    public kbr0 f108642z1;

    public hbr0(Context context, zvy0 zvy0Var, dxy0 dxy0Var, long j, boolean z, @Nullable Handler handler, @Nullable vcr0 vcr0Var, int i, float f) {
        super(2, zvy0Var, dxy0Var, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f108617a1 = applicationContext;
        this.f108619c1 = new ucr0(handler, vcr0Var);
        i7z0 i7z0Var = new i7z0(applicationContext);
        i7z0Var.m138989c(new nbr0(applicationContext, this, 0L));
        cbr0 cbr0VarM138990d = i7z0Var.m138990d();
        this.f108618b1 = cbr0VarM138990d;
        this.f108621e1 = cbr0VarM138990d.zza();
        this.f108622f1 = new lbr0();
        this.f108620d1 = "NVIDIA".equals(mpw0.f137959c);
        this.f108629m1 = 1;
        this.f108637u1 = aou0.f72640e;
        this.f108641y1 = 0;
        this.f108638v1 = null;
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
    public static final boolean m134364T0(java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 2286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p153l.hbr0.m134364T0(java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: U0 */
    public static List m134365U0(Context context, dxy0 dxy0Var, sqr0 sqr0Var, boolean z, boolean z2) throws zzth {
        String str = sqr0Var.f170251l;
        if (str == null) {
            return zzgaa.zzl();
        }
        if (mpw0.f137957a >= 26 && "video/dolby-vision".equals(str) && !fbr0.m124925a(context)) {
            List listM169762d = oxy0.m169762d(dxy0Var, sqr0Var, z, z2);
            if (!listM169762d.isEmpty()) {
                return listM169762d;
            }
        }
        return oxy0.m169764f(dxy0Var, sqr0Var, z, z2);
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
    */
    public static int m134366X0(hwy0 hwy0Var, sqr0 sqr0Var) {
        int iIntValue;
        int i = sqr0Var.f170256q;
        int i2 = sqr0Var.f170257r;
        if (i != -1 && i2 != -1) {
            String str = sqr0Var.f170251l;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairM169759a = oxy0.m169759a(sqr0Var);
                str = (pairM169759a == null || !((iIntValue = ((Integer) pairM169759a.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : YtVideoEncoder.MIME_TYPE;
            }
            int i3 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        return Math.max(2097152, ((i * i2) * 3) / 4);
                    }
                    break;
                case 1187890754:
                    break;
                case 1331836730:
                    if (str.equals(YtVideoEncoder.MIME_TYPE)) {
                        String str2 = mpw0.f137960d;
                        if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(mpw0.f137959c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !hwy0Var.f111956f)))) {
                            return ((((i + 15) / 16) * ((i2 + 15) / 16)) * 768) / 4;
                        }
                    }
                    break;
                case 1599127256:
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        i3 = 8;
                        return ((i * i2) * 3) / i3;
                    }
                    break;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: Y0 */
    public static int m134367Y0(hwy0 hwy0Var, sqr0 sqr0Var) {
        if (sqr0Var.f170252m == -1) {
            return m134366X0(hwy0Var, sqr0Var);
        }
        int size = sqr0Var.f170253n.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) sqr0Var.f170253n.get(i)).length;
        }
        return sqr0Var.f170252m + length;
    }

    @Override // p153l.kwy0, p153l.qwx0
    @TargetApi(17)
    /* JADX INFO: renamed from: A */
    public final void mo134368A() {
        try {
            super.mo134368A();
            this.f108640x1 = false;
            if (this.f108627k1 != null) {
            }
        } finally {
            this.f108640x1 = false;
            if (this.f108627k1 != null) {
                m134389V0();
            }
        }
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: A0 */
    public final void mo134369A0(String str, xvy0 xvy0Var, long j, long j2) {
        this.f108619c1.m195423a(str, j, j2);
        this.f108624h1 = m134364T0(str);
        hwy0 hwy0VarM151756N0 = m151756N0();
        hwy0VarM151756N0.getClass();
        boolean z = false;
        if (mpw0.f137957a >= 29 && "video/x-vnd.on2.vp9".equals(hwy0VarM151756N0.f111952b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : hwy0VarM151756N0.m137552h()) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.f108625i1 = z;
    }

    @Override // p153l.qwx0
    /* JADX INFO: renamed from: B */
    public final void mo134370B() {
        this.f108631o1 = 0;
        m178547L();
        this.f108630n1 = SystemClock.elapsedRealtime();
        this.f108634r1 = 0L;
        this.f108635s1 = 0;
        this.f108621e1.m162179g();
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: B0 */
    public final void mo134371B0(String str) {
        this.f108619c1.m195424b(str);
    }

    @Override // p153l.qwx0
    /* JADX INFO: renamed from: C */
    public final void mo134372C() {
        if (this.f108631o1 > 0) {
            m178547L();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f108619c1.m195426d(this.f108631o1, jElapsedRealtime - this.f108630n1);
            this.f108631o1 = 0;
            this.f108630n1 = jElapsedRealtime;
        }
        int i = this.f108635s1;
        if (i != 0) {
            this.f108619c1.m195440r(this.f108634r1, i);
            this.f108634r1 = 0L;
            this.f108635s1 = 0;
        }
        this.f108621e1.m162180h();
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: C0 */
    public final void mo134373C0(sqr0 sqr0Var, @Nullable MediaFormat mediaFormat) {
        bwy0 bwy0VarM151755L0 = m151755L0();
        if (bwy0VarM151755L0 != null) {
            bwy0VarM151755L0.mo106817d(this.f108629m1);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = sqr0Var.f170260u;
        int i = mpw0.f137957a;
        int i2 = sqr0Var.f170259t;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer2;
            integer2 = integer;
            integer = i3;
        }
        this.f108637u1 = new aou0(integer, integer2, 0, f);
        this.f108621e1.m162184l(sqr0Var.f170258s);
        if (this.f108616A1 == null) {
            return;
        }
        znr0 znr0VarM187559b = sqr0Var.m187559b();
        znr0VarM187559b.m220644C(integer);
        znr0VarM187559b.m220654i(integer2);
        znr0VarM187559b.m220671v(0);
        znr0VarM187559b.m220668s(f);
        znr0VarM187559b.m220645D();
        throw null;
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: E0 */
    public final void mo134374E0() {
        this.f108621e1.m162178f();
        int i = mpw0.f137957a;
        if (this.f108618b1.zzk()) {
            this.f108618b1.mo108656d(m151753J0());
        }
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: G0 */
    public final boolean mo134375G0(long j, long j2, @Nullable bwy0 bwy0Var, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, sqr0 sqr0Var) throws zziz {
        long j4;
        bwy0Var.getClass();
        long jM151753J0 = j3 - m151753J0();
        int iM162173a = this.f108621e1.m162173a(j3, j, j2, m151754K0(), z2, this.f108622f1);
        if (z && !z2) {
            m134393a1(bwy0Var, i, jM151753J0);
            return true;
        }
        if (this.f108626j1 == this.f108627k1) {
            if (this.f108622f1.m153593c() < HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
                m134393a1(bwy0Var, i, jM151753J0);
                m134385S0(this.f108622f1.m153593c());
                return true;
            }
        } else {
            if (this.f108616A1 != null) {
                try {
                    throw null;
                } catch (zzabn e) {
                    throw m178548M(e, e.zza, false, 7001);
                }
            }
            if (iM162173a == 0) {
                m178547L();
                long jNanoTime = System.nanoTime();
                int i4 = mpw0.f137957a;
                m134392Z0(bwy0Var, i, jM151753J0, jNanoTime);
                m134385S0(this.f108622f1.m153593c());
                return true;
            }
            if (iM162173a == 1) {
                lbr0 lbr0Var = this.f108622f1;
                long jM153594d = lbr0Var.m153594d();
                long jM153593c = lbr0Var.m153593c();
                int i5 = mpw0.f137957a;
                if (jM153594d == this.f108636t1) {
                    m134393a1(bwy0Var, i, jM151753J0);
                    j4 = jM153594d;
                } else {
                    m134392Z0(bwy0Var, i, jM151753J0, jM153594d);
                    j4 = jM153594d;
                }
                m134385S0(jM153593c);
                this.f108636t1 = j4;
                return true;
            }
            if (iM162173a == 2) {
                int i6 = mpw0.f137957a;
                Trace.beginSection("dropVideoBuffer");
                bwy0Var.mo106818e(i, false);
                Trace.endSection();
                m134383R0(0, 1);
                m134385S0(this.f108622f1.m153593c());
                return true;
            }
            if (iM162173a == 3) {
                m134393a1(bwy0Var, i, jM151753J0);
                m134385S0(this.f108622f1.m153593c());
                return true;
            }
        }
        return false;
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: I0 */
    public final int mo134376I0(evx0 evx0Var) {
        int i = mpw0.f137957a;
        return 0;
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: M0 */
    public final zzst mo134377M0(Throwable th, @Nullable hwy0 hwy0Var) {
        return new zzaae(th, hwy0Var, this.f108626j1);
    }

    @Override // p153l.kwy0, p153l.qwx0
    /* JADX INFO: renamed from: P */
    public final void mo134378P() {
        this.f108638v1 = null;
        this.f108621e1.m162176d();
        int i = mpw0.f137957a;
        this.f108628l1 = false;
        try {
            super.mo134378P();
        } finally {
            this.f108619c1.m195425c(this.f129134T0);
            this.f108619c1.m195442t(aou0.f72640e);
        }
    }

    @Override // p153l.kwy0
    @CallSuper
    /* JADX INFO: renamed from: P0 */
    public final void mo134379P0(long j) {
        super.mo134379P0(j);
        this.f108633q1--;
    }

    @Override // p153l.kwy0, p153l.qwx0
    /* JADX INFO: renamed from: Q */
    public final void mo134380Q(boolean z, boolean z2) throws zziz {
        super.mo134380Q(z, z2);
        m178549N();
        this.f108619c1.m195427e(this.f129134T0);
        this.f108621e1.m162177e(z2);
    }

    @Override // p153l.kwy0
    @CallSuper
    /* JADX INFO: renamed from: Q0 */
    public final void mo134381Q0(evx0 evx0Var) throws zziz {
        this.f108633q1++;
        int i = mpw0.f137957a;
    }

    @Override // p153l.qwx0
    /* JADX INFO: renamed from: R */
    public final void mo134382R() {
        nbr0 nbr0Var = this.f108621e1;
        mfv0 mfv0VarM178547L = m178547L();
        nbr0Var.m162183k(mfv0VarM178547L);
        this.f108618b1.mo108657e(mfv0VarM178547L);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m134383R0(int i, int i2) {
        vwx0 vwx0Var = this.f129134T0;
        vwx0Var.f186210h += i;
        int i3 = i + i2;
        vwx0Var.f186209g += i3;
        this.f108631o1 += i3;
        int i4 = this.f108632p1 + i3;
        this.f108632p1 = i4;
        vwx0Var.f186211i = Math.max(i4, vwx0Var.f186211i);
    }

    @Override // p153l.kwy0, p153l.qwx0
    /* JADX INFO: renamed from: S */
    public final void mo134384S(long j, boolean z) throws zziz {
        if (this.f108616A1 != null) {
            throw null;
        }
        super.mo134384S(j, z);
        if (this.f108618b1.zzk()) {
            this.f108618b1.mo108656d(m151753J0());
        }
        this.f108621e1.m162181i();
        if (z) {
            this.f108621e1.m162175c();
        }
        int i = mpw0.f137957a;
        this.f108632p1 = 0;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m134385S0(long j) {
        vwx0 vwx0Var = this.f129134T0;
        vwx0Var.f186213k += j;
        vwx0Var.f186214l++;
        this.f108634r1 += j;
        this.f108635s1++;
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: T */
    public final float mo134386T(float f, sqr0 sqr0Var, sqr0[] sqr0VarArr) {
        float fMax = -1.0f;
        for (sqr0 sqr0Var2 : sqr0VarArr) {
            float f2 = sqr0Var2.f170258s;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: U */
    public final int mo134387U(dxy0 dxy0Var, sqr0 sqr0Var) throws zzth {
        boolean z;
        if (!a8t0.m96496h(sqr0Var.f170251l)) {
            return 128;
        }
        int i = 1;
        int i2 = 0;
        boolean z2 = sqr0Var.f170254o != null;
        List listM134365U0 = m134365U0(this.f108617a1, dxy0Var, sqr0Var, z2, false);
        if (z2 && listM134365U0.isEmpty()) {
            listM134365U0 = m134365U0(this.f108617a1, dxy0Var, sqr0Var, false, false);
        }
        if (!listM134365U0.isEmpty()) {
            if (kwy0.m151746e0(sqr0Var)) {
                hwy0 hwy0Var = (hwy0) listM134365U0.get(0);
                boolean zM137549e = hwy0Var.m137549e(sqr0Var);
                if (!zM137549e) {
                    int i3 = 1;
                    while (true) {
                        if (i3 >= listM134365U0.size()) {
                            z = true;
                            break;
                        }
                        hwy0 hwy0Var2 = (hwy0) listM134365U0.get(i3);
                        if (hwy0Var2.m137549e(sqr0Var)) {
                            zM137549e = true;
                            z = false;
                            hwy0Var = hwy0Var2;
                            break;
                        }
                        i3++;
                    }
                } else {
                    z = true;
                    break;
                }
                int i4 = true != zM137549e ? 3 : 4;
                int i5 = true != hwy0Var.m137550f(sqr0Var) ? 8 : 16;
                int i6 = true != hwy0Var.f111957g ? 0 : 64;
                int i7 = true != z ? 0 : 128;
                if (mpw0.f137957a >= 26 && "video/dolby-vision".equals(sqr0Var.f170251l) && !fbr0.m124925a(this.f108617a1)) {
                    i7 = 256;
                }
                if (zM137549e) {
                    List listM134365U1 = m134365U0(this.f108617a1, dxy0Var, sqr0Var, z2, true);
                    if (!listM134365U1.isEmpty()) {
                        hwy0 hwy0Var3 = (hwy0) oxy0.m169765g(listM134365U1, sqr0Var).get(0);
                        if (hwy0Var3.m137549e(sqr0Var) && hwy0Var3.m137550f(sqr0Var)) {
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

    @Override // p153l.kwy0
    @CallSuper
    /* JADX INFO: renamed from: V */
    public final void mo134388V(sqr0 sqr0Var) throws zziz {
        if (this.f108639w1 && !this.f108640x1 && !this.f108618b1.zzk()) {
            try {
                this.f108618b1.mo108654b(sqr0Var);
                this.f108618b1.mo108656d(m151753J0());
                kbr0 kbr0Var = this.f108642z1;
                if (kbr0Var != null) {
                    this.f108618b1.mo108658f(kbr0Var);
                }
            } catch (zzabn e) {
                throw m178548M(e, sqr0Var, false, PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED);
            }
        }
        if (this.f108616A1 != null || !this.f108618b1.zzk()) {
            this.f108640x1 = true;
        } else {
            this.f108616A1 = this.f108618b1.zzb();
            C2283u3.m13395b();
            throw null;
        }
    }

    @RequiresApi(17)
    /* JADX INFO: renamed from: V0 */
    public final void m134389V0() {
        Surface surface = this.f108626j1;
        zzaak zzaakVar = this.f108627k1;
        if (surface == zzaakVar) {
            this.f108626j1 = null;
        }
        if (zzaakVar != null) {
            zzaakVar.release();
            this.f108627k1 = null;
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m134390W0(hwy0 hwy0Var) {
        if (mpw0.f137957a < 23 || m134364T0(hwy0Var.f111951a)) {
            return false;
        }
        return !hwy0Var.f111956f || zzaak.m13589b(this.f108617a1);
    }

    @Override // p153l.kwy0
    @CallSuper
    /* JADX INFO: renamed from: X */
    public final void mo134391X() {
        super.mo134391X();
        this.f108633q1 = 0;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: Z0 */
    public final void m134392Z0(bwy0 bwy0Var, int i, long j, long j2) {
        Surface surface;
        int i2 = mpw0.f137957a;
        Trace.beginSection("releaseOutputBuffer");
        bwy0Var.mo106820h(i, j2);
        Trace.endSection();
        this.f129134T0.f186207e++;
        this.f108632p1 = 0;
        if (this.f108616A1 == null) {
            aou0 aou0Var = this.f108637u1;
            if (!aou0Var.equals(aou0.f72640e) && !aou0Var.equals(this.f108638v1)) {
                this.f108638v1 = aou0Var;
                this.f108619c1.m195442t(aou0Var);
            }
            if (!this.f108621e1.m162188p() || (surface = this.f108626j1) == null) {
                return;
            }
            this.f108619c1.m195439q(surface);
            this.f108628l1 = true;
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m134393a1(bwy0 bwy0Var, int i, long j) {
        int i2 = mpw0.f137957a;
        Trace.beginSection("skipVideoBuffer");
        bwy0Var.mo106818e(i, false);
        Trace.endSection();
        this.f129134T0.f186208f++;
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: d0 */
    public final boolean mo134394d0(hwy0 hwy0Var) {
        return this.f108626j1 != null || m134390W0(hwy0Var);
    }

    @Override // p153l.vey0, p153l.afy0
    /* JADX INFO: renamed from: e */
    public final String mo97571e() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p153l.mbr0
    /* JADX INFO: renamed from: i */
    public final boolean mo134395i(long j, long j2) {
        return j < -30000 && j2 > 100000;
    }

    @Override // p153l.mbr0
    /* JADX INFO: renamed from: j */
    public final boolean mo134396j(long j, long j2, long j3, boolean z, boolean z2) throws zziz {
        int iM178545J;
        if (j >= -500000 || z || (iM178545J = m178545J(j2)) == 0) {
            return false;
        }
        vwx0 vwx0Var = this.f129134T0;
        if (z2) {
            vwx0Var.f186206d += iM178545J;
            vwx0Var.f186208f += this.f108633q1;
        } else {
            vwx0Var.f186212j++;
            m134383R0(iM178545J, this.f108633q1);
        }
        m151760Z();
        if (this.f108616A1 == null) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m134397j0() {
        aou0 aou0Var = this.f108638v1;
        if (aou0Var != null) {
            this.f108619c1.m195442t(aou0Var);
        }
    }

    @Override // p153l.kwy0, p153l.qwx0, p153l.vey0
    /* JADX INFO: renamed from: p */
    public final void mo134398p(float f, float f2) throws zziz {
        super.mo134398p(f, f2);
        this.f108621e1.m162186n(f);
        if (this.f108616A1 != null) {
            throw null;
        }
    }

    @Override // p153l.kwy0, p153l.vey0
    /* JADX INFO: renamed from: r */
    public final boolean mo134399r() {
        boolean z;
        zzaak zzaakVar;
        if (!super.mo134399r()) {
            z = false;
        } else {
            if (this.f108616A1 != null) {
                throw null;
            }
            z = true;
        }
        if (!z || (((zzaakVar = this.f108627k1) == null || this.f108626j1 != zzaakVar) && m151755L0() != null)) {
            return this.f108621e1.m162187o(z);
        }
        return true;
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: r0 */
    public final zwx0 mo134400r0(hwy0 hwy0Var, sqr0 sqr0Var, sqr0 sqr0Var2) {
        int i;
        int i2;
        zwx0 zwx0VarM137547b = hwy0Var.m137547b(sqr0Var, sqr0Var2);
        int i3 = zwx0VarM137547b.f206398e;
        gbr0 gbr0Var = this.f108623g1;
        gbr0Var.getClass();
        if (sqr0Var2.f170256q > gbr0Var.f103486a || sqr0Var2.f170257r > gbr0Var.f103487b) {
            i3 |= 256;
        }
        if (m134367Y0(hwy0Var, sqr0Var2) > gbr0Var.f103488c) {
            i3 |= 64;
        }
        String str = hwy0Var.f111951a;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zwx0VarM137547b.f206397d;
        }
        return new zwx0(str, sqr0Var, sqr0Var2, i2, i);
    }

    @Override // p153l.kwy0
    @Nullable
    /* JADX INFO: renamed from: s0 */
    public final zwx0 mo134401s0(l9y0 l9y0Var) throws zziz {
        zwx0 zwx0VarMo134401s0 = super.mo134401s0(l9y0Var);
        sqr0 sqr0Var = l9y0Var.f130645a;
        sqr0Var.getClass();
        this.f108619c1.m195428f(sqr0Var, zwx0VarMo134401s0);
        return zwx0VarMo134401s0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.bwy0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [l.zcr0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [l.nbr0] */
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
    @Override // p153l.qwx0, p153l.gey0
    /* JADX INFO: renamed from: u */
    public final void mo119682u(int i, @Nullable Object obj) throws zziz {
        ?? M13588a;
        ?? r6;
        ?? r7;
        Surface surface;
        Surface surface2;
        if (i != 1) {
            if (i == 7) {
                obj.getClass();
                kbr0 kbr0Var = (kbr0) obj;
                this.f108642z1 = kbr0Var;
                this.f108618b1.mo108658f(kbr0Var);
                return;
            }
            if (i == 10) {
                obj.getClass();
                int iIntValue = ((Integer) obj).intValue();
                if (this.f108641y1 != iIntValue) {
                    this.f108641y1 = iIntValue;
                    return;
                }
                return;
            }
            if (i == 4) {
                obj.getClass();
                int iIntValue2 = ((Integer) obj).intValue();
                this.f108629m1 = iIntValue2;
                bwy0 bwy0VarM151755L0 = m151755L0();
                if (bwy0VarM151755L0 != null) {
                    bwy0VarM151755L0.mo106817d(iIntValue2);
                    return;
                }
                return;
            }
            if (i == 5) {
                nbr0 nbr0Var = this.f108621e1;
                obj.getClass();
                nbr0Var.m162182j(((Integer) obj).intValue());
                return;
            } else if (i == 13) {
                obj.getClass();
                this.f108618b1.mo108655c((List) obj);
                this.f108639w1 = true;
                return;
            } else {
                if (i != 14) {
                    return;
                }
                obj.getClass();
                chw0 chw0Var = (chw0) obj;
                if (chw0Var.m109848b() == 0 || chw0Var.m109847a() == 0 || (surface2 = this.f108626j1) == null) {
                    return;
                }
                this.f108618b1.mo108659g(surface2, chw0Var);
                return;
            }
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            M13588a = 0;
        }
        if (M13588a == 0) {
            zzaak zzaakVar = this.f108627k1;
            if (zzaakVar != null) {
                M13588a = surface;
                M13588a = zzaakVar;
            } else {
                hwy0 hwy0VarM151756N0 = m151756N0();
                if (hwy0VarM151756N0 != null && m134390W0(hwy0VarM151756N0)) {
                    M13588a = surface;
                    M13588a = zzaak.m13588a(this.f108617a1, hwy0VarM151756N0.f111956f);
                    this.f108627k1 = M13588a;
                }
            }
        }
        M13588a = surface;
        M13588a = surface;
        M13588a = surface;
        if (this.f108626j1 == M13588a) {
            if (M13588a == 0 || M13588a == this.f108627k1) {
                return;
            }
            m134397j0();
            Surface surface3 = this.f108626j1;
            if (surface3 == null || !this.f108628l1) {
                return;
            }
            this.f108619c1.m195439q(surface3);
            return;
        }
        this.f108626j1 = M13588a;
        this.f108621e1.m162185m(M13588a);
        this.f108628l1 = false;
        int iMo178561s = mo178561s();
        ?? M151755L0 = m151755L0();
        if (M151755L0 != 0 && !this.f108618b1.zzk()) {
            if (mpw0.f137957a < 23) {
                r6 = M13588a;
                r6 = M13588a;
                r7 = M13588a;
                m151758W();
                m151757O0();
                r6 = r7;
            } else {
                if (M13588a != 0) {
                    r7 = M13588a;
                    if (!this.f108624h1) {
                        M151755L0.mo106815b(M13588a);
                        r6 = M13588a;
                    }
                } else {
                    r7 = 0;
                }
                r6 = M13588a;
                r6 = M13588a;
                r7 = M13588a;
                m151758W();
                m151757O0();
                r6 = r7;
            }
        }
        if (r6 == 0 || r6 == this.f108627k1) {
            this.f108638v1 = null;
            if (this.f108618b1.zzk()) {
                this.f108618b1.zzc();
            }
        } else {
            m134397j0();
            if (iMo178561s == 2) {
                this.f108621e1.m162175c();
            }
            if (this.f108618b1.zzk()) {
                this.f108618b1.mo108659g(r6, chw0.f81875c);
            }
        }
        int i2 = mpw0.f137957a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.media.MediaCrypto] */
    @Override // p153l.kwy0
    @TargetApi(17)
    /* JADX INFO: renamed from: v0 */
    public final xvy0 mo134402v0(hwy0 hwy0Var, sqr0 sqr0Var, @Nullable MediaCrypto mediaCrypto, float f) {
        xvy0 xvy0Var;
        Point pointM137546a;
        int i;
        Pair pairM169759a;
        int iM134366X0;
        zzaak zzaakVar = this.f108627k1;
        if (zzaakVar != null) {
            if (zzaakVar.zza != hwy0Var.f111956f) {
                m134389V0();
            }
        }
        String str = hwy0Var.f111953c;
        sqr0[] sqr0VarArrM178541F = m178541F();
        int iMax = sqr0Var.f170256q;
        int iMax2 = sqr0Var.f170257r;
        int iM134367Y0 = m134367Y0(hwy0Var, sqr0Var);
        int length = sqr0VarArrM178541F.length;
        if (length == 1) {
            if (iM134367Y0 != -1 && (iM134366X0 = m134366X0(hwy0Var, sqr0Var)) != -1) {
                iM134367Y0 = Math.min((int) (iM134367Y0 * 1.5f), iM134366X0);
            }
            xvy0Var = null;
        } else {
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                sqr0 sqr0VarM220645D = sqr0VarArrM178541F[i2];
                if (sqr0Var.f170263x != null && sqr0VarM220645D.f170263x == null) {
                    znr0 znr0VarM187559b = sqr0VarM220645D.m187559b();
                    znr0VarM187559b.m220646a(sqr0Var.f170263x);
                    sqr0VarM220645D = znr0VarM187559b.m220645D();
                }
                if (hwy0Var.m137547b(sqr0Var, sqr0VarM220645D).f206397d != 0) {
                    int i3 = sqr0VarM220645D.f170256q;
                    z |= i3 == -1 || sqr0VarM220645D.f170257r == -1;
                    iMax = Math.max(iMax, i3);
                    iMax2 = Math.max(iMax2, sqr0VarM220645D.f170257r);
                    iM134367Y0 = Math.max(iM134367Y0, m134367Y0(hwy0Var, sqr0VarM220645D));
                }
            }
            xvy0Var = null;
            if (z) {
                y4w0.m214278f("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + BaseSei.f14624X + iMax2);
                int i4 = sqr0Var.f170257r;
                int i5 = sqr0Var.f170256q;
                boolean z2 = i4 > i5;
                int i6 = z2 ? i4 : i5;
                if (true == z2) {
                    i4 = i5;
                }
                int[] iArr = f108613B1;
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
                            int i10 = mpw0.f137957a;
                            int i11 = true != z2 ? i8 : i;
                            if (true != z2) {
                                i8 = i;
                            }
                            pointM137546a = hwy0Var.m137546a(i11, i8);
                            float f5 = sqr0Var.f170258s;
                            if (pointM137546a != null) {
                                if (hwy0Var.m137551g(pointM137546a.x, pointM137546a.y, f5)) {
                                    break;
                                }
                            }
                            i7 = i9 + 1;
                            iArr = iArr2;
                            i4 = i4;
                            z2 = z2;
                        }
                    }
                    pointM137546a = null;
                    break;
                }
                if (pointM137546a != null) {
                    iMax = Math.max(iMax, pointM137546a.x);
                    iMax2 = Math.max(iMax2, pointM137546a.y);
                    znr0 znr0VarM187559b2 = sqr0Var.m187559b();
                    znr0VarM187559b2.m220644C(iMax);
                    znr0VarM187559b2.m220654i(iMax2);
                    iM134367Y0 = Math.max(iM134367Y0, m134366X0(hwy0Var, znr0VarM187559b2.m220645D()));
                    y4w0.m214278f("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + BaseSei.f14624X + iMax2);
                }
            }
        }
        gbr0 gbr0Var = new gbr0(iMax, iMax2, iM134367Y0);
        this.f108623g1 = gbr0Var;
        boolean z3 = this.f108620d1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str);
        mediaFormat.setInteger("width", sqr0Var.f170256q);
        mediaFormat.setInteger("height", sqr0Var.f170257r);
        g8w0.m129465b(mediaFormat, sqr0Var.f170253n);
        float f6 = sqr0Var.f170258s;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        g8w0.m129464a(mediaFormat, "rotation-degrees", sqr0Var.f170259t);
        wwy0 wwy0Var = sqr0Var.f170263x;
        if (wwy0Var != null) {
            g8w0.m129464a(mediaFormat, "color-transfer", wwy0Var.f191349c);
            g8w0.m129464a(mediaFormat, "color-standard", wwy0Var.f191347a);
            g8w0.m129464a(mediaFormat, "color-range", wwy0Var.f191348b);
            byte[] bArr = wwy0Var.f191350d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(sqr0Var.f170251l) && (pairM169759a = oxy0.m169759a(sqr0Var)) != null) {
            g8w0.m129464a(mediaFormat, "profile", ((Integer) pairM169759a.first).intValue());
        }
        mediaFormat.setInteger("max-width", gbr0Var.f103486a);
        mediaFormat.setInteger("max-height", gbr0Var.f103487b);
        g8w0.m129464a(mediaFormat, "max-input-size", gbr0Var.f103488c);
        if (mpw0.f137957a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z3) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.f108626j1 == null) {
            if (!m134390W0(hwy0Var)) {
                wpg0.m207458a();
                return xvy0Var;
            }
            if (this.f108627k1 == null) {
                this.f108627k1 = zzaak.m13588a(this.f108617a1, hwy0Var.f111956f);
            }
            this.f108626j1 = this.f108627k1;
        }
        if (this.f108616A1 == null) {
            return xvy0.m213282b(hwy0Var, mediaFormat, sqr0Var, this.f108626j1, xvy0Var);
        }
        throw xvy0Var;
    }

    @Override // p153l.kwy0, p153l.vey0
    @CallSuper
    /* JADX INFO: renamed from: w */
    public final void mo134403w(long j, long j2) throws Throwable {
        super.mo134403w(j, j2);
        if (this.f108616A1 == null) {
            return;
        }
        try {
            throw null;
        } catch (zzabn e) {
            throw m178548M(e, e.zza, false, 7001);
        }
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: w0 */
    public final List mo134404w0(dxy0 dxy0Var, sqr0 sqr0Var, boolean z) throws zzth {
        return oxy0.m169765g(m134365U0(this.f108617a1, dxy0Var, sqr0Var, false, false), sqr0Var);
    }

    @Override // p153l.mbr0
    /* JADX INFO: renamed from: x */
    public final boolean mo134405x(long j, long j2, boolean z) {
        return j < -30000 && !z;
    }

    @Override // p153l.kwy0
    @TargetApi(29)
    /* JADX INFO: renamed from: y0 */
    public final void mo134406y0(evx0 evx0Var) throws zziz {
        if (this.f108625i1) {
            ByteBuffer byteBuffer = evx0Var.f96060g;
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
                        bwy0 bwy0VarM151755L0 = m151755L0();
                        bwy0VarM151755L0.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        bwy0VarM151755L0.mo106813F(bundle);
                    }
                }
            }
        }
    }

    @Override // p153l.qwx0
    /* JADX INFO: renamed from: z */
    public final void mo134407z() {
        if (this.f108618b1.zzk()) {
            this.f108618b1.zze();
        }
    }

    @Override // p153l.kwy0
    /* JADX INFO: renamed from: z0 */
    public final void mo134408z0(Exception exc) {
        y4w0.m214276d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f108619c1.m195441s(exc);
    }

    @Override // p153l.kwy0, p153l.vey0
    public final boolean zzV() {
        if (!super.zzV()) {
            return false;
        }
        if (this.f108616A1 == null) {
            return true;
        }
        throw null;
    }

    @Override // p153l.qwx0, p153l.vey0
    public final void zzs() {
        this.f108621e1.m162174b();
    }
}
