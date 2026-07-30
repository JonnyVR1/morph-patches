package p149l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzagc;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzagr;
import com.google.android.gms.internal.ads.zzagt;
import com.google.android.gms.internal.ads.zzagz;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.mlkit.p033nl.languageid.LanguageIdentifier;
import org.eclipse.jetty.http.HttpHeaders;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class sdr0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public static final String[] f163874a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* JADX WARN: Code duplicated, block: B:135:0x0261 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:9:0x0030, B:13:0x003a, B:18:0x0046, B:19:0x0052, B:22:0x005e, B:25:0x006b, B:28:0x007a, B:31:0x0087, B:34:0x0095, B:36:0x009f, B:44:0x00b8, B:45:0x00c9, B:46:0x00dc, B:49:0x00e8, B:52:0x00f5, B:55:0x0102, B:58:0x010f, B:61:0x011c, B:64:0x0129, B:67:0x0136, B:70:0x0143, B:73:0x0150, B:76:0x015d, B:80:0x016e, B:82:0x0174, B:84:0x0188, B:85:0x018f, B:87:0x0196, B:92:0x01a1, B:97:0x01ad, B:135:0x0261, B:98:0x01c2, B:100:0x01c9, B:102:0x01d3, B:103:0x01e7, B:116:0x0213, B:119:0x0220, B:122:0x022c, B:125:0x0238, B:128:0x0244, B:131:0x0250, B:134:0x025a, B:136:0x0275, B:137:0x027c), top: B:142:0x0022 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:135:0x0261, please report this as an issue */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static zzbx m183526a(v6w0 v6w0Var) {
        String str;
        int iM197270s = v6w0Var.m197270s() + v6w0Var.m197273v();
        int iM197273v = v6w0Var.m197273v();
        int i = (iM197273v >> 24) & 255;
        zzbx zzbxVarM183530e = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = iM197273v & 16777215;
                if (i2 == 6516084) {
                    int iM197273v2 = v6w0Var.m197273v();
                    if (v6w0Var.m197273v() == 1684108385) {
                        v6w0Var.m197263l(8);
                        String strM197251O = v6w0Var.m197251O(iM197273v2 - 16);
                        zzbxVarM183530e = new zzagk(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG, strM197251O, strM197251O);
                    } else {
                        svv0.m186111f("MetadataUtil", "Failed to parse comment attribute: ".concat(tcr0.m188058b(iM197273v)));
                    }
                } else if (i2 == 7233901 || i2 == 7631467) {
                    zzbxVarM183530e = m183530e(iM197273v, "TIT2", v6w0Var);
                } else if (i2 == 6516589 || i2 == 7828084) {
                    zzbxVarM183530e = m183530e(iM197273v, "TCOM", v6w0Var);
                } else if (i2 == 6578553) {
                    zzbxVarM183530e = m183530e(iM197273v, "TDRC", v6w0Var);
                } else if (i2 == 4280916) {
                    zzbxVarM183530e = m183530e(iM197273v, "TPE1", v6w0Var);
                } else if (i2 == 7630703) {
                    zzbxVarM183530e = m183530e(iM197273v, "TSSE", v6w0Var);
                } else if (i2 == 6384738) {
                    zzbxVarM183530e = m183530e(iM197273v, "TALB", v6w0Var);
                } else if (i2 == 7108978) {
                    zzbxVarM183530e = m183530e(iM197273v, "USLT", v6w0Var);
                } else if (i2 == 6776174) {
                    zzbxVarM183530e = m183530e(iM197273v, "TCON", v6w0Var);
                } else if (i2 == 6779504) {
                    zzbxVarM183530e = m183530e(iM197273v, "TIT1", v6w0Var);
                } else {
                    svv0.m186107b("MetadataUtil", "Skipped unknown metadata entry: " + tcr0.m188058b(iM197273v));
                }
            } else if (iM197273v == 1735291493) {
                int iM183527b = m183527b(v6w0Var);
                String str2 = (iM183527b <= 0 || iM183527b > 192) ? null : f163874a[iM183527b - 1];
                if (str2 != null) {
                    zzbxVarM183530e = new zzagz("TCON", null, zzgaa.zzm(str2));
                } else {
                    svv0.m186111f("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (iM197273v == 1684632427) {
                zzbxVarM183530e = m183529d(1684632427, "TPOS", v6w0Var);
            } else if (iM197273v == 1953655662) {
                zzbxVarM183530e = m183529d(1953655662, "TRCK", v6w0Var);
            } else if (iM197273v == 1953329263) {
                zzbxVarM183530e = m183528c(1953329263, "TBPM", v6w0Var, true, false);
            } else if (iM197273v == 1668311404) {
                zzbxVarM183530e = m183528c(1668311404, "TCMP", v6w0Var, true, true);
            } else if (iM197273v == 1668249202) {
                int iM197273v3 = v6w0Var.m197273v();
                if (v6w0Var.m197273v() == 1684108385) {
                    int iM197273v4 = v6w0Var.m197273v() & 16777215;
                    if (iM197273v4 == 13) {
                        str = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                    } else if (iM197273v4 == 14) {
                        str = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG;
                        iM197273v4 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        svv0.m186111f("MetadataUtil", "Unrecognized cover art flags: " + iM197273v4);
                    } else {
                        v6w0Var.m197263l(4);
                        int i3 = iM197273v3 - 16;
                        byte[] bArr = new byte[i3];
                        v6w0Var.m197258g(bArr, 0, i3);
                        zzbxVarM183530e = new zzagc(str, null, 3, bArr);
                    }
                } else {
                    svv0.m186111f("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (iM197273v == 1631670868) {
                zzbxVarM183530e = m183530e(1631670868, "TPE2", v6w0Var);
            } else if (iM197273v == 1936682605) {
                zzbxVarM183530e = m183530e(1936682605, "TSOT", v6w0Var);
            } else if (iM197273v == 1936679276) {
                zzbxVarM183530e = m183530e(1936679276, "TSO2", v6w0Var);
            } else if (iM197273v == 1936679282) {
                zzbxVarM183530e = m183530e(1936679282, "TSOA", v6w0Var);
            } else if (iM197273v == 1936679265) {
                zzbxVarM183530e = m183530e(1936679265, "TSOP", v6w0Var);
            } else if (iM197273v == 1936679791) {
                zzbxVarM183530e = m183530e(1936679791, "TSOC", v6w0Var);
            } else if (iM197273v == 1920233063) {
                zzbxVarM183530e = m183528c(1920233063, "ITUNESADVISORY", v6w0Var, false, false);
            } else if (iM197273v == 1885823344) {
                zzbxVarM183530e = m183528c(1885823344, "ITUNESGAPLESS", v6w0Var, false, true);
            } else if (iM197273v == 1936683886) {
                zzbxVarM183530e = m183530e(1936683886, "TVSHOWSORT", v6w0Var);
            } else if (iM197273v == 1953919848) {
                zzbxVarM183530e = m183530e(1953919848, "TVSHOW", v6w0Var);
            } else if (iM197273v == 757935405) {
                int i4 = -1;
                int i5 = -1;
                String strM197251O2 = null;
                String strM197251O3 = null;
                while (v6w0Var.m197270s() < iM197270s) {
                    int iM197270s2 = v6w0Var.m197270s();
                    int iM197273v5 = v6w0Var.m197273v();
                    int iM197273v6 = v6w0Var.m197273v();
                    v6w0Var.m197263l(4);
                    if (iM197273v6 == 1835360622) {
                        strM197251O2 = v6w0Var.m197251O(iM197273v5 - 12);
                    } else {
                        int i6 = iM197273v5 - 12;
                        if (iM197273v6 == 1851878757) {
                            strM197251O3 = v6w0Var.m197251O(i6);
                        } else {
                            if (iM197273v6 == 1684108385) {
                                i5 = iM197273v5;
                            }
                            if (iM197273v6 == 1684108385) {
                                i4 = iM197270s2;
                            }
                            v6w0Var.m197263l(i6);
                        }
                    }
                }
                if (strM197251O2 != null && strM197251O3 != null && i4 != -1) {
                    v6w0Var.m197262k(i4);
                    v6w0Var.m197263l(16);
                    zzbxVarM183530e = new zzagt(strM197251O2, strM197251O3, v6w0Var.m197251O(i5 - 16));
                }
            } else {
                svv0.m186107b("MetadataUtil", "Skipped unknown metadata entry: " + tcr0.m188058b(iM197273v));
            }
            v6w0Var.m197262k(iM197270s);
            return zzbxVarM183530e;
        } catch (Throwable th) {
            v6w0Var.m197262k(iM197270s);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m183527b(v6w0 v6w0Var) {
        v6w0Var.m197263l(4);
        if (v6w0Var.m197273v() == 1684108385) {
            v6w0Var.m197263l(8);
            return v6w0Var.m197238B();
        }
        svv0.m186111f("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static zzagr m183528c(int i, String str, v6w0 v6w0Var, boolean z, boolean z2) {
        int iM183527b = m183527b(v6w0Var);
        if (z2) {
            iM183527b = Math.min(1, iM183527b);
        }
        if (iM183527b >= 0) {
            return z ? new zzagz(str, null, zzgaa.zzm(Integer.toString(iM183527b))) : new zzagk(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG, str, Integer.toString(iM183527b));
        }
        svv0.m186111f("MetadataUtil", "Failed to parse uint8 attribute: ".concat(tcr0.m188058b(i)));
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static zzagz m183529d(int i, String str, v6w0 v6w0Var) {
        int iM197273v = v6w0Var.m197273v();
        if (v6w0Var.m197273v() == 1684108385 && iM197273v >= 22) {
            v6w0Var.m197263l(10);
            int iM197242F = v6w0Var.m197242F();
            if (iM197242F > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iM197242F);
                String string = sb.toString();
                int iM197242F2 = v6w0Var.m197242F();
                if (iM197242F2 > 0) {
                    string = string + "/" + iM197242F2;
                }
                return new zzagz(str, null, zzgaa.zzm(string));
            }
        }
        svv0.m186111f("MetadataUtil", "Failed to parse index/count attribute: ".concat(tcr0.m188058b(i)));
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static zzagz m183530e(int i, String str, v6w0 v6w0Var) {
        int iM197273v = v6w0Var.m197273v();
        if (v6w0Var.m197273v() == 1684108385) {
            v6w0Var.m197263l(8);
            return new zzagz(str, null, zzgaa.zzm(v6w0Var.m197251O(iM197273v - 16)));
        }
        svv0.m186111f("MetadataUtil", "Failed to parse text attribute: ".concat(tcr0.m188058b(i)));
        return null;
    }
}
