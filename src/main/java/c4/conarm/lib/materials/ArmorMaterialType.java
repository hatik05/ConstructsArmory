/*
 * Copyright (c) 2018 <C4>
 *
 * This Java class is distributed as a part of the Construct's Armory mod.
 * Construct's Armory is open source and distributed under the GNU Lesser General Public License v3.
 * View the source code and license file on github: https://github.com/TheIllusiveC4/ConstructsArmory
 *
 * Some classes and assets are taken and modified from the parent mod, Tinkers' Construct.
 * Tinkers' Construct is open source and distributed under the MIT License.
 * View the source code on github: https://github.com/SlimeKnights/TinkersConstruct/
 * View the MIT License here: https://tldrlegal.com/license/mit-license
 */

package c4.conarm.lib.materials;

import slimeknights.tconstruct.library.tinkering.PartMaterialType;
import slimeknights.tconstruct.library.tools.IToolPart;

public class ArmorMaterialType {

    public static String CORE = "core";
    public static String PLATES = "plates";
    public static String TRIM = "trim";

    public static PartMaterialType core(IToolPart part) {
        return new PartMaterialType(part, CORE);
    }

    public static PartMaterialType trim(IToolPart part) {
        return new PartMaterialType(part, TRIM);
    }

    public static PartMaterialType plating(IToolPart part) {

        return new PartMaterialType(part, PLATES);
    }
}
