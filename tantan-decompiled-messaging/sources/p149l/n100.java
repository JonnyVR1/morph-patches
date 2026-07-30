package p149l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.common.collect.ImmutableList;
import com.google.mlkit.p033nl.languageid.LanguageIdentifier;
import org.eclipse.jetty.http.HttpHeaders;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class n100 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public static final String[] f136609a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    @Nullable
    /* JADX INFO: renamed from: a */
    public static CommentFrame m157316a(int i, d860 d860Var) {
        int iM110311q = d860Var.m110311q();
        if (d860Var.m110311q() == 1684108385) {
            d860Var.m110293V(8);
            String strM110274C = d860Var.m110274C(iM110311q - 16);
            return new CommentFrame(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG, strM110274C, strM110274C);
        }
        jwv.m143689i("MetadataUtil", "Failed to parse comment attribute: " + y21.m212341a(i));
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static ApicFrame m157317b(d860 d860Var) {
        String str;
        int iM110311q = d860Var.m110311q();
        if (d860Var.m110311q() != 1684108385) {
            jwv.m143689i("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM212342b = y21.m212342b(d860Var.m110311q());
        if (iM212342b == 13) {
            str = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        } else {
            str = iM212342b == 14 ? DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG : null;
        }
        if (str == null) {
            jwv.m143689i("MetadataUtil", "Unrecognized cover art flags: " + iM212342b);
            return null;
        }
        d860Var.m110293V(4);
        int i = iM110311q - 16;
        byte[] bArr = new byte[i];
        d860Var.m110306l(bArr, 0, i);
        return new ApicFrame(str, null, 3, bArr);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static Metadata.Entry m157318c(d860 d860Var) {
        int iM110300f = d860Var.m110300f() + d860Var.m110311q();
        int iM110311q = d860Var.m110311q();
        int i = (iM110311q >> 24) & 255;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & iM110311q;
                if (i2 == 6516084) {
                    CommentFrame commentFrameM157316a = m157316a(iM110311q, d860Var);
                    d860Var.m110292U(iM110300f);
                    return commentFrameM157316a;
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    TextInformationFrame textInformationFrameM157323h = m157323h(iM110311q, "TIT2", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157323h;
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    TextInformationFrame textInformationFrameM157323h2 = m157323h(iM110311q, "TCOM", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157323h2;
                }
                if (i2 == 6578553) {
                    TextInformationFrame textInformationFrameM157323h3 = m157323h(iM110311q, "TDRC", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157323h3;
                }
                if (i2 == 4280916) {
                    TextInformationFrame textInformationFrameM157323h4 = m157323h(iM110311q, "TPE1", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157323h4;
                }
                if (i2 == 7630703) {
                    TextInformationFrame textInformationFrameM157323h5 = m157323h(iM110311q, "TSSE", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157323h5;
                }
                if (i2 == 6384738) {
                    TextInformationFrame textInformationFrameM157323h6 = m157323h(iM110311q, "TALB", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157323h6;
                }
                if (i2 == 7108978) {
                    TextInformationFrame textInformationFrameM157323h7 = m157323h(iM110311q, "USLT", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157323h7;
                }
                if (i2 == 6776174) {
                    TextInformationFrame textInformationFrameM157323h8 = m157323h(iM110311q, "TCON", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157323h8;
                }
                if (i2 == 6779504) {
                    TextInformationFrame textInformationFrameM157323h9 = m157323h(iM110311q, "TIT1", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157323h9;
                }
            } else {
                if (iM110311q == 1735291493) {
                    TextInformationFrame textInformationFrameM157322g = m157322g(d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157322g;
                }
                if (iM110311q == 1684632427) {
                    TextInformationFrame textInformationFrameM157319d = m157319d(iM110311q, "TPOS", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157319d;
                }
                if (iM110311q == 1953655662) {
                    TextInformationFrame textInformationFrameM157319d2 = m157319d(iM110311q, "TRCK", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157319d2;
                }
                if (iM110311q == 1953329263) {
                    Id3Frame id3FrameM157324i = m157324i(iM110311q, "TBPM", d860Var, true, false);
                    d860Var.m110292U(iM110300f);
                    return id3FrameM157324i;
                }
                if (iM110311q == 1668311404) {
                    Id3Frame id3FrameM157324i2 = m157324i(iM110311q, "TCMP", d860Var, true, true);
                    d860Var.m110292U(iM110300f);
                    return id3FrameM157324i2;
                }
                if (iM110311q == 1668249202) {
                    ApicFrame apicFrameM157317b = m157317b(d860Var);
                    d860Var.m110292U(iM110300f);
                    return apicFrameM157317b;
                }
                if (iM110311q == 1631670868) {
                    TextInformationFrame textInformationFrameM157323h10 = m157323h(iM110311q, "TPE2", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157323h10;
                }
                if (iM110311q == 1936682605) {
                    TextInformationFrame textInformationFrameM157323h11 = m157323h(iM110311q, "TSOT", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157323h11;
                }
                if (iM110311q == 1936679276) {
                    TextInformationFrame textInformationFrameM157323h12 = m157323h(iM110311q, "TSO2", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157323h12;
                }
                if (iM110311q == 1936679282) {
                    TextInformationFrame textInformationFrameM157323h13 = m157323h(iM110311q, "TSOA", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157323h13;
                }
                if (iM110311q == 1936679265) {
                    TextInformationFrame textInformationFrameM157323h14 = m157323h(iM110311q, "TSOP", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157323h14;
                }
                if (iM110311q == 1936679791) {
                    TextInformationFrame textInformationFrameM157323h15 = m157323h(iM110311q, "TSOC", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157323h15;
                }
                if (iM110311q == 1920233063) {
                    Id3Frame id3FrameM157324i3 = m157324i(iM110311q, "ITUNESADVISORY", d860Var, false, false);
                    d860Var.m110292U(iM110300f);
                    return id3FrameM157324i3;
                }
                if (iM110311q == 1885823344) {
                    Id3Frame id3FrameM157324i4 = m157324i(iM110311q, "ITUNESGAPLESS", d860Var, false, true);
                    d860Var.m110292U(iM110300f);
                    return id3FrameM157324i4;
                }
                if (iM110311q == 1936683886) {
                    TextInformationFrame textInformationFrameM157323h16 = m157323h(iM110311q, "TVSHOWSORT", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157323h16;
                }
                if (iM110311q == 1953919848) {
                    TextInformationFrame textInformationFrameM157323h17 = m157323h(iM110311q, "TVSHOW", d860Var);
                    d860Var.m110292U(iM110300f);
                    return textInformationFrameM157323h17;
                }
                if (iM110311q == 757935405) {
                    Id3Frame id3FrameM157320e = m157320e(d860Var, iM110300f);
                    d860Var.m110292U(iM110300f);
                    return id3FrameM157320e;
                }
            }
            jwv.m143682b("MetadataUtil", "Skipped unknown metadata entry: " + y21.m212341a(iM110311q));
            d860Var.m110292U(iM110300f);
            return null;
        } catch (Throwable th) {
            d860Var.m110292U(iM110300f);
            throw th;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static TextInformationFrame m157319d(int i, String str, d860 d860Var) {
        int iM110311q = d860Var.m110311q();
        if (d860Var.m110311q() == 1684108385 && iM110311q >= 22) {
            d860Var.m110293V(10);
            int iM110285N = d860Var.m110285N();
            if (iM110285N > 0) {
                String str2 = "" + iM110285N;
                int iM110285N2 = d860Var.m110285N();
                if (iM110285N2 > 0) {
                    str2 = str2 + "/" + iM110285N2;
                }
                return new TextInformationFrame(str, null, ImmutableList.m15686of(str2));
            }
        }
        jwv.m143689i("MetadataUtil", "Failed to parse index/count attribute: " + y21.m212341a(i));
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static Id3Frame m157320e(d860 d860Var, int i) {
        String strM110274C = null;
        String strM110274C2 = null;
        int i2 = -1;
        int i3 = -1;
        while (d860Var.m110300f() < i) {
            int iM110300f = d860Var.m110300f();
            int iM110311q = d860Var.m110311q();
            int iM110311q2 = d860Var.m110311q();
            d860Var.m110293V(4);
            if (iM110311q2 == 1835360622) {
                strM110274C = d860Var.m110274C(iM110311q - 12);
            } else if (iM110311q2 == 1851878757) {
                strM110274C2 = d860Var.m110274C(iM110311q - 12);
            } else {
                if (iM110311q2 == 1684108385) {
                    i2 = iM110300f;
                    i3 = iM110311q;
                }
                d860Var.m110293V(iM110311q - 12);
            }
        }
        if (strM110274C == null || strM110274C2 == null || i2 == -1) {
            return null;
        }
        d860Var.m110292U(i2);
        d860Var.m110293V(16);
        return new InternalFrame(strM110274C, strM110274C2, d860Var.m110274C(i3 - 16));
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static MdtaMetadataEntry m157321f(d860 d860Var, int i, String str) {
        while (true) {
            int iM110300f = d860Var.m110300f();
            if (iM110300f >= i) {
                return null;
            }
            int iM110311q = d860Var.m110311q();
            if (d860Var.m110311q() == 1684108385) {
                int iM110311q2 = d860Var.m110311q();
                int iM110311q3 = d860Var.m110311q();
                int i2 = iM110311q - 16;
                byte[] bArr = new byte[i2];
                d860Var.m110306l(bArr, 0, i2);
                return new MdtaMetadataEntry(str, bArr, iM110311q3, iM110311q2);
            }
            d860Var.m110292U(iM110300f + iM110311q);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    @Nullable
    /* JADX INFO: renamed from: g */
    public static TextInformationFrame m157322g(d860 d860Var) {
        String str;
        int iM157325j = m157325j(d860Var);
        if (iM157325j > 0) {
            String[] strArr = f136609a;
            if (iM157325j <= strArr.length) {
                str = strArr[iM157325j - 1];
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return new TextInformationFrame("TCON", null, ImmutableList.m15686of(str));
        }
        jwv.m143689i("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static TextInformationFrame m157323h(int i, String str, d860 d860Var) {
        int iM110311q = d860Var.m110311q();
        if (d860Var.m110311q() == 1684108385) {
            d860Var.m110293V(8);
            return new TextInformationFrame(str, null, ImmutableList.m15686of(d860Var.m110274C(iM110311q - 16)));
        }
        jwv.m143689i("MetadataUtil", "Failed to parse text attribute: " + y21.m212341a(i));
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static Id3Frame m157324i(int i, String str, d860 d860Var, boolean z, boolean z2) {
        int iM157325j = m157325j(d860Var);
        if (z2) {
            iM157325j = Math.min(1, iM157325j);
        }
        if (iM157325j >= 0) {
            return z ? new TextInformationFrame(str, null, ImmutableList.m15686of(Integer.toString(iM157325j))) : new CommentFrame(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG, str, Integer.toString(iM157325j));
        }
        jwv.m143689i("MetadataUtil", "Failed to parse uint8 attribute: " + y21.m212341a(i));
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static int m157325j(d860 d860Var) {
        d860Var.m110293V(4);
        if (d860Var.m110311q() == 1684108385) {
            d860Var.m110293V(8);
            return d860Var.m110279H();
        }
        jwv.m143689i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public static void m157326k(int i, pij pijVar, C1871k.b bVar) {
        if (i == 1 && pijVar.m169608a()) {
            bVar.m10329P(pijVar.f149573a).m10330Q(pijVar.f149574b);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m157327l(int i, @Nullable Metadata metadata, @Nullable Metadata metadata2, C1871k.b bVar, Metadata... metadataArr) {
        Metadata metadata3 = new Metadata(new Metadata.Entry[0]);
        if (i != 1 || metadata == null) {
            metadata = metadata3;
        }
        if (metadata2 != null) {
            for (int i2 = 0; i2 < metadata2.m10533e(); i2++) {
                Metadata.Entry entryM10532d = metadata2.m10532d(i2);
                if (entryM10532d instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entryM10532d;
                    if (!mdtaMetadataEntry.key.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                        metadata = metadata.m10529a(mdtaMetadataEntry);
                    } else if (i == 2) {
                        metadata = metadata.m10529a(mdtaMetadataEntry);
                    }
                }
            }
        }
        for (Metadata metadata4 : metadataArr) {
            metadata = metadata.m10530b(metadata4);
        }
        if (metadata.m10533e() > 0) {
            bVar.m10339Z(metadata);
        }
    }
}
