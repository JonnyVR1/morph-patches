package p149l;

import android.text.TextUtils;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class evk {

    /* JADX INFO: renamed from: b */
    public static final char[] f93350b = {38463, 21710, 23433, 32942, 20985, 20843, 25344, 25203, 37030, 21241, 38466, 22868, 20283, 23620, 36793, 28780, 24971, 27715, 20907, 30326, 23788, 22163, 20594, 21442, 20179, 25761, 20874, 23934, 26365, 26366, 23652, 21449, 33414, 36799, 20261, 25220, 36710, 25275, 27784, 27785, 38455, 21507, 20805, 25277, 20986, 27451, 25571, 24027, 20997, 21561, 26110, 36916, 21618, 21254, 20945, 31895, 27718, 23828, 37032, 25619, 21649, 21574, 20025, 24403, 20992, 22042, 25189, 28783, 27664, 22002, 30008, 20993, 29241, 19969, 19999, 19996, 21562, 21438, 32785, 35176, 21544, 22810, 22968, 35830, 22848, 38821, 20799, 21457, 24070, 21274, 39134, 20998, 20016, 35205, 20175, 32017, 20245, 26094, 20357, 29976, 20872, 30347, 25096, 32473, 26681, 21039, 24037, 21246, 20272, 29916, 20054, 20851, 20809, 24402, 20008, 21593, 21704, 21645, 20292, 22831, 33568, 35779, 40658, 25323, 20136, 22135, 21503, 40769, 20079, 33457, 24576, 29375, 24031, 28784, 26127, 21529, 19980, 21152, 25099, 27743, 33405, 38454, 24062, 22357, 20866, 20009, 20965, 23010, 22104, 20891, 21652, 24320, 21002, 24572, 23611, 21308, 32910, 21157, 31354, 25248, 25181, 22840, 33967, 23485, 21281, 20111, 22372, 25193, 22403, 26469, 20848, 21879, 25438, 32907, 21202, 23834, 21013, 20457, 22849, 33391, 25769, 21015, 25294, 21026, 28316, 22230, 40857, 30620, 22108, 23048, 30055, 25249, 32599, 21603, 22920, 22475, 23258, 29284, 29483, 20040, 21573, 38376, 30015, 21674, 23424, 21941, 20060, 27665, 21517, 35884, 25720, 21726, 27626, 21999, 25295, 33097, 22241, 22228, 23404, 30098, 23070, 24641, 33021, 22958, 25288, 23330, 40479, 25423, 22236, 23425, 22942, 20892, 32698, 22900, 22907, 30111, 40641, 37069, 21908, 35764, 22929, 25293, 30469, 20051, 25243, 21624, 21943, 21257, 19989, 22248, 21117, 27669, 23000, 20050, 38027, 21078, 20166, 19971, 25488, 21315, 21595, 24708, 30335, 20146, 29381, 33422, 19992, 21306, 23761, 32570, 22795, 21605, 31331, 23046, 24825, 20154, 25172, 26085, 33592, 21433, 37018, 25404, 22567, 23121, 30628, 25468, 20200, 27618, 19977, 26706, 25531, 38314, 26862, 20711, 26432, 31579, 23665, 20260, 24368, 22882, 30003, 33688, 25938, 21319, 23608, 21454, 20070, 21047, 34928, 38377, 21452, 35841, 21550, 35828, 21430, 24554, 25436, 33487, 29435, 22794, 23385, 21766, 20182, 22268, 22349, 27748, 22834, 24529, 29093, 21076, 22825, 26091, 24086, 21381, 22258, 20599, 20984, 28237, 25512, 21534, 20039, 31349, 27498, 24367, 23587, 21361, 26167, 32705, 25373, 20044, 22805, 34418, 20186, 20065, 28785, 20123, 24515, 26143, 20982, 20241, 21505, 21509, 21066, 22339, 20011, 24697, 22830, 24186, 20539, 19968, 22233, 24212, 21727, 20323, 20248, 25180, 22246, 26352, 26197, 31584, 31612, 24064, 28797, 20802, 21288, 20654, 21017, 36156, 24590, 22679, 25166, 25434, 27838, 24352, 38271, 38263, 20299, 34567, 36126, 20105, 20043, 23769, 24226, 20013, 24030, 26417, 25235, 25341, 19987, 22918, 38585, 23442, 21331, 20082, 23447, 37049, 31199, 38075, 21404, 23562, 26152, 20825, 40899, 40900};

    /* JADX INFO: renamed from: c */
    public static final byte[][] f93351c = {new byte[]{65, 0, 0, 0, 0, 0}, new byte[]{65, 73, 0, 0, 0, 0}, new byte[]{65, 78, 0, 0, 0, 0}, new byte[]{65, 78, 71, 0, 0, 0}, new byte[]{65, 79, 0, 0, 0, 0}, new byte[]{66, 65, 0, 0, 0, 0}, new byte[]{66, 65, 73, 0, 0, 0}, new byte[]{66, 65, 78, 0, 0, 0}, new byte[]{66, 65, 78, 71, 0, 0}, new byte[]{66, 65, 79, 0, 0, 0}, new byte[]{66, 69, 73, 0, 0, 0}, new byte[]{66, 69, 78, 0, 0, 0}, new byte[]{66, 69, 78, 71, 0, 0}, new byte[]{66, 73, 0, 0, 0, 0}, new byte[]{66, 73, 65, 78, 0, 0}, new byte[]{66, 73, 65, 79, 0, 0}, new byte[]{66, 73, 69, 0, 0, 0}, new byte[]{66, 73, 78, 0, 0, 0}, new byte[]{66, 73, 78, 71, 0, 0}, new byte[]{66, 79, 0, 0, 0, 0}, new byte[]{66, 85, 0, 0, 0, 0}, new byte[]{67, 65, 0, 0, 0, 0}, new byte[]{67, 65, 73, 0, 0, 0}, new byte[]{67, 65, 78, 0, 0, 0}, new byte[]{67, 65, 78, 71, 0, 0}, new byte[]{67, 65, 79, 0, 0, 0}, new byte[]{67, 69, 0, 0, 0, 0}, new byte[]{67, 69, 78, 0, 0, 0}, new byte[]{67, 69, 78, 71, 0, 0}, new byte[]{90, 69, 78, 71, 0, 0}, new byte[]{67, 69, 78, 71, 0, 0}, new byte[]{67, 72, 65, 0, 0, 0}, new byte[]{67, 72, 65, 73, 0, 0}, new byte[]{67, 72, 65, 78, 0, 0}, new byte[]{67, 72, 65, 78, 71, 0}, new byte[]{67, 72, 65, 79, 0, 0}, new byte[]{67, 72, 69, 0, 0, 0}, new byte[]{67, 72, 69, 78, 0, 0}, new byte[]{83, 72, 69, 78, 0, 0}, new byte[]{67, 72, 69, 78, 0, 0}, new byte[]{67, 72, 69, 78, 71, 0}, new byte[]{67, 72, 73, 0, 0, 0}, new byte[]{67, 72, 79, 78, 71, 0}, new byte[]{67, 72, 79, 85, 0, 0}, new byte[]{67, 72, 85, 0, 0, 0}, new byte[]{67, 72, 85, 65, 0, 0}, new byte[]{67, 72, 85, 65, 73, 0}, new byte[]{67, 72, 85, 65, 78, 0}, new byte[]{67, 72, 85, 65, 78, 71}, new byte[]{67, 72, 85, 73, 0, 0}, new byte[]{67, 72, 85, 78, 0, 0}, new byte[]{67, 72, 85, 79, 0, 0}, new byte[]{67, 73, 0, 0, 0, 0}, new byte[]{67, 79, 78, 71, 0, 0}, new byte[]{67, 79, 85, 0, 0, 0}, new byte[]{67, 85, 0, 0, 0, 0}, new byte[]{67, 85, 65, 78, 0, 0}, new byte[]{67, 85, 73, 0, 0, 0}, new byte[]{67, 85, 78, 0, 0, 0}, new byte[]{67, 85, 79, 0, 0, 0}, new byte[]{68, 65, 0, 0, 0, 0}, new byte[]{68, 65, 73, 0, 0, 0}, new byte[]{68, 65, 78, 0, 0, 0}, new byte[]{68, 65, 78, 71, 0, 0}, new byte[]{68, 65, 79, 0, 0, 0}, new byte[]{68, 69, 0, 0, 0, 0}, new byte[]{68, 69, 78, 0, 0, 0}, new byte[]{68, 69, 78, 71, 0, 0}, new byte[]{68, 73, 0, 0, 0, 0}, new byte[]{68, 73, 65, 0, 0, 0}, new byte[]{68, 73, 65, 78, 0, 0}, new byte[]{68, 73, 65, 79, 0, 0}, new byte[]{68, 73, 69, 0, 0, 0}, new byte[]{68, 73, 78, 71, 0, 0}, new byte[]{68, 73, 85, 0, 0, 0}, new byte[]{68, 79, 78, 71, 0, 0}, new byte[]{68, 79, 85, 0, 0, 0}, new byte[]{68, 85, 0, 0, 0, 0}, new byte[]{68, 85, 65, 78, 0, 0}, new byte[]{68, 85, 73, 0, 0, 0}, new byte[]{68, 85, 78, 0, 0, 0}, new byte[]{68, 85, 79, 0, 0, 0}, new byte[]{69, 0, 0, 0, 0, 0}, new byte[]{69, 73, 0, 0, 0, 0}, new byte[]{69, 78, 0, 0, 0, 0}, new byte[]{69, 78, 71, 0, 0, 0}, new byte[]{69, 82, 0, 0, 0, 0}, new byte[]{70, 65, 0, 0, 0, 0}, new byte[]{70, 65, 78, 0, 0, 0}, new byte[]{70, 65, 78, 71, 0, 0}, new byte[]{70, 69, 73, 0, 0, 0}, new byte[]{70, 69, 78, 0, 0, 0}, new byte[]{70, 69, 78, 71, 0, 0}, new byte[]{70, 73, 65, 79, 0, 0}, new byte[]{70, 79, 0, 0, 0, 0}, new byte[]{70, 79, 85, 0, 0, 0}, new byte[]{70, 85, 0, 0, 0, 0}, new byte[]{71, 65, 0, 0, 0, 0}, new byte[]{71, 65, 73, 0, 0, 0}, new byte[]{71, 65, 78, 0, 0, 0}, new byte[]{71, 65, 78, 71, 0, 0}, new byte[]{71, 65, 79, 0, 0, 0}, new byte[]{71, 69, 0, 0, 0, 0}, new byte[]{71, 69, 73, 0, 0, 0}, new byte[]{71, 69, 78, 0, 0, 0}, new byte[]{71, 69, 78, 71, 0, 0}, new byte[]{71, 79, 78, 71, 0, 0}, new byte[]{71, 79, 85, 0, 0, 0}, new byte[]{71, 85, 0, 0, 0, 0}, new byte[]{71, 85, 65, 0, 0, 0}, new byte[]{71, 85, 65, 73, 0, 0}, new byte[]{71, 85, 65, 78, 0, 0}, new byte[]{71, 85, 65, 78, 71, 0}, new byte[]{71, 85, 73, 0, 0, 0}, new byte[]{71, 85, 78, 0, 0, 0}, new byte[]{71, 85, 79, 0, 0, 0}, new byte[]{72, 65, 0, 0, 0, 0}, new byte[]{72, 65, 73, 0, 0, 0}, new byte[]{72, 65, 78, 0, 0, 0}, new byte[]{72, 65, 78, 71, 0, 0}, new byte[]{72, 65, 79, 0, 0, 0}, new byte[]{72, 69, 0, 0, 0, 0}, new byte[]{72, 69, 73, 0, 0, 0}, new byte[]{72, 69, 78, 0, 0, 0}, new byte[]{72, 69, 78, 71, 0, 0}, new byte[]{72, 77, 0, 0, 0, 0}, new byte[]{72, 79, 78, 71, 0, 0}, new byte[]{72, 79, 85, 0, 0, 0}, new byte[]{72, 85, 0, 0, 0, 0}, new byte[]{72, 85, 65, 0, 0, 0}, new byte[]{72, 85, 65, 73, 0, 0}, new byte[]{72, 85, 65, 78, 0, 0}, new byte[]{72, 85, 65, 78, 71, 0}, new byte[]{72, 85, 73, 0, 0, 0}, new byte[]{72, 85, 78, 0, 0, 0}, new byte[]{72, 85, 79, 0, 0, 0}, new byte[]{74, 73, 0, 0, 0, 0}, new byte[]{74, 73, 65, 0, 0, 0}, new byte[]{74, 73, 65, 78, 0, 0}, new byte[]{74, 73, 65, 78, 71, 0}, new byte[]{74, 73, 65, 79, 0, 0}, new byte[]{74, 73, 69, 0, 0, 0}, new byte[]{74, 73, 78, 0, 0, 0}, new byte[]{74, 73, 78, 71, 0, 0}, new byte[]{74, 73, 79, 78, 71, 0}, new byte[]{74, 73, 85, 0, 0, 0}, new byte[]{74, 85, 0, 0, 0, 0}, new byte[]{74, 85, 65, 78, 0, 0}, new byte[]{74, 85, 69, 0, 0, 0}, new byte[]{74, 85, 78, 0, 0, 0}, new byte[]{75, 65, 0, 0, 0, 0}, new byte[]{75, 65, 73, 0, 0, 0}, new byte[]{75, 65, 78, 0, 0, 0}, new byte[]{75, 65, 78, 71, 0, 0}, new byte[]{75, 65, 79, 0, 0, 0}, new byte[]{75, 69, 0, 0, 0, 0}, new byte[]{75, 69, 78, 0, 0, 0}, new byte[]{75, 69, 78, 71, 0, 0}, new byte[]{75, 79, 78, 71, 0, 0}, new byte[]{75, 79, 85, 0, 0, 0}, new byte[]{75, 85, 0, 0, 0, 0}, new byte[]{75, 85, 65, 0, 0, 0}, new byte[]{75, 85, 65, 73, 0, 0}, new byte[]{75, 85, 65, 78, 0, 0}, new byte[]{75, 85, 65, 78, 71, 0}, new byte[]{75, 85, 73, 0, 0, 0}, new byte[]{75, 85, 78, 0, 0, 0}, new byte[]{75, 85, 79, 0, 0, 0}, new byte[]{76, 65, 0, 0, 0, 0}, new byte[]{76, 65, 73, 0, 0, 0}, new byte[]{76, 65, 78, 0, 0, 0}, new byte[]{76, 65, 78, 71, 0, 0}, new byte[]{76, 65, 79, 0, 0, 0}, new byte[]{76, 69, 0, 0, 0, 0}, new byte[]{76, 69, 73, 0, 0, 0}, new byte[]{76, 69, 78, 71, 0, 0}, new byte[]{76, 73, 0, 0, 0, 0}, new byte[]{76, 73, 65, 0, 0, 0}, new byte[]{76, 73, 65, 78, 0, 0}, new byte[]{76, 73, 65, 78, 71, 0}, new byte[]{76, 73, 65, 79, 0, 0}, new byte[]{76, 73, 69, 0, 0, 0}, new byte[]{76, 73, 78, 0, 0, 0}, new byte[]{76, 73, 78, 71, 0, 0}, new byte[]{76, 73, 85, 0, 0, 0}, new byte[]{76, 79, 0, 0, 0, 0}, new byte[]{76, 79, 78, 71, 0, 0}, new byte[]{76, 79, 85, 0, 0, 0}, new byte[]{76, 85, 0, 0, 0, 0}, new byte[]{76, 85, 65, 78, 0, 0}, new byte[]{76, 85, 69, 0, 0, 0}, new byte[]{76, 85, 78, 0, 0, 0}, new byte[]{76, 85, 79, 0, 0, 0}, new byte[]{77, 0, 0, 0, 0, 0}, new byte[]{77, 65, 0, 0, 0, 0}, new byte[]{77, 65, 73, 0, 0, 0}, new byte[]{77, 65, 78, 0, 0, 0}, new byte[]{77, 65, 78, 71, 0, 0}, new byte[]{77, 65, 79, 0, 0, 0}, new byte[]{77, 69, 0, 0, 0, 0}, new byte[]{77, 69, 73, 0, 0, 0}, new byte[]{77, 69, 78, 0, 0, 0}, new byte[]{77, 69, 78, 71, 0, 0}, new byte[]{77, 73, 0, 0, 0, 0}, new byte[]{77, 73, 65, 78, 0, 0}, new byte[]{77, 73, 65, 79, 0, 0}, new byte[]{77, 73, 69, 0, 0, 0}, new byte[]{77, 73, 78, 0, 0, 0}, new byte[]{77, 73, 78, 71, 0, 0}, new byte[]{77, 73, 85, 0, 0, 0}, new byte[]{77, 79, 0, 0, 0, 0}, new byte[]{77, 79, 85, 0, 0, 0}, new byte[]{77, 85, 0, 0, 0, 0}, new byte[]{78, 0, 0, 0, 0, 0}, new byte[]{78, 65, 0, 0, 0, 0}, new byte[]{78, 65, 73, 0, 0, 0}, new byte[]{78, 65, 78, 0, 0, 0}, new byte[]{78, 65, 78, 71, 0, 0}, new byte[]{78, 65, 79, 0, 0, 0}, new byte[]{78, 69, 0, 0, 0, 0}, new byte[]{78, 69, 73, 0, 0, 0}, new byte[]{78, 69, 78, 0, 0, 0}, new byte[]{78, 69, 78, 71, 0, 0}, new byte[]{78, 73, 0, 0, 0, 0}, new byte[]{78, 73, 65, 78, 0, 0}, new byte[]{78, 73, 65, 78, 71, 0}, new byte[]{78, 73, 65, 79, 0, 0}, new byte[]{78, 73, 69, 0, 0, 0}, new byte[]{78, 73, 78, 0, 0, 0}, new byte[]{78, 73, 78, 71, 0, 0}, new byte[]{78, 73, 85, 0, 0, 0}, new byte[]{78, 79, 78, 71, 0, 0}, new byte[]{78, 79, 85, 0, 0, 0}, new byte[]{78, 85, 0, 0, 0, 0}, new byte[]{78, 85, 65, 78, 0, 0}, new byte[]{78, 85, 69, 0, 0, 0}, new byte[]{78, 85, 78, 0, 0, 0}, new byte[]{78, 85, 79, 0, 0, 0}, new byte[]{79, 0, 0, 0, 0, 0}, new byte[]{79, 85, 0, 0, 0, 0}, new byte[]{80, 65, 0, 0, 0, 0}, new byte[]{80, 65, 73, 0, 0, 0}, new byte[]{80, 65, 78, 0, 0, 0}, new byte[]{80, 65, 78, 71, 0, 0}, new byte[]{80, 65, 79, 0, 0, 0}, new byte[]{80, 69, 73, 0, 0, 0}, new byte[]{80, 69, 78, 0, 0, 0}, new byte[]{80, 69, 78, 71, 0, 0}, new byte[]{80, 73, 0, 0, 0, 0}, new byte[]{80, 73, 65, 78, 0, 0}, new byte[]{80, 73, 65, 79, 0, 0}, new byte[]{80, 73, 69, 0, 0, 0}, new byte[]{80, 73, 78, 0, 0, 0}, new byte[]{80, 73, 78, 71, 0, 0}, new byte[]{80, 79, 0, 0, 0, 0}, new byte[]{80, 79, 85, 0, 0, 0}, new byte[]{80, 85, 0, 0, 0, 0}, new byte[]{81, 73, 0, 0, 0, 0}, new byte[]{81, 73, 65, 0, 0, 0}, new byte[]{81, 73, 65, 78, 0, 0}, new byte[]{81, 73, 65, 78, 71, 0}, new byte[]{81, 73, 65, 79, 0, 0}, new byte[]{81, 73, 69, 0, 0, 0}, new byte[]{81, 73, 78, 0, 0, 0}, new byte[]{81, 73, 78, 71, 0, 0}, new byte[]{81, 73, 79, 78, 71, 0}, new byte[]{81, 73, 85, 0, 0, 0}, new byte[]{81, 85, 0, 0, 0, 0}, new byte[]{81, 85, 65, 78, 0, 0}, new byte[]{81, 85, 69, 0, 0, 0}, new byte[]{81, 85, 78, 0, 0, 0}, new byte[]{82, 65, 78, 0, 0, 0}, new byte[]{82, 65, 78, 71, 0, 0}, new byte[]{82, 65, 79, 0, 0, 0}, new byte[]{82, 69, 0, 0, 0, 0}, new byte[]{82, 69, 78, 0, 0, 0}, new byte[]{82, 69, 78, 71, 0, 0}, new byte[]{82, 73, 0, 0, 0, 0}, new byte[]{82, 79, 78, 71, 0, 0}, new byte[]{82, 79, 85, 0, 0, 0}, new byte[]{82, 85, 0, 0, 0, 0}, new byte[]{82, 85, 65, 0, 0, 0}, new byte[]{82, 85, 65, 78, 0, 0}, new byte[]{82, 85, 73, 0, 0, 0}, new byte[]{82, 85, 78, 0, 0, 0}, new byte[]{82, 85, 79, 0, 0, 0}, new byte[]{83, 65, 0, 0, 0, 0}, new byte[]{83, 65, 73, 0, 0, 0}, new byte[]{83, 65, 78, 0, 0, 0}, new byte[]{83, 65, 78, 71, 0, 0}, new byte[]{83, 65, 79, 0, 0, 0}, new byte[]{83, 69, 0, 0, 0, 0}, new byte[]{83, 69, 78, 0, 0, 0}, new byte[]{83, 69, 78, 71, 0, 0}, new byte[]{83, 72, 65, 0, 0, 0}, new byte[]{83, 72, 65, 73, 0, 0}, new byte[]{83, 72, 65, 78, 0, 0}, new byte[]{83, 72, 65, 78, 71, 0}, new byte[]{83, 72, 65, 79, 0, 0}, new byte[]{83, 72, 69, 0, 0, 0}, new byte[]{83, 72, 69, 78, 0, 0}, new byte[]{88, 73, 78, 0, 0, 0}, new byte[]{83, 72, 69, 78, 0, 0}, new byte[]{83, 72, 69, 78, 71, 0}, new byte[]{83, 72, 73, 0, 0, 0}, new byte[]{83, 72, 79, 85, 0, 0}, new byte[]{83, 72, 85, 0, 0, 0}, new byte[]{83, 72, 85, 65, 0, 0}, new byte[]{83, 72, 85, 65, 73, 0}, new byte[]{83, 72, 85, 65, 78, 0}, new byte[]{83, 72, 85, 65, 78, 71}, new byte[]{83, 72, 85, 73, 0, 0}, new byte[]{83, 72, 85, 78, 0, 0}, new byte[]{83, 72, 85, 79, 0, 0}, new byte[]{83, 73, 0, 0, 0, 0}, new byte[]{83, 79, 78, 71, 0, 0}, new byte[]{83, 79, 85, 0, 0, 0}, new byte[]{83, 85, 0, 0, 0, 0}, new byte[]{83, 85, 65, 78, 0, 0}, new byte[]{83, 85, 73, 0, 0, 0}, new byte[]{83, 85, 78, 0, 0, 0}, new byte[]{83, 85, 79, 0, 0, 0}, new byte[]{84, 65, 0, 0, 0, 0}, new byte[]{84, 65, 73, 0, 0, 0}, new byte[]{84, 65, 78, 0, 0, 0}, new byte[]{84, 65, 78, 71, 0, 0}, new byte[]{84, 65, 79, 0, 0, 0}, new byte[]{84, 69, 0, 0, 0, 0}, new byte[]{84, 69, 78, 71, 0, 0}, new byte[]{84, 73, 0, 0, 0, 0}, new byte[]{84, 73, 65, 78, 0, 0}, new byte[]{84, 73, 65, 79, 0, 0}, new byte[]{84, 73, 69, 0, 0, 0}, new byte[]{84, 73, 78, 71, 0, 0}, new byte[]{84, 79, 78, 71, 0, 0}, new byte[]{84, 79, 85, 0, 0, 0}, new byte[]{84, 85, 0, 0, 0, 0}, new byte[]{84, 85, 65, 78, 0, 0}, new byte[]{84, 85, 73, 0, 0, 0}, new byte[]{84, 85, 78, 0, 0, 0}, new byte[]{84, 85, 79, 0, 0, 0}, new byte[]{87, 65, 0, 0, 0, 0}, new byte[]{87, 65, 73, 0, 0, 0}, new byte[]{87, 65, 78, 0, 0, 0}, new byte[]{87, 65, 78, 71, 0, 0}, new byte[]{87, 69, 73, 0, 0, 0}, new byte[]{87, 69, 78, 0, 0, 0}, new byte[]{87, 69, 78, 71, 0, 0}, new byte[]{87, 79, 0, 0, 0, 0}, new byte[]{87, 85, 0, 0, 0, 0}, new byte[]{88, 73, 0, 0, 0, 0}, new byte[]{88, 73, 65, 0, 0, 0}, new byte[]{88, 73, 65, 78, 0, 0}, new byte[]{88, 73, 65, 78, 71, 0}, new byte[]{88, 73, 65, 79, 0, 0}, new byte[]{88, 73, 69, 0, 0, 0}, new byte[]{88, 73, 78, 0, 0, 0}, new byte[]{88, 73, 78, 71, 0, 0}, new byte[]{88, 73, 79, 78, 71, 0}, new byte[]{88, 73, 85, 0, 0, 0}, new byte[]{88, 85, 0, 0, 0, 0}, new byte[]{88, 85, 65, 78, 0, 0}, new byte[]{88, 85, 69, 0, 0, 0}, new byte[]{88, 85, 78, 0, 0, 0}, new byte[]{89, 65, 0, 0, 0, 0}, new byte[]{89, 65, 78, 0, 0, 0}, new byte[]{89, 65, 78, 71, 0, 0}, new byte[]{89, 65, 79, 0, 0, 0}, new byte[]{89, 69, 0, 0, 0, 0}, new byte[]{89, 73, 0, 0, 0, 0}, new byte[]{89, 73, 78, 0, 0, 0}, new byte[]{89, 73, 78, 71, 0, 0}, new byte[]{89, 79, 0, 0, 0, 0}, new byte[]{89, 79, 78, 71, 0, 0}, new byte[]{89, 79, 85, 0, 0, 0}, new byte[]{89, 85, 0, 0, 0, 0}, new byte[]{89, 85, 65, 78, 0, 0}, new byte[]{89, 85, 69, 0, 0, 0}, new byte[]{89, 85, 78, 0, 0, 0}, new byte[]{74, 85, 78, 0, 0, 0}, new byte[]{89, 85, 78, 0, 0, 0}, new byte[]{90, 65, 0, 0, 0, 0}, new byte[]{90, 65, 73, 0, 0, 0}, new byte[]{90, 65, 78, 0, 0, 0}, new byte[]{90, 65, 78, 71, 0, 0}, new byte[]{90, 65, 79, 0, 0, 0}, new byte[]{90, 69, 0, 0, 0, 0}, new byte[]{90, 69, 73, 0, 0, 0}, new byte[]{90, 69, 78, 0, 0, 0}, new byte[]{90, 69, 78, 71, 0, 0}, new byte[]{90, 72, 65, 0, 0, 0}, new byte[]{90, 72, 65, 73, 0, 0}, new byte[]{90, 72, 65, 78, 0, 0}, new byte[]{90, 72, 65, 78, 71, 0}, new byte[]{67, 72, 65, 78, 71, 0}, new byte[]{90, 72, 65, 78, 71, 0}, new byte[]{90, 72, 65, 79, 0, 0}, new byte[]{90, 72, 69, 0, 0, 0}, new byte[]{90, 72, 69, 78, 0, 0}, new byte[]{90, 72, 69, 78, 71, 0}, new byte[]{90, 72, 73, 0, 0, 0}, new byte[]{83, 72, 73, 0, 0, 0}, new byte[]{90, 72, 73, 0, 0, 0}, new byte[]{90, 72, 79, 78, 71, 0}, new byte[]{90, 72, 79, 85, 0, 0}, new byte[]{90, 72, 85, 0, 0, 0}, new byte[]{90, 72, 85, 65, 0, 0}, new byte[]{90, 72, 85, 65, 73, 0}, new byte[]{90, 72, 85, 65, 78, 0}, new byte[]{90, 72, 85, 65, 78, 71}, new byte[]{90, 72, 85, 73, 0, 0}, new byte[]{90, 72, 85, 78, 0, 0}, new byte[]{90, 72, 85, 79, 0, 0}, new byte[]{90, 73, 0, 0, 0, 0}, new byte[]{90, 79, 78, 71, 0, 0}, new byte[]{90, 79, 85, 0, 0, 0}, new byte[]{90, 85, 0, 0, 0, 0}, new byte[]{90, 85, 65, 78, 0, 0}, new byte[]{90, 85, 73, 0, 0, 0}, new byte[]{90, 85, 78, 0, 0, 0}, new byte[]{90, 85, 79, 0, 0, 0}, new byte[]{0, 0, 0, 0, 0, 0}, new byte[]{83, 72, 65, 78, 0, 0}, new byte[]{0, 0, 0, 0, 0, 0}};

    /* JADX INFO: renamed from: d */
    public static final Collator f93352d = Collator.getInstance(Locale.CHINA);

    /* JADX INFO: renamed from: e */
    public static evk f93353e;

    /* JADX INFO: renamed from: a */
    public final boolean f93354a;

    public evk(boolean z) {
        this.f93354a = z;
    }

    /* JADX INFO: renamed from: c */
    public static evk m118285c() {
        evk evkVar;
        evk evkVar2 = f93353e;
        if (evkVar2 != null) {
            return evkVar2;
        }
        synchronized (evk.class) {
            try {
                if (f93353e == null) {
                    f93353e = new evk(true);
                }
                evkVar = f93353e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return evkVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m118286a(StringBuilder sb, ArrayList<C16690a> arrayList, int i) {
        String string = sb.toString();
        arrayList.add(new C16690a(i, string, string));
        sb.setLength(0);
    }

    /* JADX INFO: renamed from: b */
    public ArrayList<C16690a> m118287b(String str) {
        ArrayList<C16690a> arrayList = new ArrayList<>();
        if (this.f93354a && !TextUtils.isEmpty(str)) {
            int length = str.length();
            StringBuilder sb = new StringBuilder();
            int i = 1;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt == ' ') {
                    if (sb.length() > 0) {
                        m118286a(sb, arrayList, i);
                    }
                } else if (cCharAt < 256) {
                    if (i != 1 && sb.length() > 0) {
                        m118286a(sb, arrayList, i);
                    }
                    sb.append(cCharAt);
                    i = 1;
                } else {
                    C16690a c16690aM118289e = m118289e(cCharAt);
                    int i3 = c16690aM118289e.f93355a;
                    if (i3 == 2) {
                        if (sb.length() > 0) {
                            m118286a(sb, arrayList, i);
                        }
                        arrayList.add(c16690aM118289e);
                        i = 2;
                    } else {
                        if (i != i3 && sb.length() > 0) {
                            m118286a(sb, arrayList, i);
                        }
                        i = c16690aM118289e.f93355a;
                        sb.append(cCharAt);
                    }
                }
            }
            if (sb.length() > 0) {
                m118286a(sb, arrayList, i);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public String m118288d(String str) {
        ArrayList<C16690a> arrayListM118287b = m118287b(str);
        StringBuilder sb = new StringBuilder();
        Iterator<C16690a> it = arrayListM118287b.iterator();
        while (it.hasNext()) {
            sb.append(it.next().f93357c);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public final C16690a m118289e(char c) {
        int length;
        byte b;
        C16690a c16690a = new C16690a();
        String string = Character.toString(c);
        c16690a.f93356b = string;
        if (c < 256) {
            c16690a.f93355a = 1;
            c16690a.f93357c = string;
            return c16690a;
        }
        Collator collator = f93352d;
        int iCompare = collator.compare(string, "阿");
        if (iCompare < 0) {
            c16690a.f93355a = 3;
            c16690a.f93357c = string;
            return c16690a;
        }
        int i = 0;
        if (iCompare == 0) {
            c16690a.f93355a = 2;
            length = 0;
        } else {
            iCompare = collator.compare(string, "鿿");
            if (iCompare > 0) {
                c16690a.f93355a = 3;
                c16690a.f93357c = string;
                return c16690a;
            }
            if (iCompare == 0) {
                c16690a.f93355a = 2;
                length = f93350b.length - 1;
            } else {
                length = -1;
            }
        }
        c16690a.f93355a = 2;
        if (length < 0) {
            int length2 = f93350b.length - 1;
            int i2 = 0;
            while (i2 <= length2) {
                length = (i2 + length2) / 2;
                iCompare = f93352d.compare(string, Character.toString(f93350b[length]));
                if (iCompare == 0) {
                    break;
                }
                if (iCompare > 0) {
                    i2 = length + 1;
                } else {
                    length2 = length - 1;
                }
            }
        }
        if (iCompare < 0) {
            length--;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            byte[] bArr = f93351c[length];
            if (i >= bArr.length || (b = bArr[i]) == 0) {
                break;
            }
            sb.append((char) b);
            i++;
        }
        String string2 = sb.toString();
        c16690a.f93357c = string2;
        if (TextUtils.isEmpty(string2)) {
            c16690a.f93355a = 3;
            c16690a.f93357c = c16690a.f93356b;
        }
        return c16690a;
    }

    /* JADX INFO: renamed from: l.evk$a */
    public static class C16690a {

        /* JADX INFO: renamed from: a */
        public int f93355a;

        /* JADX INFO: renamed from: b */
        public String f93356b;

        /* JADX INFO: renamed from: c */
        public String f93357c;

        public C16690a(int i, String str, String str2) {
            this.f93355a = i;
            this.f93356b = str;
            this.f93357c = str2;
        }

        public C16690a() {
        }
    }
}
