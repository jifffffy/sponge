/**
 * Copyright © 2019 spypunk <spypunk@gmail.com>
 *
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file for more details.
 */

package spypunk.sponge

import java.io.File
import java.net.URI

const val WWW_PREFIX = "www."

fun URI.domain(): String? {
    return when {
        host.isNullOrEmpty() -> null
        host.startsWith(WWW_PREFIX) -> host.substring(WWW_PREFIX.length)
        else -> host
    }
}

class SpongeInput(
        val uri: URI,
        val outputDirectory: File,
        val mimeTypes: Set<String>,
        val maxDepth: Int = 1,
        val includeSubdomains: Boolean = false
) {
    val domain = uri.domain()!!
}
