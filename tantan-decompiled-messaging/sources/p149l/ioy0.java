package p149l;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzth;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"InlinedApi"})
public final class ioy0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f114216a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b */
    @GuardedBy("MediaCodecUtil.class")
    public static final HashMap f114217b = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:102:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:104:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:193:0x032b A[PHI: r4
      0x032b: PHI (r4v23 int) = (r4v22 int), (r4v25 int), (r4v26 int), (r4v27 int), (r4v28 int) binds: [B:176:0x0308, B:179:0x030e, B:181:0x0312, B:183:0x0316, B:185:0x031a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:319:0x054e  */
    /* JADX WARN: Code duplicated, block: B:321:0x0556  */
    /* JADX WARN: Code duplicated, block: B:325:0x056a A[Catch: NumberFormatException -> 0x0641, TryCatch #0 {NumberFormatException -> 0x0641, blocks: (B:323:0x0562, B:325:0x056a, B:327:0x0584, B:379:0x0631), top: B:438:0x0562 }] */
    /* JADX WARN: Code duplicated, block: B:326:0x0582 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:327:0x0584 A[Catch: NumberFormatException -> 0x0641, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0641, blocks: (B:323:0x0562, B:325:0x056a, B:327:0x0584, B:379:0x0631), top: B:438:0x0562 }] */
    /* JADX WARN: Code duplicated, block: B:330:0x0596  */
    /* JADX WARN: Code duplicated, block: B:332:0x059a  */
    /* JADX WARN: Code duplicated, block: B:334:0x059e  */
    /* JADX WARN: Code duplicated, block: B:336:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:338:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:340:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:342:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:343:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:344:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:345:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:346:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:347:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:348:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:349:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:351:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:353:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:354:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:355:0x05da  */
    /* JADX WARN: Code duplicated, block: B:356:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:357:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:358:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:359:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:360:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:361:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:362:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:363:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:364:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:365:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:366:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:367:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:368:0x0600  */
    /* JADX WARN: Code duplicated, block: B:369:0x0603  */
    /* JADX WARN: Code duplicated, block: B:370:0x0606  */
    /* JADX WARN: Code duplicated, block: B:371:0x0609  */
    /* JADX WARN: Code duplicated, block: B:372:0x060c  */
    /* JADX WARN: Code duplicated, block: B:373:0x060e  */
    /* JADX WARN: Code duplicated, block: B:375:0x0611  */
    /* JADX WARN: Code duplicated, block: B:377:0x0623  */
    /* JADX WARN: Code duplicated, block: B:379:0x0631 A[Catch: NumberFormatException -> 0x0641, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0641, blocks: (B:323:0x0562, B:325:0x056a, B:327:0x0584, B:379:0x0631), top: B:438:0x0562 }] */
    /* JADX WARN: Code duplicated, block: B:438:0x0562 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:461:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0130  */
    /* JADX WARN: Code duplicated, block: B:55:0x013e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0142  */
    /* JADX WARN: Code duplicated, block: B:58:0x0146  */
    /* JADX WARN: Code duplicated, block: B:60:0x014d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0151  */
    /* JADX WARN: Code duplicated, block: B:64:0x0159  */
    /* JADX WARN: Code duplicated, block: B:65:0x015d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0165  */
    /* JADX WARN: Code duplicated, block: B:68:0x0169  */
    /* JADX WARN: Code duplicated, block: B:70:0x0171  */
    /* JADX WARN: Code duplicated, block: B:71:0x0175  */
    /* JADX WARN: Code duplicated, block: B:73:0x017d  */
    /* JADX WARN: Code duplicated, block: B:74:0x017f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0185  */
    /* JADX WARN: Code duplicated, block: B:77:0x0188  */
    /* JADX WARN: Code duplicated, block: B:79:0x018e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0191  */
    /* JADX WARN: Code duplicated, block: B:82:0x0197  */
    /* JADX WARN: Code duplicated, block: B:83:0x0199  */
    /* JADX WARN: Code duplicated, block: B:85:0x019f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c5  */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0352, code lost:
    
        if (r4.equals(com.coremedia.iso.boxes.sampleentry.VisualSampleEntry.TYPE6) != false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x035b, code lost:
    
        if (r4.equals(com.coremedia.iso.boxes.sampleentry.VisualSampleEntry.TYPE7) != false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x035d, code lost:
    
        r2 = r34.f133889i;
        r0 = r34.f133904x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0364, code lost:
    
        if (r11.length >= 4) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0366, code lost:
    
        p149l.svv0.m186111f("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(java.lang.String.valueOf(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0371, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0372, code lost:
    
        r3 = p149l.ioy0.f114216a.matcher(r11[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x037e, code lost:
    
        if (r3.matches() != false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0380, code lost:
    
        p149l.svv0.m186111f("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(java.lang.String.valueOf(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x038b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x038c, code lost:
    
        r2 = r3.group(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0396, code lost:
    
        if ("1".equals(r2) == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0398, code lost:
    
        r24 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03a1, code lost:
    
        if ("2".equals(r2) == false) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03a3, code lost:
    
        if (r0 == null) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03a7, code lost:
    
        if (r0.f155510c != 6) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03a9, code lost:
    
        r24 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03ac, code lost:
    
        r24 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03ae, code lost:
    
        r0 = r11[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x03b0, code lost:
    
        if (r0 != null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03b2, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x03ba, code lost:
    
        switch(r0.hashCode()) {
            case 70821: goto L304;
            case 70914: goto L301;
            case 70917: goto L298;
            case 71007: goto L295;
            case 71010: goto L292;
            case 74665: goto L289;
            case 74758: goto L286;
            case 74761: goto L283;
            case 74851: goto L280;
            case 74854: goto L277;
            case 2193639: goto L274;
            case 2193642: goto L271;
            case 2193732: goto L268;
            case 2193735: goto L265;
            case 2193738: goto L262;
            case 2193825: goto L259;
            case 2193828: goto L256;
            case 2193831: goto L253;
            case 2312803: goto L250;
            case 2312806: goto L247;
            case 2312896: goto L244;
            case 2312899: goto L241;
            case 2312902: goto L238;
            case 2312989: goto L235;
            case 2312992: goto L232;
            case 2312995: goto L229;
            default: goto L495;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x03c4, code lost:
    
        if (r0.equals("L186") == false) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x03c6, code lost:
    
        r2 = 16777216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03d4, code lost:
    
        if (r0.equals("L183") == false) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03d6, code lost:
    
        r2 = 4194304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03e4, code lost:
    
        if (r0.equals("L180") == false) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03e6, code lost:
    
        r2 = 1048576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x03f4, code lost:
    
        if (r0.equals("L156") == false) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x03f6, code lost:
    
        r2 = 262144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0404, code lost:
    
        if (r0.equals("L153") == false) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0406, code lost:
    
        r2 = 65536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0412, code lost:
    
        if (r0.equals("L150") == false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0414, code lost:
    
        r2 = 16384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0420, code lost:
    
        if (r0.equals("L123") == false) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0422, code lost:
    
        r2 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x042c, code lost:
    
        if (r0.equals("L120") == false) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0438, code lost:
    
        if (r0.equals("H186") == false) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x043a, code lost:
    
        r2 = 33554432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0448, code lost:
    
        if (r0.equals("H183") == false) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x044a, code lost:
    
        r2 = 8388608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0458, code lost:
    
        if (r0.equals("H180") == false) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x045a, code lost:
    
        r2 = 2097152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0468, code lost:
    
        if (r0.equals("H156") == false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x046a, code lost:
    
        r2 = 524288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0478, code lost:
    
        if (r0.equals("H153") == false) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x047a, code lost:
    
        r2 = 131072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0488, code lost:
    
        if (r0.equals("H150") == false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x048a, code lost:
    
        r2 = 32768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0496, code lost:
    
        if (r0.equals("H123") == false) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0498, code lost:
    
        r2 = 8192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x04a4, code lost:
    
        if (r0.equals("H120") == false) goto L484;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x04a6, code lost:
    
        r2 = 2048;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x04b0, code lost:
    
        if (r0.equals("L93") == false) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x04b2, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x04bc, code lost:
    
        if (r0.equals("L90") == false) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04be, code lost:
    
        r2 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x04c6, code lost:
    
        if (r0.equals("L63") == false) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x04c8, code lost:
    
        r2 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x04d1, code lost:
    
        if (r0.equals("L60") == false) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x04d3, code lost:
    
        r2 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x04dc, code lost:
    
        if (r0.equals("L30") == false) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x04de, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x04e7, code lost:
    
        if (r0.equals("H93") == false) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x04e9, code lost:
    
        r2 = 512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x04f1, code lost:
    
        if (r0.equals("H90") == false) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x04f3, code lost:
    
        r2 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x04fc, code lost:
    
        if (r0.equals("H63") == false) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x04fe, code lost:
    
        r2 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0506, code lost:
    
        if (r0.equals("H60") == false) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0508, code lost:
    
        r2 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0511, code lost:
    
        if (r0.equals("H30") == false) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0513, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0515, code lost:
    
        if (r2 != null) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0517, code lost:
    
        r2 = 1024;
        p149l.svv0.m186111f("MediaCodecUtil", "Unknown HEVC level string: ".concat(java.lang.String.valueOf(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0524, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0525, code lost:
    
        1024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x052e, code lost:
    
        return new android.util.Pair(java.lang.Integer.valueOf(r24), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x052f, code lost:
    
        p149l.svv0.m186111f("MediaCodecUtil", "Unknown HEVC profile string: ".concat(java.lang.String.valueOf(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x053c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v4 int, still in use, count: 1, list:
      (r11v4 int) from 0x014d: SWITCH (r11v4 int)
     case 1567: goto B:71:0x0175
     case 1568: goto B:68:0x0169
     case 1569: goto B:65:0x015d
     case 1570: goto B:62:0x0151
     default: goto B:468:? A[RegionRef:SW:60] (LINE:334)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:351:0x05c2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:375:0x0611, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:379:0x0631, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x0146, please report this as an issue */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair m137400a(p149l.mhr0 r34) {
        /*
            Method dump skipped, instruction units count: 2172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.ioy0.m137400a(l.mhr0):android.util.Pair");
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static bny0 m137401b() throws zzth {
        List listM137404e = m137404e("audio/raw", false, false);
        if (listM137404e.isEmpty()) {
            return null;
        }
        return (bny0) listM137404e.get(0);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static String m137402c(mhr0 mhr0Var) {
        Pair pairM137400a;
        if ("audio/eac3-joc".equals(mhr0Var.f133892l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(mhr0Var.f133892l) || (pairM137400a = m137400a(mhr0Var)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairM137400a.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return YtVideoEncoder.MIME_TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static List m137403d(xny0 xny0Var, mhr0 mhr0Var, boolean z, boolean z2) throws zzth {
        String strM137402c = m137402c(mhr0Var);
        return strM137402c == null ? zzgaa.zzl() : m137404e(strM137402c, z, z2);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized List m137404e(String str, boolean z, boolean z2) throws zzth {
        try {
            boy0 boy0Var = new boy0(str, z, z2);
            HashMap map = f114217b;
            List list = (List) map.get(boy0Var);
            if (list != null) {
                return list;
            }
            int i = ggw0.f102568a;
            ArrayList arrayListM137407h = m137407h(boy0Var, new goy0(z, z2));
            if (z && arrayListM137407h.isEmpty() && ggw0.f102568a <= 23) {
                arrayListM137407h = m137407h(boy0Var, new foy0(null));
                if (!arrayListM137407h.isEmpty()) {
                    svv0.m186111f("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((bny0) arrayListM137407h.get(0)).f76460a);
                }
            }
            if ("audio/raw".equals(str)) {
                if (ggw0.f102568a < 26 && ggw0.f102569b.equals("R9") && arrayListM137407h.size() == 1 && ((bny0) arrayListM137407h.get(0)).f76460a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListM137407h.add(bny0.m102875c("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                m137408i(arrayListM137407h, new hoy0() { // from class: l.zny0
                    @Override // p149l.hoy0
                    public final int zza(Object obj) {
                        Pattern pattern = ioy0.f114216a;
                        String str2 = ((bny0) obj).f76460a;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        return (ggw0.f102568a >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (ggw0.f102568a < 32 && arrayListM137407h.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((bny0) arrayListM137407h.get(0)).f76460a)) {
                arrayListM137407h.add((bny0) arrayListM137407h.remove(0));
            }
            zzgaa zzgaaVarZzj = zzgaa.zzj(arrayListM137407h);
            map.put(boy0Var, zzgaaVarZzj);
            return zzgaaVarZzj;
        } catch (Throwable th) {
            throw th;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    /* JADX INFO: renamed from: f */
    public static List m137405f(xny0 xny0Var, mhr0 mhr0Var, boolean z, boolean z2) throws zzth {
        List listM137404e = m137404e(mhr0Var.f133892l, z, z2);
        List listM137403d = m137403d(xny0Var, mhr0Var, z, z2);
        ghw0 ghw0Var = new ghw0();
        ghw0Var.m126242i(listM137404e);
        ghw0Var.m126242i(listM137403d);
        return ghw0Var.m126243j();
    }

    @CheckResult
    /* JADX INFO: renamed from: g */
    public static List m137406g(List list, final mhr0 mhr0Var) {
        ArrayList arrayList = new ArrayList(list);
        m137408i(arrayList, new hoy0() { // from class: l.aoy0
            @Override // p149l.hoy0
            public final int zza(Object obj) {
                Pattern pattern = ioy0.f114216a;
                return ((bny0) obj).m102880d(mhr0Var) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0182 A[Catch: Exception -> 0x0176, TRY_LEAVE, TryCatch #4 {Exception -> 0x0176, blocks: (B:85:0x013d, B:91:0x0154, B:97:0x0169, B:99:0x016f, B:103:0x0182), top: B:161:0x013d }] */
    /* JADX WARN: Code duplicated, block: B:106:0x018a  */
    /* JADX WARN: Code duplicated, block: B:107:0x018d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0199 A[Catch: Exception -> 0x019e, TryCatch #1 {Exception -> 0x019e, blocks: (B:108:0x018f, B:110:0x0199, B:122:0x01ca, B:113:0x01a5, B:115:0x01b5, B:117:0x01bd), top: B:155:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01a5 A[Catch: Exception -> 0x019e, TryCatch #1 {Exception -> 0x019e, blocks: (B:108:0x018f, B:110:0x0199, B:122:0x01ca, B:113:0x01a5, B:115:0x01b5, B:117:0x01bd), top: B:155:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01b5 A[Catch: Exception -> 0x019e, TryCatch #1 {Exception -> 0x019e, blocks: (B:108:0x018f, B:110:0x0199, B:122:0x01ca, B:113:0x01a5, B:115:0x01b5, B:117:0x01bd), top: B:155:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ca A[Catch: Exception -> 0x019e, TRY_LEAVE, TryCatch #1 {Exception -> 0x019e, blocks: (B:108:0x018f, B:110:0x0199, B:122:0x01ca, B:113:0x01a5, B:115:0x01b5, B:117:0x01bd), top: B:155:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:124:0x01ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x0225 A[Catch: Exception -> 0x0034, TRY_ENTER, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:141:0x021f, B:144:0x0225, B:146:0x022b, B:147:0x0247, B:148:0x026a, B:56:0x00d7, B:57:0x00da, B:59:0x00e2, B:62:0x00ed, B:64:0x00f5, B:69:0x0103, B:71:0x010b, B:74:0x0116, B:76:0x011e, B:79:0x0129, B:81:0x0131), top: B:163:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0247 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x026b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5 A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:141:0x021f, B:144:0x0225, B:146:0x022b, B:147:0x0247, B:148:0x026a, B:56:0x00d7, B:57:0x00da, B:59:0x00e2, B:62:0x00ed, B:64:0x00f5, B:69:0x0103, B:71:0x010b, B:74:0x0116, B:76:0x011e, B:79:0x0129, B:81:0x0131), top: B:163:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:141:0x021f, B:144:0x0225, B:146:0x022b, B:147:0x0247, B:148:0x026a, B:56:0x00d7, B:57:0x00da, B:59:0x00e2, B:62:0x00ed, B:64:0x00f5, B:69:0x0103, B:71:0x010b, B:74:0x0116, B:76:0x011e, B:79:0x0129, B:81:0x0131), top: B:163:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d7 A[Catch: Exception -> 0x0034, LOOP:1: B:52:0x00cc->B:56:0x00d7, LOOP_END, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:141:0x021f, B:144:0x0225, B:146:0x022b, B:147:0x0247, B:148:0x026a, B:56:0x00d7, B:57:0x00da, B:59:0x00e2, B:62:0x00ed, B:64:0x00f5, B:69:0x0103, B:71:0x010b, B:74:0x0116, B:76:0x011e, B:79:0x0129, B:81:0x0131), top: B:163:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e2 A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:141:0x021f, B:144:0x0225, B:146:0x022b, B:147:0x0247, B:148:0x026a, B:56:0x00d7, B:57:0x00da, B:59:0x00e2, B:62:0x00ed, B:64:0x00f5, B:69:0x0103, B:71:0x010b, B:74:0x0116, B:76:0x011e, B:79:0x0129, B:81:0x0131), top: B:163:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ea A[EDGE_INSN: B:61:0x00ea->B:84:0x013b BREAK  A[LOOP:1: B:52:0x00cc->B:56:0x00d7]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ed A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:141:0x021f, B:144:0x0225, B:146:0x022b, B:147:0x0247, B:148:0x026a, B:56:0x00d7, B:57:0x00da, B:59:0x00e2, B:62:0x00ed, B:64:0x00f5, B:69:0x0103, B:71:0x010b, B:74:0x0116, B:76:0x011e, B:79:0x0129, B:81:0x0131), top: B:163:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5 A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:141:0x021f, B:144:0x0225, B:146:0x022b, B:147:0x0247, B:148:0x026a, B:56:0x00d7, B:57:0x00da, B:59:0x00e2, B:62:0x00ed, B:64:0x00f5, B:69:0x0103, B:71:0x010b, B:74:0x0116, B:76:0x011e, B:79:0x0129, B:81:0x0131), top: B:163:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe A[EDGE_INSN: B:67:0x00fe->B:84:0x013b BREAK  A[LOOP:1: B:52:0x00cc->B:56:0x00d7]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0103 A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:141:0x021f, B:144:0x0225, B:146:0x022b, B:147:0x0247, B:148:0x026a, B:56:0x00d7, B:57:0x00da, B:59:0x00e2, B:62:0x00ed, B:64:0x00f5, B:69:0x0103, B:71:0x010b, B:74:0x0116, B:76:0x011e, B:79:0x0129, B:81:0x0131), top: B:163:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x010b A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:141:0x021f, B:144:0x0225, B:146:0x022b, B:147:0x0247, B:148:0x026a, B:56:0x00d7, B:57:0x00da, B:59:0x00e2, B:62:0x00ed, B:64:0x00f5, B:69:0x0103, B:71:0x010b, B:74:0x0116, B:76:0x011e, B:79:0x0129, B:81:0x0131), top: B:163:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0116 A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:141:0x021f, B:144:0x0225, B:146:0x022b, B:147:0x0247, B:148:0x026a, B:56:0x00d7, B:57:0x00da, B:59:0x00e2, B:62:0x00ed, B:64:0x00f5, B:69:0x0103, B:71:0x010b, B:74:0x0116, B:76:0x011e, B:79:0x0129, B:81:0x0131), top: B:163:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x011e A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:141:0x021f, B:144:0x0225, B:146:0x022b, B:147:0x0247, B:148:0x026a, B:56:0x00d7, B:57:0x00da, B:59:0x00e2, B:62:0x00ed, B:64:0x00f5, B:69:0x0103, B:71:0x010b, B:74:0x0116, B:76:0x011e, B:79:0x0129, B:81:0x0131), top: B:163:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0129 A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:141:0x021f, B:144:0x0225, B:146:0x022b, B:147:0x0247, B:148:0x026a, B:56:0x00d7, B:57:0x00da, B:59:0x00e2, B:62:0x00ed, B:64:0x00f5, B:69:0x0103, B:71:0x010b, B:74:0x0116, B:76:0x011e, B:79:0x0129, B:81:0x0131), top: B:163:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0131 A[Catch: Exception -> 0x0034, TryCatch #5 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:141:0x021f, B:144:0x0225, B:146:0x022b, B:147:0x0247, B:148:0x026a, B:56:0x00d7, B:57:0x00da, B:59:0x00e2, B:62:0x00ed, B:64:0x00f5, B:69:0x0103, B:71:0x010b, B:74:0x0116, B:76:0x011e, B:79:0x0129, B:81:0x0131), top: B:163:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x014f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0152  */
    /* JADX WARN: Code duplicated, block: B:91:0x0154 A[Catch: Exception -> 0x0176, TryCatch #4 {Exception -> 0x0176, blocks: (B:85:0x013d, B:91:0x0154, B:97:0x0169, B:99:0x016f, B:103:0x0182), top: B:161:0x013d }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0164  */
    /* JADX WARN: Code duplicated, block: B:95:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0167  */
    /* JADX WARN: Code duplicated, block: B:99:0x016f A[Catch: Exception -> 0x0176, TryCatch #4 {Exception -> 0x0176, blocks: (B:85:0x013d, B:91:0x0154, B:97:0x0169, B:99:0x016f, B:103:0x0182), top: B:161:0x013d }] */
    /* JADX INFO: renamed from: h */
    public static ArrayList m137407h(boy0 boy0Var, doy0 doy0Var) throws zzth {
        int i;
        int i2;
        String[] supportedTypes;
        int length;
        int i3;
        String str;
        int i4;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zMo112837a;
        boolean zMo112838b;
        boolean zMo112837a2;
        boolean zMo112838b2;
        boolean zIsVendor;
        int i5;
        boolean zIsHardwareAccelerated;
        boolean zM137409j;
        String strM174257a;
        boy0 boy0Var2 = boy0Var;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = boy0Var2.f76580a;
            boolean zZze = doy0Var.zze();
            int i6 = 0;
            for (int iZza = doy0Var.zza(); i6 < iZza; iZza = i2) {
                MediaCodecInfo mediaCodecInfoMo112839e = doy0Var.mo112839e(i6);
                int i7 = ggw0.f102568a;
                if (i7 < 29 || !mediaCodecInfoMo112839e.isAlias()) {
                    int i8 = iZza;
                    String name = mediaCodecInfoMo112839e.getName();
                    if (mediaCodecInfoMo112839e.isEncoder() || (!zZze && name.endsWith(".secure"))) {
                        i = i6;
                        i2 = i8;
                    } else if (i7 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(ggw0.f102570c))) {
                        String str3 = ggw0.f102569b;
                        if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                            i = i6;
                            i2 = i8;
                        } else if (i7 > 23) {
                            supportedTypes = mediaCodecInfoMo112839e.getSupportedTypes();
                            length = supportedTypes.length;
                            i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    if (!str2.equals("video/dolby-vision")) {
                                        if (!str2.equals("audio/alac")) {
                                            if (!str2.equals("audio/flac")) {
                                                if (!str2.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str2.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str2.equals("audio/flac")) {
                                            if (!str2.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str2.equals("audio/ac3")) {
                                            str = null;
                                            break;
                                        }
                                        str = null;
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i3];
                                if (str.equalsIgnoreCase(str2)) {
                                    break;
                                    break;
                                }
                                i3++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoMo112839e.getCapabilitiesForType(str);
                                zMo112837a = doy0Var.mo112837a("tunneled-playback", str, capabilitiesForType);
                                zMo112838b = doy0Var.mo112838b("tunneled-playback", str, capabilitiesForType);
                                if (boy0Var2.f76582c) {
                                    if (zMo112837a) {
                                        zMo112837a2 = doy0Var.mo112837a("secure-playback", str, capabilitiesForType);
                                        zMo112838b2 = doy0Var.mo112838b("secure-playback", str, capabilitiesForType);
                                        zIsVendor = true;
                                        if (boy0Var2.f76581b) {
                                            if (zMo112837a2) {
                                                zMo112837a2 = true;
                                                i5 = ggw0.f102568a;
                                                if (i5 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoMo112839e.isHardwareAccelerated();
                                                    i2 = i8;
                                                } else {
                                                    i2 = i8;
                                                    if (m137409j(mediaCodecInfoMo112839e, str2)) {
                                                        zIsHardwareAccelerated = false;
                                                    } else {
                                                        zIsHardwareAccelerated = true;
                                                    }
                                                }
                                                zM137409j = m137409j(mediaCodecInfoMo112839e, str2);
                                                if (i5 >= 29) {
                                                    zIsVendor = mediaCodecInfoMo112839e.isVendor();
                                                } else {
                                                    strM174257a = qew0.m174257a(mediaCodecInfoMo112839e.getName());
                                                    if (strM174257a.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZze) {
                                                    if (!zZze) {
                                                        if (!boy0Var2.f76581b) {
                                                            int i9 = i6;
                                                            str = str;
                                                            i = i9;
                                                            i4 = 23;
                                                            arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                        }
                                                    }
                                                    int i10 = i6;
                                                    str = str;
                                                    i = i10;
                                                    boolean z = zIsVendor;
                                                    i4 = 23;
                                                    boolean z2 = zMo112837a2;
                                                    boolean z3 = zIsHardwareAccelerated;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                } else {
                                                    if (!zZze) {
                                                        if (!boy0Var2.f76581b) {
                                                            int i11 = i6;
                                                            str = str;
                                                            i = i11;
                                                            i4 = 23;
                                                            arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                        }
                                                    }
                                                    int i12 = i6;
                                                    str = str;
                                                    i = i12;
                                                    boolean z4 = zIsVendor;
                                                    i4 = 23;
                                                    boolean z5 = zMo112837a2;
                                                    boolean z6 = zIsHardwareAccelerated;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (!zMo112838b2) {
                                            i5 = ggw0.f102568a;
                                            if (i5 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoMo112839e.isHardwareAccelerated();
                                                i2 = i8;
                                            } else {
                                                i2 = i8;
                                                if (m137409j(mediaCodecInfoMo112839e, str2)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                            }
                                            zM137409j = m137409j(mediaCodecInfoMo112839e, str2);
                                            if (i5 >= 29) {
                                                zIsVendor = mediaCodecInfoMo112839e.isVendor();
                                            } else {
                                                strM174257a = qew0.m174257a(mediaCodecInfoMo112839e.getName());
                                                if (strM174257a.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!boy0Var2.f76581b) {
                                                        int i13 = i6;
                                                        str = str;
                                                        i = i13;
                                                        i4 = 23;
                                                        arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                    }
                                                }
                                                int i14 = i6;
                                                str = str;
                                                i = i14;
                                                boolean z7 = zIsVendor;
                                                i4 = 23;
                                                boolean z8 = zMo112837a2;
                                                boolean z9 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!boy0Var2.f76581b) {
                                                        int i15 = i6;
                                                        str = str;
                                                        i = i15;
                                                        i4 = 23;
                                                        arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                    }
                                                }
                                                int i16 = i6;
                                                str = str;
                                                i = i16;
                                                boolean z10 = zIsVendor;
                                                i4 = 23;
                                                boolean z11 = zMo112837a2;
                                                boolean z12 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (!zMo112838b) {
                                    zMo112837a2 = doy0Var.mo112837a("secure-playback", str, capabilitiesForType);
                                    zMo112838b2 = doy0Var.mo112838b("secure-playback", str, capabilitiesForType);
                                    zIsVendor = true;
                                    if (boy0Var2.f76581b) {
                                        if (!zMo112838b2) {
                                            i5 = ggw0.f102568a;
                                            if (i5 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoMo112839e.isHardwareAccelerated();
                                                i2 = i8;
                                            } else {
                                                i2 = i8;
                                                if (m137409j(mediaCodecInfoMo112839e, str2)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                            }
                                            zM137409j = m137409j(mediaCodecInfoMo112839e, str2);
                                            if (i5 >= 29) {
                                                zIsVendor = mediaCodecInfoMo112839e.isVendor();
                                            } else {
                                                strM174257a = qew0.m174257a(mediaCodecInfoMo112839e.getName());
                                                if (strM174257a.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!boy0Var2.f76581b) {
                                                        int i17 = i6;
                                                        str = str;
                                                        i = i17;
                                                        i4 = 23;
                                                        arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                    }
                                                }
                                                int i18 = i6;
                                                str = str;
                                                i = i18;
                                                boolean z13 = zIsVendor;
                                                i4 = 23;
                                                boolean z14 = zMo112837a2;
                                                boolean z15 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!boy0Var2.f76581b) {
                                                        int i19 = i6;
                                                        str = str;
                                                        i = i19;
                                                        i4 = 23;
                                                        arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                    }
                                                }
                                                int i110 = i6;
                                                str = str;
                                                i = i110;
                                                boolean z16 = zIsVendor;
                                                i4 = 23;
                                                boolean z17 = zMo112837a2;
                                                boolean z18 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zMo112837a2) {
                                        zMo112837a2 = true;
                                        i5 = ggw0.f102568a;
                                        if (i5 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoMo112839e.isHardwareAccelerated();
                                            i2 = i8;
                                        } else {
                                            i2 = i8;
                                            if (m137409j(mediaCodecInfoMo112839e, str2)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                        }
                                        zM137409j = m137409j(mediaCodecInfoMo112839e, str2);
                                        if (i5 >= 29) {
                                            zIsVendor = mediaCodecInfoMo112839e.isVendor();
                                        } else {
                                            strM174257a = qew0.m174257a(mediaCodecInfoMo112839e.getName());
                                            if (strM174257a.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            if (!zZze) {
                                                if (!boy0Var2.f76581b) {
                                                    int i111 = i6;
                                                    str = str;
                                                    i = i111;
                                                    i4 = 23;
                                                    arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                }
                                            }
                                            int i112 = i6;
                                            str = str;
                                            i = i112;
                                            boolean z19 = zIsVendor;
                                            i4 = 23;
                                            boolean z110 = zMo112837a2;
                                            boolean z111 = zIsHardwareAccelerated;
                                            if (zZze) {
                                                continue;
                                            }
                                        } else {
                                            if (!zZze) {
                                                if (!boy0Var2.f76581b) {
                                                    int i113 = i6;
                                                    str = str;
                                                    i = i113;
                                                    i4 = 23;
                                                    arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                }
                                            }
                                            int i114 = i6;
                                            str = str;
                                            i = i114;
                                            boolean z112 = zIsVendor;
                                            i4 = 23;
                                            boolean z113 = zMo112837a2;
                                            boolean z114 = zIsHardwareAccelerated;
                                            if (zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i = i6;
                                i2 = i8;
                            } else {
                                i = i6;
                                i2 = i8;
                            }
                        } else {
                            supportedTypes = mediaCodecInfoMo112839e.getSupportedTypes();
                            length = supportedTypes.length;
                            i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    if (!str2.equals("video/dolby-vision")) {
                                        if (!str2.equals("audio/alac")) {
                                            if (!str2.equals("audio/flac")) {
                                                if (!str2.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str2.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str2.equals("audio/flac")) {
                                            if (!str2.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str2.equals("audio/ac3")) {
                                            str = null;
                                            break;
                                        }
                                        str = null;
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i3];
                                if (str.equalsIgnoreCase(str2)) {
                                    break;
                                    break;
                                }
                                i3++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoMo112839e.getCapabilitiesForType(str);
                                zMo112837a = doy0Var.mo112837a("tunneled-playback", str, capabilitiesForType);
                                zMo112838b = doy0Var.mo112838b("tunneled-playback", str, capabilitiesForType);
                                if (boy0Var2.f76582c) {
                                    if (!zMo112838b) {
                                        zMo112837a2 = doy0Var.mo112837a("secure-playback", str, capabilitiesForType);
                                        zMo112838b2 = doy0Var.mo112838b("secure-playback", str, capabilitiesForType);
                                        zIsVendor = true;
                                        if (boy0Var2.f76581b) {
                                            if (!zMo112838b2) {
                                                i5 = ggw0.f102568a;
                                                if (i5 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoMo112839e.isHardwareAccelerated();
                                                    i2 = i8;
                                                } else {
                                                    i2 = i8;
                                                    if (m137409j(mediaCodecInfoMo112839e, str2)) {
                                                        zIsHardwareAccelerated = true;
                                                    } else {
                                                        zIsHardwareAccelerated = false;
                                                    }
                                                }
                                                zM137409j = m137409j(mediaCodecInfoMo112839e, str2);
                                                if (i5 >= 29) {
                                                    zIsVendor = mediaCodecInfoMo112839e.isVendor();
                                                } else {
                                                    strM174257a = qew0.m174257a(mediaCodecInfoMo112839e.getName());
                                                    if (strM174257a.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZze) {
                                                    if (!zZze) {
                                                        if (!boy0Var2.f76581b) {
                                                            int i115 = i6;
                                                            str = str;
                                                            i = i115;
                                                            i4 = 23;
                                                            arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                        }
                                                    }
                                                    int i116 = i6;
                                                    str = str;
                                                    i = i116;
                                                    boolean z115 = zIsVendor;
                                                    i4 = 23;
                                                    boolean z116 = zMo112837a2;
                                                    boolean z117 = zIsHardwareAccelerated;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                } else {
                                                    if (!zZze) {
                                                        if (!boy0Var2.f76581b) {
                                                            int i117 = i6;
                                                            str = str;
                                                            i = i117;
                                                            i4 = 23;
                                                            arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                        }
                                                    }
                                                    int i118 = i6;
                                                    str = str;
                                                    i = i118;
                                                    boolean z118 = zIsVendor;
                                                    i4 = 23;
                                                    boolean z119 = zMo112837a2;
                                                    boolean z1110 = zIsHardwareAccelerated;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (zMo112837a2) {
                                            zMo112837a2 = true;
                                            i5 = ggw0.f102568a;
                                            if (i5 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoMo112839e.isHardwareAccelerated();
                                                i2 = i8;
                                            } else {
                                                i2 = i8;
                                                if (m137409j(mediaCodecInfoMo112839e, str2)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                            }
                                            zM137409j = m137409j(mediaCodecInfoMo112839e, str2);
                                            if (i5 >= 29) {
                                                zIsVendor = mediaCodecInfoMo112839e.isVendor();
                                            } else {
                                                strM174257a = qew0.m174257a(mediaCodecInfoMo112839e.getName());
                                                if (strM174257a.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!boy0Var2.f76581b) {
                                                        int i119 = i6;
                                                        str = str;
                                                        i = i119;
                                                        i4 = 23;
                                                        arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                    }
                                                }
                                                int i1110 = i6;
                                                str = str;
                                                i = i1110;
                                                boolean z1111 = zIsVendor;
                                                i4 = 23;
                                                boolean z1112 = zMo112837a2;
                                                boolean z1113 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!boy0Var2.f76581b) {
                                                        int i1111 = i6;
                                                        str = str;
                                                        i = i1111;
                                                        i4 = 23;
                                                        arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                    }
                                                }
                                                int i1112 = i6;
                                                str = str;
                                                i = i1112;
                                                boolean z1114 = zIsVendor;
                                                i4 = 23;
                                                boolean z1115 = zMo112837a2;
                                                boolean z1116 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (zMo112837a) {
                                    zMo112837a2 = doy0Var.mo112837a("secure-playback", str, capabilitiesForType);
                                    zMo112838b2 = doy0Var.mo112838b("secure-playback", str, capabilitiesForType);
                                    zIsVendor = true;
                                    if (boy0Var2.f76581b) {
                                        if (!zMo112838b2) {
                                            i5 = ggw0.f102568a;
                                            if (i5 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoMo112839e.isHardwareAccelerated();
                                                i2 = i8;
                                            } else {
                                                i2 = i8;
                                                if (m137409j(mediaCodecInfoMo112839e, str2)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                            }
                                            zM137409j = m137409j(mediaCodecInfoMo112839e, str2);
                                            if (i5 >= 29) {
                                                zIsVendor = mediaCodecInfoMo112839e.isVendor();
                                            } else {
                                                strM174257a = qew0.m174257a(mediaCodecInfoMo112839e.getName());
                                                if (strM174257a.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!boy0Var2.f76581b) {
                                                        int i1113 = i6;
                                                        str = str;
                                                        i = i1113;
                                                        i4 = 23;
                                                        arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                    }
                                                }
                                                int i1114 = i6;
                                                str = str;
                                                i = i1114;
                                                boolean z1117 = zIsVendor;
                                                i4 = 23;
                                                boolean z1118 = zMo112837a2;
                                                boolean z1119 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!boy0Var2.f76581b) {
                                                        int i1115 = i6;
                                                        str = str;
                                                        i = i1115;
                                                        i4 = 23;
                                                        arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                    }
                                                }
                                                int i1116 = i6;
                                                str = str;
                                                i = i1116;
                                                boolean z11110 = zIsVendor;
                                                i4 = 23;
                                                boolean z11111 = zMo112837a2;
                                                boolean z11112 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zMo112837a2) {
                                        zMo112837a2 = true;
                                        i5 = ggw0.f102568a;
                                        if (i5 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoMo112839e.isHardwareAccelerated();
                                            i2 = i8;
                                        } else {
                                            i2 = i8;
                                            if (m137409j(mediaCodecInfoMo112839e, str2)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                        }
                                        zM137409j = m137409j(mediaCodecInfoMo112839e, str2);
                                        if (i5 >= 29) {
                                            zIsVendor = mediaCodecInfoMo112839e.isVendor();
                                        } else {
                                            strM174257a = qew0.m174257a(mediaCodecInfoMo112839e.getName());
                                            if (strM174257a.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            if (!zZze) {
                                                if (!boy0Var2.f76581b) {
                                                    int i1117 = i6;
                                                    str = str;
                                                    i = i1117;
                                                    i4 = 23;
                                                    arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                }
                                            }
                                            int i1118 = i6;
                                            str = str;
                                            i = i1118;
                                            boolean z11113 = zIsVendor;
                                            i4 = 23;
                                            boolean z11114 = zMo112837a2;
                                            boolean z11115 = zIsHardwareAccelerated;
                                            if (zZze) {
                                                continue;
                                            }
                                        } else {
                                            if (!zZze) {
                                                if (!boy0Var2.f76581b) {
                                                    int i1119 = i6;
                                                    str = str;
                                                    i = i1119;
                                                    i4 = 23;
                                                    arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                }
                                            }
                                            int i11110 = i6;
                                            str = str;
                                            i = i11110;
                                            boolean z11116 = zIsVendor;
                                            i4 = 23;
                                            boolean z11117 = zMo112837a2;
                                            boolean z11118 = zIsHardwareAccelerated;
                                            if (zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i = i6;
                                i2 = i8;
                            } else {
                                i = i6;
                                i2 = i8;
                            }
                        }
                    } else if (i7 > 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name)) {
                        i = i6;
                        i2 = i8;
                    } else {
                        supportedTypes = mediaCodecInfoMo112839e.getSupportedTypes();
                        length = supportedTypes.length;
                        i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                if (!str2.equals("video/dolby-vision")) {
                                    if (!str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                        str = "audio/x-lg-alac";
                                        break;
                                    }
                                    if (!str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                        str = "audio/x-lg-flac";
                                        break;
                                    }
                                    if (!str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                        str = "audio/lg-ac3";
                                        break;
                                    }
                                    str = null;
                                    break;
                                }
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if ("OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/dv_hevc";
                                    break;
                                }
                                str = "video/hevcdv";
                                break;
                            }
                            str = supportedTypes[i3];
                            if (str.equalsIgnoreCase(str2)) {
                                break;
                            }
                            i3++;
                        }
                        if (str != null) {
                            try {
                                capabilitiesForType = mediaCodecInfoMo112839e.getCapabilitiesForType(str);
                                zMo112837a = doy0Var.mo112837a("tunneled-playback", str, capabilitiesForType);
                                zMo112838b = doy0Var.mo112838b("tunneled-playback", str, capabilitiesForType);
                                if (boy0Var2.f76582c) {
                                    if (!zMo112838b) {
                                        zMo112837a2 = doy0Var.mo112837a("secure-playback", str, capabilitiesForType);
                                        zMo112838b2 = doy0Var.mo112838b("secure-playback", str, capabilitiesForType);
                                        zIsVendor = true;
                                        if (boy0Var2.f76581b) {
                                            if (!zMo112838b2) {
                                                i5 = ggw0.f102568a;
                                                if (i5 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoMo112839e.isHardwareAccelerated();
                                                    i2 = i8;
                                                } else {
                                                    i2 = i8;
                                                    if (m137409j(mediaCodecInfoMo112839e, str2)) {
                                                        zIsHardwareAccelerated = true;
                                                    } else {
                                                        zIsHardwareAccelerated = false;
                                                    }
                                                }
                                                try {
                                                    zM137409j = m137409j(mediaCodecInfoMo112839e, str2);
                                                    if (i5 >= 29) {
                                                        zIsVendor = mediaCodecInfoMo112839e.isVendor();
                                                    } else {
                                                        strM174257a = qew0.m174257a(mediaCodecInfoMo112839e.getName());
                                                        if (strM174257a.startsWith("omx.google.") || strM174257a.startsWith("c2.android.") || strM174257a.startsWith("c2.google.")) {
                                                            zIsVendor = false;
                                                        }
                                                    }
                                                    if (zZze || boy0Var2.f76581b != zMo112837a2) {
                                                        if (!zZze) {
                                                            try {
                                                                if (!boy0Var2.f76581b) {
                                                                    int i11111 = i6;
                                                                    str = str;
                                                                    i = i11111;
                                                                    i4 = 23;
                                                                    try {
                                                                        arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                                    } catch (Exception e) {
                                                                        e = e;
                                                                        name = name;
                                                                        if (ggw0.f102568a <= i4) {
                                                                        }
                                                                        svv0.m186108c("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                                                        throw e;
                                                                    }
                                                                }
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                int i20 = i6;
                                                                str = str;
                                                                i = i20;
                                                                i4 = 23;
                                                                name = name;
                                                                if (ggw0.f102568a <= i4) {
                                                                }
                                                                svv0.m186108c("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                                                throw e;
                                                            }
                                                        }
                                                        int i11112 = i6;
                                                        str = str;
                                                        i = i11112;
                                                        boolean z11119 = zIsVendor;
                                                        i4 = 23;
                                                        boolean z111110 = zMo112837a2;
                                                        boolean z111111 = zIsHardwareAccelerated;
                                                        if (zZze && z111110) {
                                                            name = name;
                                                            try {
                                                                arrayList.add(bny0.m102875c(name + ".secure", str2, str, capabilitiesForType, z111111, zM137409j, z11119, false, true));
                                                                break;
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                                if (ggw0.f102568a <= i4 || arrayList.isEmpty()) {
                                                                    svv0.m186108c("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                                                    throw e;
                                                                }
                                                                svv0.m186108c("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                                                                i6 = i + 1;
                                                                boy0Var2 = boy0Var;
                                                            }
                                                        }
                                                    } else {
                                                        int i11113 = i6;
                                                        str = str;
                                                        i = i11113;
                                                        i4 = 23;
                                                        arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                    }
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    i = i6;
                                                    i4 = 23;
                                                    if (ggw0.f102568a <= i4) {
                                                    }
                                                    svv0.m186108c("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                                    throw e;
                                                }
                                            }
                                        } else if (zMo112837a2) {
                                            zMo112837a2 = true;
                                            i5 = ggw0.f102568a;
                                            if (i5 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoMo112839e.isHardwareAccelerated();
                                                i2 = i8;
                                            } else {
                                                i2 = i8;
                                                if (m137409j(mediaCodecInfoMo112839e, str2)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                            }
                                            zM137409j = m137409j(mediaCodecInfoMo112839e, str2);
                                            if (i5 >= 29) {
                                                zIsVendor = mediaCodecInfoMo112839e.isVendor();
                                            } else {
                                                strM174257a = qew0.m174257a(mediaCodecInfoMo112839e.getName());
                                                if (strM174257a.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!boy0Var2.f76581b) {
                                                        int i11114 = i6;
                                                        str = str;
                                                        i = i11114;
                                                        i4 = 23;
                                                        arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                    }
                                                }
                                                int i11115 = i6;
                                                str = str;
                                                i = i11115;
                                                boolean z111112 = zIsVendor;
                                                i4 = 23;
                                                boolean z111113 = zMo112837a2;
                                                boolean z111114 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!boy0Var2.f76581b) {
                                                        int i11116 = i6;
                                                        str = str;
                                                        i = i11116;
                                                        i4 = 23;
                                                        arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                    }
                                                }
                                                int i11117 = i6;
                                                str = str;
                                                i = i11117;
                                                boolean z111115 = zIsVendor;
                                                i4 = 23;
                                                boolean z111116 = zMo112837a2;
                                                boolean z111117 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (zMo112837a) {
                                    zMo112837a2 = doy0Var.mo112837a("secure-playback", str, capabilitiesForType);
                                    zMo112838b2 = doy0Var.mo112838b("secure-playback", str, capabilitiesForType);
                                    zIsVendor = true;
                                    if (boy0Var2.f76581b) {
                                        if (!zMo112838b2) {
                                            i5 = ggw0.f102568a;
                                            if (i5 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoMo112839e.isHardwareAccelerated();
                                                i2 = i8;
                                            } else {
                                                i2 = i8;
                                                if (m137409j(mediaCodecInfoMo112839e, str2)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                            }
                                            zM137409j = m137409j(mediaCodecInfoMo112839e, str2);
                                            if (i5 >= 29) {
                                                zIsVendor = mediaCodecInfoMo112839e.isVendor();
                                            } else {
                                                strM174257a = qew0.m174257a(mediaCodecInfoMo112839e.getName());
                                                if (strM174257a.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!boy0Var2.f76581b) {
                                                        int i11118 = i6;
                                                        str = str;
                                                        i = i11118;
                                                        i4 = 23;
                                                        arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                    }
                                                }
                                                int i11119 = i6;
                                                str = str;
                                                i = i11119;
                                                boolean z111118 = zIsVendor;
                                                i4 = 23;
                                                boolean z111119 = zMo112837a2;
                                                boolean z1111110 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!boy0Var2.f76581b) {
                                                        int i111110 = i6;
                                                        str = str;
                                                        i = i111110;
                                                        i4 = 23;
                                                        arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                    }
                                                }
                                                int i111111 = i6;
                                                str = str;
                                                i = i111111;
                                                boolean z1111111 = zIsVendor;
                                                i4 = 23;
                                                boolean z1111112 = zMo112837a2;
                                                boolean z1111113 = zIsHardwareAccelerated;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zMo112837a2) {
                                        zMo112837a2 = true;
                                        i5 = ggw0.f102568a;
                                        if (i5 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoMo112839e.isHardwareAccelerated();
                                            i2 = i8;
                                        } else {
                                            i2 = i8;
                                            if (m137409j(mediaCodecInfoMo112839e, str2)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                        }
                                        zM137409j = m137409j(mediaCodecInfoMo112839e, str2);
                                        if (i5 >= 29) {
                                            zIsVendor = mediaCodecInfoMo112839e.isVendor();
                                        } else {
                                            strM174257a = qew0.m174257a(mediaCodecInfoMo112839e.getName());
                                            if (strM174257a.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            if (!zZze) {
                                                if (!boy0Var2.f76581b) {
                                                    int i111112 = i6;
                                                    str = str;
                                                    i = i111112;
                                                    i4 = 23;
                                                    arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                }
                                            }
                                            int i111113 = i6;
                                            str = str;
                                            i = i111113;
                                            boolean z1111114 = zIsVendor;
                                            i4 = 23;
                                            boolean z1111115 = zMo112837a2;
                                            boolean z1111116 = zIsHardwareAccelerated;
                                            if (zZze) {
                                                continue;
                                            }
                                        } else {
                                            if (!zZze) {
                                                if (!boy0Var2.f76581b) {
                                                    int i111114 = i6;
                                                    str = str;
                                                    i = i111114;
                                                    i4 = 23;
                                                    arrayList.add(bny0.m102875c(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zM137409j, zIsVendor, false, false));
                                                }
                                            }
                                            int i111115 = i6;
                                            str = str;
                                            i = i111115;
                                            boolean z1111117 = zIsVendor;
                                            i4 = 23;
                                            boolean z1111118 = zMo112837a2;
                                            boolean z1111119 = zIsHardwareAccelerated;
                                            if (zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i = i6;
                                i2 = i8;
                            } catch (Exception e5) {
                                e = e5;
                                i = i6;
                                i2 = i8;
                            }
                        } else {
                            i = i6;
                            i2 = i8;
                        }
                    }
                } else {
                    i2 = iZza;
                    i = i6;
                }
                i6 = i + 1;
                boy0Var2 = boy0Var;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new zzth(e6, null);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m137408i(List list, final hoy0 hoy0Var) {
        Collections.sort(list, new Comparator() { // from class: l.yny0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Pattern pattern = ioy0.f114216a;
                hoy0 hoy0Var2 = hoy0Var;
                return hoy0Var2.zza(obj2) - hoy0Var2.zza(obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static boolean m137409j(MediaCodecInfo mediaCodecInfo, String str) {
        if (ggw0.f102568a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (uys0.m196370g(str)) {
            return true;
        }
        String strM174257a = qew0.m174257a(mediaCodecInfo.getName());
        if (strM174257a.startsWith("arc.")) {
            return false;
        }
        if (strM174257a.startsWith("omx.google.") || strM174257a.startsWith("omx.ffmpeg.") || ((strM174257a.startsWith("omx.sec.") && strM174257a.contains(".sw.")) || strM174257a.equals("omx.qcom.video.decoder.hevcswvdec") || strM174257a.startsWith("c2.android.") || strM174257a.startsWith("c2.google."))) {
            return true;
        }
        return (strM174257a.startsWith("omx.") || strM174257a.startsWith("c2.")) ? false : true;
    }
}
